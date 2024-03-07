package kodu3_hugo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eemaldaSagedaseimNumber {
    public static void main(String[] args) {

        String sampleText = "The years were 1777,1799,1997,1998 and 2007!!!!";      //sampletext
        sagedaseNumEemaldaja(sampleText);                                           //main programm
        //Scanner eemaldatavNumber = new Scanner(System.in);
        //System.out.println("E");

    }
    static String sagedaseNumEemaldaja(String text) {                           // võta input str
        System.out.println("Analüüsin teksti: " + text);                        // kontroll
        /*char[] stringLoendiks = text.toCharArray();                             // tee see char[]
        for (char ch : stringLoendiks) {                                        // for loop tähe haaval
            System.out.println(ch);                                             // kontroll kuidas toCharArray tegeleb

        }
        System.out.print(stringLoendiks);
        return stringLoendiks.toString();*/
        Scanner numbriscanner = new Scanner(text);  // ><
        List<Integer> numbriLoend = new ArrayList<Integer>();           // numbrite list
        System.out.println(numbriLoend);                                // test kontroll
        while (numbriscanner.hasNext()) {                               // scanner
            if (numbriscanner.hasNextInt()) {                           //
                numbriLoend.add(numbriscanner.nextInt());               //
            } else {
                System.out.println("Ei ole number, sain: " + numbriscanner.next());  // test kontroll mis toimps
                // programm ei tööta sest vaja tükeldada stringid veel char-ideks
                // idee -- esiteks tükelda hasnext-iga ja siis sööda see funktsiooni mis tükeldab omakorda
                // sht taku idee, aga äkki mõtled parema välja
            }
        }
        System.out.println(numbriLoend.toString());                     // MIKS SEE EI TÖÖTA AAAAAA
        return numbriLoend.toString();                                  // peaksid tagastama meie arraylisti

    }
}
