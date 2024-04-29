package kodu5_hugo;

import java.util.*;

public class yl1_hugo {
    class Person {
        String eesnimi;
        String perenimi;
        int synniaasta;
        String[] eesnimesahtel = {"Karl", "Mari", "Jüri", "Henri", "Andres", "Pässa Riks", "Valdis", "Sauna-Madis"};
        String[] perenimedesahtel = {"Kask", "Kadak", "Neandertallane", "Helme", "Ratas", "Raudpolt", "Vargamäe"};

        String[] synniaastasahtel = {"1970", "1984", "2001", "1969", "2005", "1994", "1999", "2010"};
    }
    // <>
    public static void main(String[] args) {
        printer(snitch(), konteiner());
    }
    static List<String[]> konteiner() {
        List<String[]> vangla = new ArrayList<>();              // so far mu lemmik old
        vangla.add(new String[]{"Hugo", "Banan", "1984"});     // 1
        vangla.add(new String[]{"Henri", "Banaanimees", "2001"});
        vangla.add(new String[]{"Raino", "Banaanipuu", "1969"});
        vangla.add(new String[]{"Jaan", "Banaan", "1999"});     // 4
        vangla.add(new String[]{"August", "Banaanimaa", "1738"});
        vangla.add(new String[]{"Uko", "Banaan", "6942"});
        vangla.add(new String[]{"Karl", "Janaan", "1984"});
        vangla.add(new String[]{"Andres", "Vargamäe", "1984"});     // 8
        return vangla;
    }
    static String snitch() {
        String perenimiStr = " ";
        try {
            Scanner leitavPerenimi = new Scanner(System.in);        // input row
            System.out.println("Sisesta leitav perenimi: ");
            perenimiStr = leitavPerenimi.nextLine();
            if (!perenimiStr.matches("[A-Za-zõöäü]+")) {         // conditions
                System.out.println("Vigane input. Ei saa jätkata '" + perenimiStr + "'-ga."); // oof
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Sisestus on vale.");                // try catch et vigase puhul error ei tekiks
        }
        return perenimiStr;
    }
    static void printer(String perenimi, List<String[]> vangid) {
        int secretNum = 0;                              // kui üle 1 siis ei prindi
        String vangUppCase = perenimi.substring(0, 1).toUpperCase() + perenimi.substring(1);
        // üleval muudab inputi suure algus tahega kasutades kahte substringi
        for (String[] rida: vangid) {                   // iterate over all
            if (Objects.equals(rida[1], vangUppCase)) {    // if match print
                System.out.println(rida[0] + " " + rida[1] + ", " + rida[2]);
                secretNum++;                            // eemaldab viimase console.log-i
            }
        }
        if (secretNum == 0) {
            System.out.println("Ei leitud sellise perenimega andmeid.");
        }
    }
}
