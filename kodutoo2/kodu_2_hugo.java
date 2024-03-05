package kodu2_hugo;
import java.util.Scanner;

public class kodu_2_hugo {

    public static void main(String[] args) {
        int M = 10;
        int N = 3;
        makeComputerMove lahutatav = new makeComputerMove();
        while (M != 0) {
            System.out.println("Laual on " + M + " tikku.");
            lahutaja(M, makeHumanMove(M, N));
            lahutaja(M, arvutiNumber());
        }
    }
    // siia all on funktsioon mis peaks fetchima arvuti liigutuse ja returnima selle numbri
    // ülevalpool lahutaja(M, arvutinumber()) jaoks, kuid mul raskusi seda func ümber tõsta
    // ja nagu makecomputermove-ile saata asi koos väärtustega, muidu vajaks see kogu aeg
    // deklareerimist

    // also vaata kas saad makecomputermove faili tõsta siia üle, siis ei pea jebima selle sitaga
    public static int arvutiNumber() {
        makeComputerMove arvutiNumber1 = new makeComputerMove();
        int a = makeComputerMove.arvutiNumber(int a, int b);
        return a;
    }
    public static int lahutaja(int maxTikuArv, int lahutatav) {
        System.out.println("lahutan");
        return maxTikuArv-lahutatav;
    }

    public static int makeHumanMove(int tikkudeArv, int maxArv) {   // mängija function

        int tikuArv = 0;
        try {                                                       // try block NaN vältimiseks
            Scanner numberH = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võtad? ");
            tikuArv = numberH.nextInt();
            if (tikuArv > maxArv) {                                 // if kui suurem kui N
                System.out.println("Ei saa nii palju tikke võtta");
                makeHumanMove(tikkudeArv, maxArv);                  // alusta uuesti
            } else if (tikuArv < 1) {                               // kui vähem kui 1
                System.out.println("ei");
                makeHumanMove(tikkudeArv, maxArv);
            }
        } catch (Exception e) {                                     // exception NaN jaoks
            System.out.println("Ei ole number");
            makeHumanMove(tikkudeArv, maxArv);
        }
        return tikuArv;
    }
}
 /*   public static int inimNumber(int asd) {
        int number = 0;
        return number;
    }
    public static class makeComputerMove {
        public static void main(String[] args) {
            // int a = 16; int b = 3;
            System.out.println("Arvuti kord võtta!");
            int uusTikuKogus = arvutiNumber(16, 3);
            System.out.println("laual on " + uusTikuKogus + " tikku.");
        }
        public static int arvutiNumber(int a, int b) {
            // võta 3 tikku              ><
            if (a < 3) {
                return (a-b);
            } else {
                return (a-b+1);
            }
        }
    }
}*/