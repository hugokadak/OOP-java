package tunni5;

import java.util.ArrayList;
import java.util.Map;

public class yl2_hugo {
    public static void main(String[] args) {
        String[] numbrid = {"üks", "kaks", "kolm",
                "kaks", "neli", "üks", "viis", "kaks",
                "kolm", "neli", "viis", "üks", "üks", "kaks"};
        vordlusedMap(numbrid);
    }

    static void vordlusedMap(String[] arr) {
        int arrayPikkus = arr.length;
        ArrayList<Character> tahtedeList = new ArrayList<Character>(1);;
        for (int i = 0; i < arrayPikkus; i++) {
            String antudSona = arr[i];
            char taht = antudSona.charAt(0);
            //System.out.println(taht);
            tahtedeList.add(taht);
        }
        System.out.println(tahtedeList);
        int mituÜ = 0;
        int mituK = 0;
        int mituN = 0;
        int mituV = 0;
        for (int i = 0; i < arrayPikkus; i++) {
            char leitavtäht = tahtedeList[i];
            if (leitavtäht == "ü") {

            }
        }
    }
}
