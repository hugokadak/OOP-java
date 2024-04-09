package kodu4_hugo;

import com.sun.source.tree.Tree;

import java.util.*;

import static kodu4_hugo.kodu3List_hugo.listRjaS;

public class kodu4Oma_hugo {
    public static void main(String[] args) {
        // <>   |
        List<String> rjasSonad = listRjaS();                // reuse ülesanne 3 sest laisk
        omaValikKonteiner(rjasSonad);
    }
    static void omaValikKonteiner(List<String> listike) {
        Map<String, Integer> mapTest = new HashMap<>();     // map et sona, mitukorda
        for (String str: listike) {                         // loop list add all
            if (mapTest.containsKey(str)) {                 // kui juba on olemas, siis
                int number = mapTest.get(str);              // leia selle current väärtus
                mapTest.put(str, number + 1);               // lisa sellele +1
            } else {                                        // ei ole ss
                mapTest.put(str, 0);                        // lisa mappi 0-ga
            }                                               // me otsime ikka mitu korda neid on
        }
        Map<String, Integer> vahepeatusNullEemaldus = new HashMap<>();   // map for element removal
        for (Map.Entry<String, Integer> sonaVillak : mapTest.entrySet()) {
            String sonaEemaldatav = sonaVillak.getKey();                // leia see string key
            int numberEemaldatav = sonaVillak.getValue();               // leia string value
            if (numberEemaldatav > 0 ) {                                // kui value üle 1 lisa uude
                vahepeatusNullEemaldus.put(sonaEemaldatav, numberEemaldatav);
            }
        }
        Map<String, Integer> viisKoigeKoige = new HashMap<>();      // treemap fun (also sorts good)
        TreeMap<String, Integer> theRejects = new TreeMap<>();
        String[] randomijaoks = new String[5];
        int index = 0;
        for (Map.Entry<String,Integer> pair: vahepeatusNullEemaldus.entrySet()) {
            String sone = pair.getKey();            // sõne
            int numb = pair.getValue();             // tema korduste arv
            if ( numb > 1) {                        // stupid ass sorting system
                viisKoigeKoige.put(sone, numb);     // proovisin stx aga ikka
            } else {                                // ei tööta
                theRejects.put(sone, numb);         // pms kui kordus üle 1 lisa viiskoigekoige
                randomijaoks[index] = sone;
                index++;
            }                                       // else lisa rejects
        }
        Random rand = new Random();                 // random
        int randomNumGen = rand.nextInt(theRejects.size());     // dumbass idee
        viisKoigeKoige.put(randomijaoks[randomNumGen], 1);      // god kui dumb
        System.out.println("viisKoigeKoige " + viisKoigeKoige);
    }
}
