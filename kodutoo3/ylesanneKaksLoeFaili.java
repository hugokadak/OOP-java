package kodu3_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ylesanneKaksLoeFaili {
    public static void main(String[] args) {
        int b = 69;
        // not good, ei saa faili avada kui just main directoryt mitte avades :p
        String sisendfail = "C:/Users/Hugok/oop-java/oop-java/src/kodu3_hugo/inimesed.txt";                             // sisendfail, pidin txt sest ta paljalt ei loe
        loeFailiJaPrindi(sisendfail);                               // funktsioon
    }
    static String loeFailiJaPrindi(String uusFail) {                // uusFail on faili nimi stringina
        String b = "le funny";
        try {                                                       // try plokk for exceptions
            File inimesteFail = new File(uusFail);                  // find file
            Scanner scanner = new Scanner(inimesteFail);            // read file w scanner
            while (scanner.hasNextLine()) {                         // while true essentially
                String tekst = scanner.nextLine();                  // järka rida
                System.out.println(tekst);                          // kirjuta kontrollimiseks
                tekst.split("(|)");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ei leid faili");
        }
        return b;
    }
}
