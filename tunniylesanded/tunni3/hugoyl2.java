package tunni3;

import java.util.Scanner;
import java.util.Arrays;

public class hugoyl2 {
    public static void main(String[] args) {
        int massiivipikkus;
        numbriKontrollija();
        numbriArvaja(numbriTest);
    }
    public int numbriKontrollija() {
        Scanner userArv = new Scanner(System.in);
        System.out.println("Sisesta täisarv vahemikus 1-6");
        int numbriTest = userArv.nextInt();
        while (true) {
            if (userArv.hasNextInt()) {
                if (numbriTest < 6 && numbriTest >= 1) {
                    System.out.println("Numbriks sai: " + numbriTest);
                    break;
                } else {
                    System.out.println("number ei ole vahemikus 1-6");
                }
            } else {
                String temp = userArv.next();
                System.out.println("fake number -> " + temp);
            }
        }
        return numbriTest;
    }
    public numbriArvaja() {
        Scanner massiiviNumber = new Scanner(System.in);
        int[] massiiv = new int[6];

        for (int i=0; i<massiiv.length; i++) {
            System.out.println("Sisesta number masiivi: ");
            massiiv[i] = userArv.nextInt();
        }
        System.out.println("numbrite massiiviks sai. " + Arrays.toString(massiiv));
    }
}
