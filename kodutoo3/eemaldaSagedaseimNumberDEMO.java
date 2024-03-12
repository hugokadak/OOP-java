package kodu3_hugo;

import java.util.*;

public class eemaldaSagedaseimNumberDEMO {
    public static void main(String[] args) {
        String sampleText = "The years were 1777,1799,1997,1998 and 2007!!!!";      //sampletext
        String sampleText2 = "trrkrt kpsstVVrqqKKt !!!!!!!!!!!!";                   //sampletext2
        //demoPlayer(sampleText);
        // ---------------- change here ------------------
        int tagastatudNum = demoPlayer(sampleText);
        // vaheta demoPlayer(sampleText) et programmi korrektset tööd vaadata
        // vaheta demoPlayer(sampleText2) et erindit ilma arvudeta vaadata
        if (tagastatudNum == 404) {
            System.out.println("Veateade!");
        } else {
            eemaldaSagedaseimNumberver2(sampleText, tagastatudNum);
            // vaheta eemaldaSagedaseimNumberver2(sampleText, tagastatudNum) et programmi korrektset tööd vaadata
            // vaheta eemaldaSagedaseimNumberver2(sampleText2, tagastatudNum) et erindit ilma arvudeta vaadata
        }
        // ---------------- end of change -----------------
    }
    // <>
    static int demoPlayer(String lamptekst) {
        int naljakasNum = 69;

        System.out.println("Analüüsin teksti:   " + lamptekst);
        String numbridAint = lamptekst.replaceAll("[^0-9]", "");    // regex, eemaldab kõik mis pole number 0-9
        System.out.println("numbrid aint:       " + numbridAint);                    // kontroll println
        String[] numbridLahti = numbridAint.split("(?!^)");                   // hehe funny
        System.out.println("NumbridLahti len:   " + numbridLahti.length);           // vaatamiseks
        if (numbridLahti.length == 1) {
            System.out.println("Kahjuks ei tuvastanud sõnes numbreid.");
            System.out.println("------- exiting -------");
            int veateade = 404;
            return veateade;
        } else {
            System.out.println("tükeldatud numbrid: " + Arrays.toString(numbridLahti));
            int[] koikNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};             // kõikide leitavate nr array
            int[] mituXNum = new int[10];                               // 0-9 arvude frequency

            for (int i = 0; i < numbridLahti.length; i++) {
                int currentNum = Integer.parseInt(numbridLahti[i]);     // jada String to Integer
                for (int j = 0; j < 10; j++) {
                    if (currentNum == j) {
                        // kui currentNum on sama mis index 0-9 (ehk j) siis liida jadas
                        // mituXNum indeksi j üks
                        mituXNum[j] += 1;
                    }
                }
            }
            System.out.println("koikNum:            " + Arrays.toString(koikNum));
            System.out.println("mituXNum loop:      " + Arrays.toString(mituXNum));
            int maxWynn = 0;
            int currentMax = 0;
            for (int i = 0; i < mituXNum.length; i++) {
                if (mituXNum[i] > maxWynn) {
                    maxWynn = i;
                }
            }
            System.out.println("Suurim freq nr:     " + maxWynn);
            System.out.println("------- complete -------");
            return maxWynn;
        }
    }
    // <>
    static String eemaldaSagedaseimNumberver2(String text, int suurimNum) {
        String b = "69";
        String suurimString = String.valueOf(suurimNum);
        String[] textToChArr = text.split("(?!^)");
        //System.out.println("Tükeldatult:        " + Arrays.toString(textToChArr));

        int mituEmpty = 0;
        for (int i=0; i < textToChArr.length; i++) {
            if (Objects.equals(textToChArr[i], suurimString)) {
                textToChArr[i] = "";
                mituEmpty++;
            }
        }
        // <>
        //System.out.println("peale for loop:     " + Arrays.toString(textToChArr));
        String[] noFreqNumChArr = new String[textToChArr.length-mituEmpty];     // lühem "" kohtadest

        int uusIndex = 0;                                                       // ei teki null obj arraysse
        for (int i = 0; i < textToChArr.length; i++) {
            if (Objects.equals(textToChArr[i], "")) {                       // sneaky viis kuidas ignoda tühju
                continue;
            }
            noFreqNumChArr[uusIndex] = textToChArr[i];                          // uue array index peab tühja prst väiksem olema
            uusIndex++;
        }
        //System.out.println("noFreqNumChArr:     " + Arrays.toString(noFreqNumChArr));       // kontroll
        //System.out.println("noFreqNumChArr len: " + noFreqNumChArr.length);                 // kontroll
        String tagastatavString = String.join("", noFreqNumChArr);   // kuidas mul sellega nii kaua aega võttis ?
        //System.out.println("viimane string:     " + tagastatavString);                      //kontroll
        System.out.println("Eemaldatult num " + suurimNum + ":  " + tagastatavString);
        System.out.println("------- complete -------");
        return tagastatavString;
    }
}
