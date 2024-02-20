package kodu1;
import java.util.*;
import java.io.*;

public class hugokodu1_4 {
    public static void main(String[] args) {

        massiiviNumbrid();
    }
    static void massiiviNumbrid() {
        String[] massiiv= {"auto", "motikas", "buss", "reka"}; // massiiv
        int pikkus = massiiv.length;
        if (pikkus > 3) {
            String temp = massiiv[pikkus-2];                   // buss
            String temp2 = massiiv[pikkus-1];                    // reka
            massiiv[pikkus-2] = temp2;
            massiiv[pikkus-1] = temp;
            System.out.println(Arrays.toString(massiiv));
        } else {
            System.out.println("massiivi on liiga lühike.");
        }

    }
}
