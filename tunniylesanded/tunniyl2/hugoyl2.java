package tunni2;

public class hugoyl2 {
    public static void main(String[] args) {
        String essasone, teinesone;

        stringcentipede();
    }
    static void stringcentipede() {
        String essasone = new String("banananannananana");         // string1, muudetav
        String teinesone = new String("bbatman");        // string2, muudetav
        int pikkus1 = essasone.length();                       // pikkus vaja viimase tähe jaoks
        int pikkus2 = teinesone.length();                      // - || -
        if (teinesone.isEmpty()) {                      // tühja tingimus
            System.out.println(essasone);
        } else if (essasone.charAt(pikkus1-1) == teinesone.charAt(0)) { // essa lõpp ja teise algus sama
            String vastus = new String();                      // vastuse string
            vastus = essasone.substring(0, essasone.length()-1) + teinesone.substring(1);
            System.out.println(vastus);                        // output vastus
        } else {
            String vastus = essasone + teinesone.substring(1);
            System.out.println(vastus);
        }
    }
}
