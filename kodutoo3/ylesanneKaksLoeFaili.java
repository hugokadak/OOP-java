package kodu3_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
// <>
public class ylesanneKaksLoeFaili {
    public static void main(String[] args) {
        int b = 69;                                                 // the funny number
        // not good, ei saa faili avada kui just main directoryt mitte avades :p
        String sisendfail = "C:/Users/Hugok/oop-java/oop-java/src/kodu3_hugo/inimesed.txt";                             // sisendfail, pidin txt sest ta paljalt ei loe
        loeFailiJaPrindi(sisendfail);                               // funktsioon
    }
    // <>
    static String loeFailiJaPrindi(String uusFail) {                // uusFail on faili nimi stringina
        String b = "le funny";

        try {                                                       // try plokk for exceptions
            String tempNimi = "hugo";                               // test string[] selle kaudu koik andmed lisada
            String TempPere = "hugo";
            String isikuKood = "691337";
            String palk = "nu bagadi palk";
            File inimesteFail = new File(uusFail);                  // find file
            String[] inimeneFail = new String[5];                   // temp string arr inimeste andmete jaoks
            int index = 0;                                          // away from fail
            Scanner scanner = new Scanner(inimesteFail);            // sülitab ridasid
            // <>
            while (scanner.hasNextLine()) {                         // loe iga rida läbi pms
                String tekst = scanner.nextLine();                  // beem bam bop
                System.out.println(tekst);                          // kontroll mis tekib
                inimeneFail[index] = tekst;                         // temp string[] reast 26
                //String[] andmed = tekst.split("|");               // split ei tööta, ja see dumbass püstkriips ei tööta ka
            }
            for (int i = 0; i < inimeneFail.length; i++) {          // uus int testides kas saab
                String[] eraldiInimene = inimeneFail[i].split("");  // iga arr osa splittida char-ideks
                System.out.println(Arrays.toString(eraldiInimene));       // nah ei tööta saadab null errori
            }                                                             // nullpointerexception inimeneFail[i] is null
            /*

            int indexInFail = 0;
            Scanner scanner = new Scanner(inimesteFail);            // read file w scanner
            while (scanner.hasNextLine()) {                         // while true essentially
                String tekst = scanner.nextLine();                  // järka rida
                System.out.println(tekst);                          // kirjuta kontrollimiseks


                String[] andmed = tekst.split("|");           // not working
                System.out.println(Arrays.toString(andmed));        // kontroll
                isikuKood = "Isikukood:         " + andmed[0];
                TempPere = "Perekonnanimi:      " + andmed[1];
                tempNimi = "Nimi:               " + andmed[2];
                palk = "Palk:                   " + andmed[3];
                System.out.println(TempPere);
                System.out.println(tempNimi);
                System.out.println(isikuKood);
                System.out.println(palk);
                System.out.println("");
                inimeneFail[indexInFail] = TempPere;    // witnessi geniaalsust lisades terve teksti stringiks
                */
            //}
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ei leid faili");
        }
        return b;
    }
}
