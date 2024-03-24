package kodu3_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
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
        int mituRidaOnFailis = 0;
        String[] eesnimedAndmed = new String[5];                // string[] et kontrolle teha
        String[] perenimedAndmed = new String[5];
        String[] isikukoodidAndmed = new String[5];             // valideerida isikukood
        String[] palkAndmed = new String[5];                    // valideerida palk
        try {                                                       // try plokk for exceptions
            File inimesteFail = new File(uusFail);                  // find file
            String[] inimeneFail = new String[5];                   // temp string arr inimeste andmete jaoks
            int index = 0;                                          // away from fail
            Scanner scanner = new Scanner(inimesteFail);            // sülitab ridasid
            // <>
            while (scanner.hasNextLine()) {                         // loe iga rida läbi pms
                String tekst = scanner.nextLine();                  // beem bam bop
                inimeneFail[index] = tekst;                         // temp string[] reast 26
                index++;            // kuidas mul see lisamata jäi?? anyways nüüd string[] töötab
                mituRidaOnFailis++;
            }
            // <>
            //String[] eesnimedAndmed = new String[5];                // string[] et kontrolle teha
            //String[] perenimedAndmed = new String[5];
            //String[] isikukoodidAndmed = new String[5];             // valideerida isikukood
            //String[] palkAndmed = new String[5];                    // valideerida palk
            int index2 = 0;
            for (int i = 0; i < inimeneFail.length; i++) {
                String[] eraldiInimene = inimeneFail[i].split("\\|"); // nt // [50104080212, Kuusk, Tanel, 1200]
                eesnimedAndmed[index2] = eraldiInimene[2]; // [Jaak, Tanel, Joosep, 1234567, Piret]
                perenimedAndmed[index2] = eraldiInimene[1]; // [Tamm, Kuusk, Kask, Toomas, Meri]
                isikukoodidAndmed[index2] = eraldiInimene[0]; // [37010102702, 50104080212, 81234442345, Tamm, 00000000001]
                palkAndmed[index2] = eraldiInimene[3]; // [4400, 1200, 300   //vale, 1100      //vale, errr   //vale]
                index2++;
                System.out.println("-------------------- failist leitud inimesed " + index2 + " --------------------");
                System.out.println("Eesnimi:    " + eraldiInimene[2]);
                System.out.println("Perenimi:   " + eraldiInimene[1]);
                System.out.println("Isikukood:  " + eraldiInimene[0]);
                System.out.println("Palk:       " + eraldiInimene[3]);
            }
            System.out.println("--------------- andmete check --------------------");
            System.out.println("eesnimedandmed = " + Arrays.toString(eesnimedAndmed));
            System.out.println("perenimedandmed = " + Arrays.toString(perenimedAndmed));
            System.out.println("isikukoodandmed = " + Arrays.toString(isikukoodidAndmed));
            System.out.println("palkandmed = " + Arrays.toString(palkAndmed));
            System.out.println("--------------- andmete check --------------------");
            System.out.println("--------------- for cycle --------------------");


            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ei leid faili");        // error handling faili puudus
        } catch (Exception e) {
            System.out.println("mingi muu viga");       // error handling misc
        } // <>

        // eesnimedAndmed perenimedAndmed isikukoodidAndmed palkAndmed
        int[] vigasedAndmed = new int[5];
        /* -------------------------------------------------------------------------
        23.03.2024 seis:
        praegu töötab ilusti, runni faili enne töötamist et tuletada meelde mida programm teeb
        siit alumine try catch plokk kirjutab faili ilusti andmeid
        fail asub /oop-java/oop-java idk miks seal mitte kodu3_hugo kaustas
        teha vaja:
        if tingimused kas perenimi on valid
        if tingimused kas eesnimi on valid
        if tingimused kas isikukood on valid
        if tingimused kas palk on valid
        kirjutada teise faili vigaste andmetega read
        teoorias kasutades samat int array kus leiab kas anne on valid indexi kaudu lisada
        uued andmed teise faili
        ------------------------------------------------------------------------- */

        try {
            FileWriter failiKirjutaja = new FileWriter("valjund1.txt");
            for (int i = 0; i < mituRidaOnFailis; i++) {
                failiKirjutaja.write("Perenimi:     " + perenimedAndmed[i] + "\n");
                failiKirjutaja.write("Eesnimi:      " + eesnimedAndmed[i] + "\n");
                failiKirjutaja.write("Isikukood:    " + isikukoodidAndmed[i] + "\n");
                failiKirjutaja.write("Palk:         " + palkAndmed[i] + "\n");
                failiKirjutaja.write("\n");
                failiKirjutaja.write("\n");
            }
            failiKirjutaja.close();
        } catch (Exception e) {
            System.out.println("Error: miski läks valesti aga programm ei tea mis (heh)");
        }


        b = b + " num 69";
        return b;
    }
    /*static void convert(String sisendfail, String valjund1, String valjund2) {
        try {
            File valjund1fail = new File("valjund1.txt");

        } catch (Exception e) {
            System.out.println("Error: miski läks valesti aga programm ei tea mis (heh)");
        }
    }*/
}
