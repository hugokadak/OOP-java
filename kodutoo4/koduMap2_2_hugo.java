package kodu4_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class koduMap2_2_hugo {
    public static void main(String[] args) {
        // <>
        maNaenSuTahte();
    }
    static void maNaenSuTahte() {
        try {
            File sisendiAvaja = new File("C:\\Users\\Hugok\\oop-java\\oop-java\\src\\kodu4_hugo\\sisend.txt");
            Scanner sisendiLugeja = new Scanner(sisendiAvaja);
            Map<String, Character> sonadeMap = new HashMap<>();     // täht:sõna typa map
            Map<Character, Integer> mituTahteKoik = new HashMap<>();
            mituTahteKoik.put('k', 0);
            mituTahteKoik.put('p', 0);
            mituTahteKoik.put('t', 0);
            mituTahteKoik.put('r', 0);
            mituTahteKoik.put('s', 0);
            int asd = 0;
            try {
                while (sisendiLugeja.hasNext()) {
                    asd++;
                    String andmed = sisendiLugeja.next();           // iga sõna
                    String andmedMadal = andmed.toLowerCase();      // ei tohi 'S' ja 's' eristada
                    char[] andmedChar = andmedMadal.toCharArray();  // my fav thing
                    for (char ch : andmedChar) {                    // iga sõna char andmecharis
                        if (mituTahteKoik.containsKey(ch)) {        // kui leidub map-is, siis
                            int hetkeseis = mituTahteKoik.get(ch);  // leia hetkeseis numbril
                            mituTahteKoik.put(ch, hetkeseis + 1);   // hetkeseis +1
                        } else {
                            continue;                               // kui ei ole igno tähte
                        }

                    }
                }
            } catch (Exception e) {
                System.out.println("here is problem");
                e.printStackTrace();
            }
            TreeMap<Character, Integer> sorteeritud = new TreeMap<>();  // haha leidsin selle sort viisi
            sorteeritud.putAll(mituTahteKoik);                          // et pane lic map valued treemapi
            System.out.println("letters: " + sorteeritud);
        } catch (FileNotFoundException e) {
            System.out.println("Faili ei leitud, äkki on failiavaja file location vale?");
        }
    }
}
