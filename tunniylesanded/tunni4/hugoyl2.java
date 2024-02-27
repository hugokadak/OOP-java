package tunni4;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class hugoyl2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Student\\IdeaProjects\\ooploeng1\\src\\tunni4\\in3.txt");
        try {
            List<String> lines = Files.readAllLines(path); // loe kõik read loeng5_2022 bdoc
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ylesanne2();
    }
    static void ylesanne2() {
        Path path2 = Paths.get("C:\\Users\\Student\\IdeaProjects\\ooploeng1\\src\\tunni4\\in3.txt");
        try {
            Scanner scanner = new Scanner(path2); // scannib faili
            PrintWriter writer = new PrintWriter("C:\\Users\\Student\\IdeaProjects\\ooploeng1\\src\\tunni4\\out.txt"); // kirjutab faili
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt()); // lisab iga täisarvu tekstfaili
                } else {
                    scanner.next();
                }
            }
            writer.close(); // sulgeb faili
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }
        Path path = Paths.get("C:\\Users\\Student\\IdeaProjects\\ooploeng1\\src\\tunni4\\out.txt");
        try {
            System.out.println("Saadud täisarvud, failis out.txt:"); // ettehoiatav
            List<String> numbriread = Files.readAllLines(path); // ja tegin 2x seda aga ma ei oska paremini
            System.out.println(numbriread);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
