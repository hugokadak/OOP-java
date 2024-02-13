package tunni2;

public class hugoyl1 {
    public static void main(String[] args) {
        int[] numbrid;                                  // vajalik? mby
        int pikkus;                                     // igaks juhuks
        massiivikorrutaja();
    }
    static void massiivikorrutaja() {                   // main func
        int[] numbrid = {3, 5, 8, 10};                  // massiiv, numbreid sees saab muuta
        int pikkus = numbrid.length;                    // massiivi pikkus
        if (pikkus == 1) {                              // pikkus lihtustab neid tingimusi
            System.out.println(numbrid[0]);
        } else if (pikkus == 0) {                       // ka seda
            System.out.println("0");
        } else {
            int korrutaja1 = numbrid[1];                // teine number; array algab 0-st
            int korrutaja2 = numbrid[pikkus-1];         // viimane
            int vastus = korrutaja1 * korrutaja2;
            System.out.println(vastus);                 // väljasta vastus
        }
    }
}
