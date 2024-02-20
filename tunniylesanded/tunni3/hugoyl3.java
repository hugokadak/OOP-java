package tunni3;

import java.util.Scanner;

public class hugoyl3 {
    public static void main(String[] args) {

        samadTekstid();
    }
    static void samadTekstid() {
        Scanner essaSisend = new Scanner(System.in);        // essa tekst
        System.out.println("Sisesta esimene tekst: ");
        String tekst1 = essaSisend.nextLine();
        Scanner teineSisend = new Scanner(System.in);       // teine tekst
        System.out.println("Sisesta teine tekst: ");
        String tekst2 = teineSisend.nextLine();

        System.out.println(tekst1.equals(tekst2)); // on samad?
    }
}
