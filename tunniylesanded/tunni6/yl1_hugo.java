package tunni5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class yl1_hugo {
    public static void main(String[] args) {
        int[] massiiv = {5, 202, 345, 66, 3, 5, 78, 3, 341, 51, 2, 3444, 499};                          //(5,202,345,66,3,5,78,3,341,51,2,3444,499)
        arvuJagaja(massiiv);
    }                                           //

    static void arvuJagaja(int[] massiv) {
        ArrayList<Integer> vaiksedArvudArrList = new ArrayList<Integer>(5);
        ArrayList<Integer> suuredArvudArrList = new ArrayList<Integer>(5);
        int arrayPikkus = massiv.length;                    // massiivi pikkus for loop
        for (int i = 0; i < arrayPikkus; i++) {
            if (massiv[i] > 100) {                          // suurem kui 100
                int leitavArv = massiv[i];                  // massiivi i indexi arv
                suuredArvudArrList.add(leitavArv);          // lisa arraylisti
                //System.out.println(suuredArvudArrList);     // test kontroll
            } else if (massiv[i] < 100) {
                int leitavArv = massiv[i];
                vaiksedArvudArrList.add(leitavArv);
                //System.out.println(suuredArvudArrList);     // test kontroll
            }
        }
        System.out.println("unsorted suured: " + suuredArvudArrList); // output suur
        Collections.sort(vaiksedArvudArrList);                        // sorteeri väiksed
        System.out.println("sorted väiksed: " + vaiksedArvudArrList); // output väike
    }
}