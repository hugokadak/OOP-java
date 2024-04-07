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
                // vaja tähtede k, p, t, r, s sagedust(abelit)
                if (andmed.contains("k")) {
                    sonadeMap.put(andmed, 'k');
                    tahteK++;
                } else if (andmed.contains("p")) {
                    sonadeMap.put(andmed, 'p');
                    tahteP++;
                } else if (andmed.contains("t")) {
                    sonadeMap.put(andmed, 't');
                    tahteT++;
                } else if (andmed.contains("r")) {
                    sonadeMap.put(andmed, 'r');
                    tahteR++;
                } else if (andmed.contains("s")) {
                    sonadeMap.put(andmed, 's');
                    tahteS++;
                } else {
                    tahteNO++;
                }
            }
            sisendiLugeja.close();
            System.out.println(sonadeMap.values());
            System.out.println("sonadeMap = " + sonadeMap);
            System.out.println("mitu sõna tähega...     k = " + tahteK + " p = " + tahteP + " t = " + tahteT + " R = " + tahteR + " S = " + tahteS);
            System.out.println("mitu sõna täheta...     " + tahteNO);
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
