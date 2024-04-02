package tunni7;

import tunni6.Auto;
import tunni6.Paat;

import java.util.HashMap;
import java.util.Map;
// <>

public class Loeng8_hugo_kadak {
    public static void main(String[] args) {
        Auto uusSoiduk = new Auto();
        uusSoiduk.setNumber("AUTO1123ABC");                          //paneme numbri
        uusSoiduk.setHind();                    // hind nulliks
        //uusSoiduk.setHind1();                                   // testin
        uusSoiduk.setKiirus(50);                                // paneme kiiruse
        System.out.println("Soiduk 1 number: " + uusSoiduk.getNumber());
        System.out.println("Soiduk 1 algne hind: " + uusSoiduk.getHind() + "€");   // get hind kontroll
        System.out.println("Soiduk 1 max kiirus: " + uusSoiduk.getKiirus() + " km/h"); // kiiruse kont

        System.out.println("");
        Auto uusSoiduk2 = new Auto();
        uusSoiduk2.setNumber("AUTO2420BLZ");                          //paneme numbri
        uusSoiduk2.setHind();                    // hind nulliks
        //uusSoiduk2.setHind1();                                   // testin
        uusSoiduk2.setKiirus(70);                                // paneme kiiruse
        System.out.println("Soiduk 2 number: " + uusSoiduk2.getNumber());
        System.out.println("Soiduk 2 algne hind: " + uusSoiduk2.getHind() + "€");   // get hind kontroll
        System.out.println("Soiduk 2 max kiirus: " + uusSoiduk2.getKiirus() + " km/h"); // kiiruse kont

        System.out.println("");
        Paat uusPaat = new Paat();
        uusPaat.setNumber("PAAT1321CBA");                           // number
        uusPaat.setHind();                                     // hind 0
        uusPaat.setHind1();                                    // testin
        uusPaat.setKiirus(8);                                  // kiirus
        uusPaat.setSyvis(0.6);                                 // setSyvis
        System.out.println("Paat 1 number: " + uusPaat.getNumber());
        System.out.println("Paat 1 algne hind: " + uusPaat.getHind() + "€");  // kontroll
        System.out.println("paat 1 max kiirus: " + uusPaat.getKiirus() + " km/h");// kontroll
        System.out.println("Paat 1 syvis: " + uusPaat.getSyvis() + " m");

        Paat uusPaat2 = new Paat();
        uusPaat2.setNumber("PAAT2690KEK");                           // number
        uusPaat2.setHind();                                     // hind 0
        uusPaat2.setHind1();                                    // testin
        uusPaat2.setKiirus(12);                                  // kiirus
        uusPaat2.setSyvis(0.3);                                 // setSyvis
        System.out.println("Paat 2 number: " + uusPaat2.getNumber());
        System.out.println("Paat 2 algne hind: " + uusPaat2.getHind() + "€");  // kontroll
        System.out.println("paat 2 max kiirus: " + uusPaat2.getKiirus() + " km/h");// kontroll
        System.out.println("Paat 2 syvis: " + uusPaat2.getSyvis() + " m");

        Lennuk uusLennuk1 = new Lennuk();
        uusLennuk1.setNumber("69");
        uusLennuk1.setLennuUlatus(400);
        uusLennuk1.setMaxKorgus(5);
        uusLennuk1.setHind();
        System.out.println("Lennuk1 number: " + uusLennuk1.getLennuUlatus());
        System.out.println("Lennuk1 lennuUlatus: " + uusLennuk1.getLennuUlatus());
        System.out.println("Lennuk1 maxKorgus: " + uusLennuk1.getMaxKorgus());
        System.out.println("Lennuk1 hind: " + uusLennuk1.getHind());

        Lennuk uusLennuk2 = new Lennuk();
        uusLennuk2.setLennuUlatus(600);
        uusLennuk2.setMaxKorgus(5);
        uusLennuk2.setHind();
        System.out.println("Lennuk2 lennuUlatus: " + uusLennuk2.getLennuUlatus());
        System.out.println("Lennuk2 maxKorgus: " + uusLennuk2.getMaxKorgus());
        System.out.println("Lennuk2 hind: " + uusLennuk2.getHind());
        // <>
        //Map<String, Soiduk> soidukitemapNEW = new HashMap<String, Soiduk>();
        //soidukitemapNEW.put(uusLennuk1.getNumber(), );
        Map<String, Integer> soidukiteMap = new HashMap<String, Integer>();
        soidukiteMap.put(uusSoiduk.getNumber(), uusSoiduk.getHind());
        soidukiteMap.put(uusSoiduk.getNumber(), uusSoiduk.getKiirus());
        soidukiteMap.put(uusSoiduk2.getNumber(), uusSoiduk2.getHind());
        soidukiteMap.put(uusSoiduk2.getNumber(), uusSoiduk2.getKiirus());

        soidukiteMap.put(uusPaat.getNumber(), uusPaat.getHind());
        soidukiteMap.put(uusPaat.getNumber(), uusPaat.getKiirus());
        soidukiteMap.put(uusPaat2.getNumber(), uusPaat2.getHind());
        soidukiteMap.put(uusPaat2.getNumber(), uusPaat2.getKiirus());
        Map<String, Double> paatideSyvis = new HashMap<String, Double>();
        paatideSyvis.put(uusPaat.getNumber(), uusPaat.getSyvis());
        paatideSyvis.put(uusPaat2.getNumber(), uusPaat2.getSyvis());

        soidukiteMap.put(uusLennuk1.getNumber(), uusLennuk1.getLennuUlatus());
        soidukiteMap.put(uusLennuk1.getNumber(), uusLennuk1.getMaxKorgus());
        soidukiteMap.put(uusLennuk1.getNumber(), uusLennuk1.getHind());

        soidukiteMap.put(uusLennuk2.getNumber(), uusLennuk2.getLennuUlatus());
        soidukiteMap.put(uusLennuk2.getNumber(), uusLennuk2.getMaxKorgus());
        soidukiteMap.put(uusLennuk2.getNumber(), uusLennuk2.getHind());

        System.out.println(soidukiteMap);
        System.out.println(paatideSyvis);
    }
}
