package kontrolltoo_1_vp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lisatarn {
    public static void main(String[] args) {
        ArrayList<String> soned1 = new ArrayList<>(); // kõikide stringidega
        ArrayList<String> soned3 = new ArrayList<>(); // empty
        soned1.add("abe6");
        soned1.add("bcdff");
        soned1.add("cd");
        soned1.add("12cvsd");
        soned1.add("uuu");

        System.out.println(lisaTarn(soned1));       // print result
    }
    static ArrayList<String> lisaTarn(ArrayList<String> soned) {
        ArrayList<String> soned2 = new ArrayList<>(); // uus array * stringideks
        for (String string:soned) {                     // for loop
            if (string.length() >= 3){                  // kui len üle 3 ss tee mdu igno
                String loigatud1 = string.substring(0, 3);  // substring hea lõikamiseks
                loigatud1 = loigatud1 + "*";                // lisa tärn
                String loigatud2 = string.substring(3); //
                String kokkustring = loigatud1 + loigatud2; // uus string kokku
                //System.out.println(loigatud1);          // kontroll
                soned2.add(kokkustring);                // lisa uude arraysse
            } else {
                continue;                               // igno
            }.charAt
        }
        return soned2;                                  // return new arraylist
    }
}
