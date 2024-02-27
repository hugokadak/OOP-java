package tunni4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;

public class hugoyl1 {
    public static void main(String[] args) {

        ylesanne1();
    }
    static void ylesanne1() {
         try {
            BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\Student\\IdeaProjects\\ooploeng1\\src\\tunni4\\in1.txt"));
            String line = rd.readLine();
            int i = 0;
            while (line != null) {
                i++;                    // simple counter 1 võrra
                line = rd.readLine(); // loe järgmist rida
                //System.out.println(line); ridade lugemise testimiseks
                if (i == 4) {
                    System.out.println(line);
                }
            }
            // System.out.println(i); kontrollisin i väärtust sellega
            if (i < 4) {
                System.out.println("Nii palju ridu ei ole!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("faili pole"); // kui fail ei eksisteeri
        } catch (IOException e) {
            e.printStackTrace(); // vajalik bufferedreaderi try catch jaoks
        }
    }
}
