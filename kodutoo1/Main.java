
public class Main {
    public static void main(String[] args) {

        kolmkeskmist(); // käivitab funktsiooni mis lahendab ülesannet

    }
    static void kolmkeskmist() {
        String sone = new String("test234se");   // algne sõne millest võtab keskelt
        System.out.println(sone);                       // väljasta see
        String uussone1 = new String("test");    // muudetav sõne
        int slen = sone.length();                       // sone pikkus
        int keskmine = slen / 2;                        // len pooleks et saada keskmist
        if (slen < 2) {                                 // alla 2 siis terve sõne
            System.out.println(sone);
        } else if (slen % 2 == 0) {                     // paarisarv siis 2 tähte
            uussone1 = sone.substring(sone.length()/2 - 1, sone.length()/2 + 1);
            System.out.println(uussone1);
        } else if (slen % 2 == 1) {                     // paaritu siis 3 tähte
            uussone1 = sone.substring(sone.length()/2 - 1, sone.length()/2 + 2);
            System.out.println(uussone1);
        }
    }
}
