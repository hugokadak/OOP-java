package kodu4_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class koduMap2_hugo {
    public static void main(String[] args) {
        // <>
        maNaenSuTahte();
    }
    static void maNaenSuTahte() {
        try {
            File sisendiAvaja = new File("C:\\Users\\Hugok\\oop-java\\oop-java\\src\\kodu4_hugo\\sisend.txt");
            Scanner sisendiLugeja = new Scanner(sisendiAvaja);
            Map<String, Character> sonadeMap = new HashMap<>();     // täht:sõna typa map
            int tahteK = 0;
            int tahteP = 0;
            int tahteT = 0;
            int tahteR = 0;
            int tahteS = 0;
            int tahteNO = 0;
            while (sisendiLugeja.hasNextLine()) {
                String andmed = sisendiLugeja.next();               // anne
                String andmedLow = andmed.toLowerCase();
                // vaja tähtede k, p, t, r, s sagedust(abelit)
                if (andmedLow.contains("k")) {
                    sonadeMap.put(andmed, 'k');
                    tahteK++;
                } else if (andmedLow.contains("p")) {
                    sonadeMap.put(andmed, 'p');
                    tahteP++;
                } else if (andmedLow.contains("t")) {
                    sonadeMap.put(andmed, 't');
                    tahteT++;
                } else if (andmedLow.contains("r")) {
                    sonadeMap.put(andmed, 'r');
                    tahteR++;
                } else if (andmedLow.contains("s")) {
                    sonadeMap.put(andmed, 's');
                    tahteS++;
                } else {
                    tahteNO++;
                }
            }
            sisendiLugeja.close();
            System.out.println(sonadeMap.values());
            System.out.println("sonadeMap = " + sonadeMap);
            System.out.println("mitu sõna tähega...     k = " + tahteK + " p = " + tahteP + " t = " + tahteT + " r = " + tahteR + " s = " + tahteS);
            System.out.println("mitu sõna täheta...     " + tahteNO);

            // k = 17 p = 23 t = 178 r = 52 s = 68
            Map<Character, Integer> tahtedeKordus = new HashMap<>();    // tegelik mida vajati
            tahtedeKordus.put('k', 0);
            tahtedeKordus.put('p', 0);
            tahtedeKordus.put('t', 0);
            tahtedeKordus.put('r', 0);
            tahtedeKordus.put('s', 0);      // although see teeb selle lihtsamaks
            //tahtekordusFinal: {p=22, r=46, s=35, t=102, k=16}
            for (Map.Entry<String, Character> mapiAnne : sonadeMap.entrySet()) {
                char sonaKey = mapiAnne.getValue();         // Map-i essa element Character
                int taheKordArv = tahtedeKordus.get(sonaKey);   // mis on current state tahe numbril?
                char[] sonaChar = mapiAnne.getKey().toCharArray();  // my fav
                for (char ch:sonaChar) {
                    tahtedeKordus.put(sonaKey, taheKordArv + 1);    // liida key väärtusele 1
                }
                System.out.println("tahtedekordus seis: " + tahtedeKordus);
            }
            System.out.println("tahtekordusFinal: " + tahtedeKordus);

            /*---------------------------------------------
            TEHTUD:
            tee char map sonadega, ja leia mitu neid esineb

            TO DO:
            tükelda kõik tähega sõnad, et mitu korda neid esineb siis lõpuks
            tekita mby uus hashmap sellega, et esinemissageduse kahanevat järtsi teha
            ---------------------------------------------*/
        } catch (FileNotFoundException e) {
            System.out.println("Faili ei leitud, äkki on failiavaja file location vale?");
        }
    }
}
