public class kodutooyl2 {
    public static void main(String[] args) {          // algne initial

        kasasubaaa();                                       // programm
    }
    static void kasasubaaa() {                              // programm
        String sone = new String("abaxaaaxc");
        // etteantud testerid “abaxaaaxc” xxabc “aaabxba”
        String teiselPosits = sone.substring(1, 4);         // sneaky viis lahenduseks
        String neljalPosits = sone.substring(3, 6);         // nii 2. ja 4. subs on alati len 3

        // retrospectis oleks || lihtsam olnud ja substringidega lihtsalt
        // if (essasubstring == aaa ||teinesubstring == aaa) saaks mitte else if
        // aga see ka töötab :D
        if (teiselPosits.contains("aaa")) {
            System.out.println("true");                     // hihi
        } else if (neljalPosits.contains("aaa")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
