
import java.util.Scanner;

public class kodutoo2_hugo {

    public static void main(String[] args) {
        int[] numbrid = newGame();
        int algneM = numbrid[0];
        int algneN = numbrid[1];
        System.out.println("Laual on " + algneM + " tikku.");
        while (algneM != 0) {
            int maxTikkarv = lahutaja(algneM, makeHumanMove(algneM, algneN));
            lahutaja(maxTikkarv, arvutiNumber(algneM, algneN));

        }
    }
    public static int[] newGame() {
        int suurTikk = 0;
        int maxTikk = 0;
        int[] NjaM = new int[2];
        try {
            System.out.println("-----------UUS MÄNG ------------");
            Scanner uuedTikuduued = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võtad lauale?");
            suurTikk = uuedTikuduued.nextInt();
            NjaM[0] = suurTikk;                                           // max tikud laual
            Scanner maxTikkudeArv = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võib max võtta korraga?");
            maxTikk = maxTikkudeArv.nextInt();
            if (maxTikk < 1 && maxTikk > suurTikk) {
                newGame();                                                // ei vasta reeglitele
            }                                                             // siis uuesti
            NjaM[1] = maxTikk;                                            // mitu korraga

        } catch (Exception e) {
            System.out.println("Ei sobi.");
        }
        System.out.println("Tikke on laual " + suurTikk);
        System.out.println("Korraga võib võtta " + maxTikk + " tikku.");
        return NjaM;
    }
    public static int makeComputerMove(int tikukogus, int arvKord) {

        //System.out.println("Arvuti kord võtta!");
        //System.out.println("laual on " + uusTikuKogus + " tikku.");
        return arvutiNumber(tikukogus, arvKord);
    }
    public static int arvutiNumber(int a, int b) {
        // võta 3 tikku              ><
        if (a < 3) {            // kui alla 3 tiku alles
            return (a);       // võta 3 tikku ja võida
        } else {
            return 1;     // kui üle, siis võta 1
        }
    }
    public static int lahutaja(int maxTikuArv, int lahutatav) {
                    //lahutaja( 10 tikku, kirjutatud number
        return maxTikuArv-lahutatav; // lahutab tikud kogusest
    }

    public static int makeHumanMove(int tikkudeArv, int maxArv) {   // mängija function
        int tikuArv = 0;
        try {                                                       // try block NaN vältimiseks
            Scanner numberH = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võtad?");
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
/*  */