package Loeng7;

import Soidukid.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
// <>

public class Loeng7_hugo_kadak {
    public static void main(String[] args) {
        Soiduk.Auto uusSoiduk = new Soiduk.Auto();
        uusSoiduk.setNumber("AUTO1123ABC");                          //paneme numbri
        ((Soiduk.Auto) uusSoiduk).setHind();                    // hind nulliks
        uusSoiduk.setHind1();                                   // testin
        uusSoiduk.setKiirus(50);                                // paneme kiiruse
        System.out.println("Soiduk 1 number: " + uusSoiduk.getNumber());
        System.out.println("Soiduk 1 algne hind: " + uusSoiduk.getHind() + "€");   // get hind kontroll
        System.out.println("Soiduk 1 max kiirus: " + uusSoiduk.getKiirus() + " km/h"); // kiiruse kont

        System.out.println("");
        Soiduk.Auto uusSoiduk2 = new Soiduk.Auto();
        uusSoiduk2.setNumber("AUTO2420BLZ");                          //paneme numbri
        ((Soiduk.Auto) uusSoiduk2).setHind();                    // hind nulliks
        uusSoiduk2.setHind1();                                   // testin
        uusSoiduk2.setKiirus(70);                                // paneme kiiruse
        System.out.println("Soiduk 2 number: " + uusSoiduk2.getNumber());
        System.out.println("Soiduk 2 algne hind: " + uusSoiduk2.getHind() + "€");   // get hind kontroll
        System.out.println("Soiduk 2 max kiirus: " + uusSoiduk2.getKiirus() + " km/h"); // kiiruse kont

        System.out.println("");
        Soiduk.Paat uusPaat = new Soiduk.Paat();
        uusPaat.setNumber("PAAT1321CBA");                           // number
        uusPaat.setHind();                                     // hind 0
        uusPaat.setHind1();                                    // testin
        uusPaat.setKiirus(8);                                  // kiirus
        uusPaat.setSyvis(0.6);                                 // setSyvis
        System.out.println("Paat 1 number: " + uusPaat.getNumber());
        System.out.println("Paat 1 algne hind: " + uusPaat.getHind() + "€");  // kontroll
        System.out.println("paat 1 max kiirus: " + uusPaat.getKiirus() + " km/h");// kontroll
        System.out.println("Paat 1 syvis: " + uusPaat.getSyvis() + " m");

        Soiduk.Paat uusPaat2 = new Soiduk.Paat();
        uusPaat2.setNumber("PAAT2690KEK");                           // number
        uusPaat2.setHind();                                     // hind 0
        uusPaat2.setHind1();                                    // testin
        uusPaat2.setKiirus(12);                                  // kiirus
        uusPaat2.setSyvis(0.3);                                 // setSyvis
        System.out.println("Paat 2 number: " + uusPaat2.getNumber());
        System.out.println("Paat 2 algne hind: " + uusPaat2.getHind() + "€");  // kontroll
        System.out.println("paat 2 max kiirus: " + uusPaat2.getKiirus() + " km/h");// kontroll
        System.out.println("Paat 2 syvis: " + uusPaat2.getSyvis() + " m");
        // <>
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
        System.out.println(soidukiteMap);
        System.out.println(paatideSyvis);
    }
}
