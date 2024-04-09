package kodu4_hugo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class kodu3List_hugo {
    public static void main(String[] args) {
        System.out.println("List: " + listRjaS());
    }
    static List<String> listRjaS() {
        List<String> koikRSsonad = new ArrayList<>();
        try {
            // <>|
            File sisendiAvaja = new File("C:\\Users\\Hugok\\oop-java\\oop-java\\src\\kodu4_hugo\\sisend.txt");
            Scanner sisendiLugeja = new Scanner(sisendiAvaja);
            while (sisendiLugeja.hasNext()) {
                String anne = sisendiLugeja.next();             // sona haaval
                String anneM = anne.toLowerCase();              // 7 gucci vööd aga sõne ikka madalal
                char[] anneChar = anneM.toCharArray();          // chaaaaaaaaaaaaaaaaar[]
                if (anneChar[0] == 'r' || anneChar[0] == 's') { // if r or s alguses
                    if (Character.isLetter(anneChar[anneChar.length-1])) {  // kui täht on lõpus
                        koikRSsonad.add(anneM);                 // lisa lõppu
                    } else {                                    // ss on ju koma lõpus
                        String anneSub = anneM.substring(0, anneChar.length-1); // sneaky substring
                        koikRSsonad.add(anneSub);               // add substring
                    }
                }
            }
            Collections.sort(koikRSsonad);                      // epic ultra fast sorter
            // <>
        } catch (FileNotFoundException e) {
            System.out.println("Faili ei leitud, äkki on failiavaja file location vale?");
        }
        return koikRSsonad;
    }
}
