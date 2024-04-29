package kodu5_arve_hugo;

import kodu5_hugo.Piimatoode;

import java.text.DecimalFormat;
import java.util.*;

public class Arve {
    String kliendinimi;
    static int arveNumber;
    static List<Integer> arveteKogu = new ArrayList<>();
    public static void main(String[] args) {

        // <>
        String kliendinimi;         // klient
        Map<Piimatoode, Double> tellimusearve = new HashMap<>(); // tellimusearve
        lisa(tellimusearve);
        System.out.println("Kogu summaks arvel sain: " + leiakoguSumma(tellimusearve) + "€");
        maksa(tellimusearve);
    }
    static void maksa(Map<Piimatoode, Double> arve) {
        System.out.println("--------------------------");
        System.out.println("----   ARVE MAKSTUD   ----");
        System.out.println("--------------------------");
        System.out.println("------TOOTE NIMEKIRI------");
        for (Map.Entry<Piimatoode, Double> toode : arve.entrySet()) {
            System.out.println("-- 4 " + toode.getKey().getNimi() + " " + toode.getValue() + "€");
        }
        arveNumber = (int)(Math.random() * 1000000);
        arveteKogu.add(arveNumber);
        System.out.println("--------------------------");
        System.out.println("-------ARVE NUMBER--------");
        System.out.println("----      " + arveNumber + "      ----");
        System.out.println("--------------------------");
    }
    static String leiakoguSumma(Map<Piimatoode, Double> suurtellimus) {
        double kogusumma = 0;
        for (Map.Entry<Piimatoode, Double> toode : suurtellimus.entrySet()) {
            kogusumma = kogusumma + toode.getValue();       // iga map obj value liida
        }
        DecimalFormat numFormat = new DecimalFormat("#.##");    // decimalformat
        String uuscoolNum = numFormat.format(kogusumma);    // miks format kui stringiks lol
        return uuscoolNum;
    }

    public static void lisa(Map<Piimatoode, Double> koguArve) {
        Piimatoode esimenetoode = tootelisaja("juust"); // "eesti juust"
        Piimatoode teinetoode = tootelisaja("piim");    // kilepiim
        Piimatoode kolmastoode = tootelisaja("kohupiim");   // kohust piim
        koguArve.put(esimenetoode, arvutakoguhind(esimenetoode, 4));  //{eesti juust=33.08}
        koguArve.put(teinetoode, arvutakoguhind(teinetoode, 4));    //{kile piim=2.36}
        koguArve.put(kolmastoode, arvutakoguhind(kolmastoode, 4));   //{vanilje kohupiim=18.4}
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
    static double arvutakoguhind(Piimatoode toode, int kogus) {
        String tootenimi = toode.getNimi();     // Juust Piim Kohupiim
        double tootehindkokku = toode.getHind() * kogus;   // 8.27€/kg 0.59€/l 4.6€/kg
        System.out.println("Arvele lisatud: " + tootenimi + " hinnaks " + tootehindkokku + "€");
        return tootehindkokku;
    }
    void setKlient(String nimi) { kliendinimi = nimi;}
    String klient() { return kliendinimi;}
    }


