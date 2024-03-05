
import java.util.Random;
import java.util.Scanner;
// ----------------------------------UPDATE -----------------------------
/*
mäng töötab ilusti, käin tööl ära ja siis vaatan kas midagi veel saan lisada
lisapunktide jaoks
main programm töötab

 */
// ----------------------------------UPDATE -----------------------------
public class kodutoo2_hugo {

    public static void main(String[] args) {
        int[] numbrid = newGame();                              // uue mängu array
        int algneM = numbrid[0];                                // max kogus user input
        int algneN = numbrid[1];                                // max korraga user input
        System.out.println("Laual on " + algneM + " tikku.");
        while (algneM != 0) {                                   // while loop kuniks tikke pole

            int maxTikkarv = algneM - makeHumanMove(algneM, algneN);  // inimese move
            algneM = maxTikkarv;                                      // lahutab valitud koguse
            if (algneM == 0) {
                System.out.println("Sa võitsid!! arvutid ei saa kunagi inimestest paremaks!"); // kui peale eemaldamist
                break;                                       // on 0 tikku siis võidad
            }
            int maxTikkarv1 = algneM - makeComputerMove(algneM, algneN);
            algneM = maxTikkarv1;
            if (algneM == 0) {                                  // sama arvutiga
                System.out.println("Arvuti võitis!! kuidas sa arvutile kaotasid??");
                System.out.println("Soovitus: registreeri ennast ! :p");
                System.out.println("https://tartu.ee/et/tartu-linna-munitsipaallasteaiad");
            }
            System.out.println("Lauale on jäänud " + algneM + " tikku.");
        }

        System.out.println("<----------------MÄNG LÄBI ------------------>");
        Scanner uuestiMangida = new Scanner(System.in);         // user input new game?
        System.out.println("");                                 // m t

        System.out.println("Kas sooviksite uuesti mängida? (y / n):");  // küss
        String uusMangYorN;                                         // uue mängu modifier
        uusMangYorN = uuestiMangida.next();
        if (uusMangYorN.equals("y")) {                              // aint y mdu close game
            String[] emptyargs = new String[0];
            main(emptyargs);                                        // boot new game
        } else {
            System.out.println("Mäng sai läbi.");
            System.out.println("");                                 // oof owie my bones
        }
    }
    public static int[] newGame() {
        int suurTikk = 0;                                       // vajalikud initializerid
        int maxTikk = 0;                                        // et muuta neid hiljem
        int[] NjaM = new int[2];
        try {
            String[] emptyarray = new String[0];
            System.out.println("-----------UUS MÄNG ------------");
            Scanner uuedTikuduued = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võtad lauale?");
            suurTikk = uuedTikuduued.nextInt();                           // kõik laual
            if (suurTikk < 1) {
                System.out.println("tikke ei saa olla alla ühe");
                main(emptyarray);
            }
            NjaM[0] = suurTikk;                                           // max tikud laual
            Scanner maxTikkudeArv = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võib max võtta korraga?");
            maxTikk = maxTikkudeArv.nextInt();                            // maksimaal korraga
            if (maxTikk < 1 || maxTikk > suurTikk) {
                System.out.println("Max tikkude arv ei vasta nõuetele");
                System.out.println("Peab olema üle ühe või alla tikkude koguse");
                main(emptyarray);                                                // ei vasta reeglitele
            }                                                             // siis uuesti
            NjaM[1] = maxTikk;                                            // mitu korraga

        } catch (Exception e) {
            System.out.println("Ei sobi.");
        }
        System.out.println("Tikke on laual " + suurTikk);
        System.out.println("Korraga võib võtta " + maxTikk + " tikku.");
        System.out.println("--------------------------------");
        return NjaM;
    }
    public static int makeComputerMove(int tikukogus, int arvKord) {
        return getRandomNumber(1, arvKord);         // random number generator
        /*if (tikukogus == arvKord) {
            return arvKord;                         // sneaky võit
        } else if (tikukogus < arvKord){
            return tikukogus;                       // sneaky võit
        } else {
            return arvKord-1;                       // lahkuse mõttes võtame 1 enne max lubatud
        }*/
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static int makeHumanMove(int tikkudeArv, int maxArv) {   // mängija function
        int tikuArv = 0;
        try {                                                       // try block NaN vältimiseks
            Scanner numberH = new Scanner(System.in);               // user input
            System.out.println("Mitu tikku võtad?");
            tikuArv = numberH.nextInt();
            if (tikuArv > maxArv) {                                 // if kui suurem kui N
                System.out.println("Ei saa nii palju tikke võtta");
                System.out.println("Peab olema vähem kui " + maxArv);
                makeHumanMove(tikkudeArv, maxArv);                  // alusta uuesti
            } else if (tikuArv < 1) {                               // kui vähem kui 1
                System.out.println("ei saa alla ühe olla.");
                makeHumanMove(tikkudeArv, maxArv);
            }
        } catch (Exception e) {                                     // exception NaN jaoks
            System.out.println("Ei ole number");
            makeHumanMove(tikkudeArv, maxArv);
        }
        return tikuArv;
    }
}
/*
    public static int arvutiNumber(int a, int b) {
        // võta 3 tikku              ><
        if (a < 3) {            // kui alla 3 tiku alles
            return (a);       // võta 3 tikku ja võida
        } else {
            return 1;     // kui üle, siis võta 1
        }
    }
            //System.out.println("Arvuti kord võtta!");
        //System.out.println("laual on " + uusTikuKogus + " tikku.");
        //return arvutiNumber(tikukogus, arvKord);
    */