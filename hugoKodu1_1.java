package kodu1;

public class hugoKodu1_1 {
    public static void main(String[] args) {
        String sone = new String("peepeepoo");
        System.out.println(sone);

        kolmkeskmist();

    }
    static void kolmkeskmist() {
        String sone = new String("peepeepoo");
        String uussone1 = new String("pee");
        String uussone2 = new String("pee");
        int slen = sone.length();
        int keskmine = slen / 2;
        if (slen < 2) {
            System.out.println(sone);
        } else if (slen % 2 == 0) {
            uussone1 = sone.substring(sone.length()/2 - 1, sone.length()/2 + 1);
            System.out.println(uussone1);
        } else if (slen % 2 == 1) {
            uussone1 = sone.substring(sone.length()/2 - 1, sone.length()/2 + 2);
            System.out.println(uussone2);
        }
    }
}
