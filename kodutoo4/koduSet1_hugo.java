package kodu4_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class koduSet1_hugo {
    public static void main(String[] args) {
        // <>
        int b;

        allTheSingleWords();

    }
    static void allTheSingleWords() {
        try {
            Set<String> words = new HashSet<>();       // õige array
            File sisendiAvaja = new File("C:\\Users\\Hugok\\oop-java\\oop-java\\src\\kodu4_hugo\\sisend.txt");
            Scanner sisendiLugeja = new Scanner(sisendiAvaja);
            int mituSonaKont = 0;                               // kont. kas sõnade arv sama
            int mituMuudetavat = 0;
            while (sisendiLugeja.hasNextLine()) {
                String andmed = sisendiLugeja.next();           // järgmine string
                char[] andmeAnne = andmed.toCharArray();        // love char[]
                if (Character.isLetter(andmeAnne[andmeAnne.length-1])) { // 150 iq kas stringis on ,.:;!?
                    words.add(andmed);                 // lisa hashset-i
                    mituSonaKont++;                             // kontroll palju norm sõnu
                } else {
                    String anneSub = andmed.substring(0, andmeAnne.length - 1); // kuna, siis tee substring esimesest kuni eelviinane täht
                    words.add(anneSub);                // lisa hashset-i
                    mituMuudetavat++;                           // neid mida muutma peab
                } // else
            }// while
            sisendiLugeja.close();
            System.out.println("Eemaldatud sõnasid:         " + (mituSonaKont+mituMuudetavat- words.size()));
            System.out.println("Nendest muudeti sõnasid:    " + mituMuudetavat);

            System.out.println("--------------------------------------------");
            mituSonaKont = 0;               // reseti kontrollnum
            for (String str: words) {       // iga sõna väljastada konsoolile
                mituSonaKont++;             // mitmes, et kontrollida
                System.out.println("Set<> hulga element nr " + mituSonaKont + ":    " + str);
            }
        } catch (Exception e) {
            System.out.println("Ei leia faili. Äkki failiavaja path on vale?");
        }
    }
}
