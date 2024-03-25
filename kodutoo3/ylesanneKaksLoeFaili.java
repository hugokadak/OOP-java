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
        String sisendfail = "C:/Users/Hugok/oop-java/oop-java/src/kodu3_hugo/inimesed.txt"; // sisendfail, pidin txt sest ta paljalt ei loe
        String valjund1 = "valjund1.txt";
        String valjund2 = "valjund2.txt";
        loeFailiJaPrindi(sisendfail, valjund1, valjund2);                               // funktsioon
    }
    // <>
    static String loeFailiJaPrindi(String uusFail, String valjund1, String valjund2) {                // uusFail on faili nimi stringina
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
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ei leid faili");        // error handling faili puudus
        } catch (Exception e) {
            System.out.println("mingi muu viga");       // error handling misc
        } // <>

        // eesnimedAndmed perenimedAndmed isikukoodidAndmed palkAndmed
        System.out.println("");
        System.out.println("--------------- vigade kontroll --------------------");
        int[] vigasedAndmed = new int[5];
        int viganeIndex = 0;

        for (String str : eesnimedAndmed) {         //kontroll kas eesnimed on korrektsed
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (!Character.isLetter(c)) {
                    vigasedAndmed[viganeIndex] +=1;     // int[] kus on vigase anne index
                    break;                              // tulevikus kasulik et panna faili õiged

                } else {
                    // ära tee midagi
                }
            }
            viganeIndex++;
        }
        //System.out.println("Vigased eesnime andme indexid vigasedAndmed = " + Arrays.toString(vigasedAndmed));

        int[] perevigasedAndmed = new int[5];
        int pereviganeIndex = 0;
        for (String str : perenimedAndmed) {         //kontroll kas perenimed on korrektsed
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (!Character.isLetter(c)) {
                    perevigasedAndmed[pereviganeIndex] +=1;     // int[] kus on vigase anne index
                    break;                              // tulevikus kasulik et panna faili õiged

                } else {
                    // ära tee midagi
                }
            }
            pereviganeIndex++;
        }
        //System.out.println("Vigased perenime andme indexid perevigasedAndmed = " + Arrays.toString(perevigasedAndmed));

        int[] isikukoodAndmed = new int[5];
        int isikukoodIndex = 0;
        // <>
        try {
            for (String isikukood : isikukoodidAndmed) {         //kontroll kas isikukood on korrektsed
                char[] isikukooddigits = isikukood.toCharArray();
                if (isikukooddigits.length != 11) {             // kontroll kas pikkus 11
                    isikukoodAndmed[isikukoodIndex] += 1;
                }
                for (int i = 0; i<isikukooddigits.length; i++) {
                    if (Character.isDigit(isikukood.charAt(i))) {
                        // ära tee midagi
                    } else {                                    // kui char ei ole digit ss +1
                        isikukoodAndmed[isikukoodIndex] += 1;
                        break;
                    }
                }
                isikukoodIndex++;
            }
            //System.out.println("Vigased isikukoodi andme indexid isikukoodAndmed = " + Arrays.toString(isikukoodAndmed));

        } catch (Exception e) {
            isikukoodAndmed[isikukoodIndex] += 1;
        }

        int[] veapalgaAndmed = new int[5];
        int palgaIndex = 0;
        for (String str : palkAndmed) {         //kontroll kas palk on korrektsed
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (!Character.isDigit(c)) {
                    veapalgaAndmed[palgaIndex] +=1;     // int[] kus on vigase anne index
                    break;                              // tulevikus kasulik et panna faili õiged

                } else {
                    continue;                           // ära tee midagi
                }
            }
            palgaIndex++;
        }
        //System.out.println("Vigased palga andme indexid veapalgaAndmed = " + Arrays.toString(veapalgaAndmed));
        int[] vigasedandmedKokku = new int[5];
        // <>
        // vigasedAndmed perevigasedAndmed isikukoodAndmed veapalgaAndmed
        for (int i = 0; i < 5; i++) {
            if (vigasedAndmed[i] != 0) {
                vigasedandmedKokku[i]++;                            // odav viis kuda valesid andmeid leida
            }
            if (perevigasedAndmed[i] != 0) {
                vigasedandmedKokku[i]++;
            }
            if (isikukoodAndmed[i] != 0) {
                vigasedandmedKokku[i]++;
            }
            if (veapalgaAndmed[i] != 0) {
                vigasedandmedKokku[i]++;
            }
        }
        System.out.println("Vigased andmete indexid vigasedAndmedKokku = " + Arrays.toString(vigasedandmedKokku));
        for (int i = 0; i < 5; i++) {
            if (vigasedandmedKokku[i] != 0) {
                System.out.println("Leidsime " + (i + 1) + ". realt " + vigasedandmedKokku[i] + " vigase(-id) sisendi(-eid).");
            }
        }
        System.out.println("--------------- vigade kontroll --------------------");
        try {
            FileWriter failiKirjutaja = new FileWriter(valjund1);
            FileWriter vigaseFailiKirjutaja = new FileWriter(valjund2);
            int vigasteandmeteIndexKontrolliks = 0;
            int valjund1ridaarv = 0;
            int valjund2ridaarv = 0;
            for (int i = 0; i < mituRidaOnFailis; i++) {
                if (vigasedandmedKokku[vigasteandmeteIndexKontrolliks] == 0) {
                    valjund1ridaarv++;
                    failiKirjutaja.write("Perenimi:     " + perenimedAndmed[i] + "\n");
                    failiKirjutaja.write("Eesnimi:      " + eesnimedAndmed[i] + "\n");
                    failiKirjutaja.write("Isikukood:    " + isikukoodidAndmed[i] + "\n");
                    failiKirjutaja.write("Palk:         " + palkAndmed[i] + "\n");
                    failiKirjutaja.write("\n");
                    failiKirjutaja.write("\n");
                } else {
                    valjund2ridaarv++;
                    vigaseFailiKirjutaja.write("Perenimi:     " + perenimedAndmed[i] + "\n");
                    vigaseFailiKirjutaja.write("Eesnimi:      " + eesnimedAndmed[i] + "\n");
                    vigaseFailiKirjutaja.write("Isikukood:    " + isikukoodidAndmed[i] + "\n");
                    vigaseFailiKirjutaja.write("Palk:         " + palkAndmed[i] + "\n");
                    vigaseFailiKirjutaja.write("\n");
                    vigaseFailiKirjutaja.write("\n");
                    }
                vigasteandmeteIndexKontrolliks++;
            }
            vigaseFailiKirjutaja.close();
            failiKirjutaja.close();
            System.out.println("");
            System.out.println("Loodud fail " + valjund1 + " " + valjund1ridaarv + " töötaja andmetega.");
            System.out.println("Loodud fail " + valjund2 + " " + valjund2ridaarv + " töötaja andmetega.");

        } catch (Exception e) {
            System.out.println("Error: miski läks valesti aga programm ei tea mis (heh)");
        }
        b = b + " num 69";
        return b;
    }
}
