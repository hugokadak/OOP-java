package kodu5_arve_hugo;

import kodu5_hugo.Piimatoode;

import java.util.*;

public class Arvestaja {
    public static void main(String[] args) {
        // <>
        Map<Piimatoode, Double> tellimus = new HashMap<>();                 // arve
        Arve tellimusearve = new Arve();
        tellimusearve.setKlient("Hugo");
        // -----------------------------------------
        /*
        TEHTUD: teeb toote ja lisa() mis arvutab koguse hinna
        to do: lisa tooted mingisse list/mapi see listOfProducts
        double leiaKoguSumma();
        int leiaArveNr();
        leia järgmine arvenum int leiaJargmine()
        meetod maksa();

        */
        // -----------------------------------------
        Piimatoode esimenetoode = tootelisaja("juust"); // "eesti juust"
        Piimatoode teinetoode = tootelisaja("piim");    // kilepiim
        Piimatoode kolmastoode = tootelisaja("kohupiim");   // kohupiim
        lisa(tootelisaja("juust"), 4);         //{eesti juust=33.08}
        lisa(tootelisaja("piim"), 4);          //{kile piim=2.36}
        lisa(tootelisaja("kohupiim"), 4);      //{vanilje kohupiim=18.4}
        //tellimus.put(juusttellitav.getNimi(), lisa(juusttellitav, 4).get(juusttellitav.getNimi()));
        System.out.println(tellimus);
        //  "eesti juust", "hind*kogus"
    }
    public static Piimatoode tootelisaja(String toode) {
        if (Objects.equals(toode, "juust")) {
            Piimatoode.Juust juusttellitav = new Piimatoode.Juust();        // haiphaip töötab
            juusttellitav.setNimi("eesti juust");
            juusttellitav.setHind(8.27);
            return juusttellitav;
        } else if(Objects.equals(toode, "piim")) {
            Piimatoode.Piim piimtellitav = new Piimatoode.Piim();        // piimatoode
            piimtellitav.setNimi("kile piim");
            piimtellitav.setHind(0.59);
            return piimtellitav;
        } else if (Objects.equals(toode, "kohupiim")) {
            Piimatoode.Kohupiim kohupiimtellitav = new Piimatoode.Kohupiim(); // kohupiim
            kohupiimtellitav.setNimi("vanilje kohupiim");
            kohupiimtellitav.setHind(4.6);
            return kohupiimtellitav;
        } else {
            System.out.println("Toodet ei eksisteeri.");
            Piimatoode fakeproduct = new Piimatoode();
            return fakeproduct;
        }

    }
    static List<Double> lisa(Piimatoode toode, int kogus) {
        String tootenimi = toode.getNimi();     // Juust Piim Kohupiim
        double tootehindkokku = toode.getHind() * kogus;// 8.27€/kg 0.59€/l 4.6€/kg
        List<Double> koguhinnad = new ArrayList<>();
        koguhinnad.add(tootehindkokku);
        System.out.println("Arvele lisatud: " + tootenimi + " hinnaks " + tootehindkokku + "€");
        return koguhinnad;
    }

}

