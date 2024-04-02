package tunni7;

import jdk.dynalink.Operation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class leialyhimsona {
    public static void main(String[] args) {

        leialyhjemsona();
        List<Integer> test1 = randomNumGen();
        leiaNum(test1);
    }
    static Optional<String> leialyhjemsona() {
        List<String> massiviminleidja = Arrays.asList("pipi", "pipidgrtherbrtsebtrb", "pirtbtbstbbtbpi", "pidfbtdbdbdbtdbdtbdtbdftbdpi", "pidtbdbtdpi", "ipi", "dtbdbdpipi", "pidtbgdbtdpi");
        Optional<String> test1 = massiviminleidja.stream().min(Comparator.comparingInt(String::length));    // leidsin comparator.comparingInt(String::length) võrdleb kõiki stringe ja nende pikkuseid
        System.out.println("Lühim sõna massiivist: " + test1);                                              // min selle ees jääb aint valikusse väikseim mis on "ipi"

        return test1;
    }

    static List<Integer> randomNumGen() {
        List<Integer> intNumsList = new ArrayList<Integer>();
        int[] intNums = new int[100];       // tühi int[] 100 kohaline
        for (int i = 0; i<100; i++) {
            Random rand = new Random();     // gene 100 suvakat numbrit
            intNums[i] = rand.nextInt(200);
            intNumsList.add(rand.nextInt(200));
        }
        //System.out.println("intNums:");                 // kontroll
        //System.out.println(Arrays.toString(intNums));   // kontroll
        //System.out.println("intNumsList");              // tegelt vajalik stream
        //System.out.println(intNumsList);                //
        return intNumsList;                             // saab leiaNum() kasutada
    }

// [188, 33, 72, 162, 92, 180, 130, 193, 10, 180, 24, 177, 178,
// 102, 33, 164, 58, 179, 192, 154, 61, 173, 67, 181, 176, 32,
// 127, 49, 188, 80, 111, 156, 36, 43, 166, 136, 74, 32, 196, 122,
// 84, 114, 34, 188, 21, 121, 3, 196, 170, 92, 176, 172, 196, 91,
// 85, 51, 192, 168, 145, 141, 91, 118, 164, 181, 131, 89, 165, 35,
// 5, 199, 4, 24, 152, 160, 92, 24, 24, 14, 76, 168, 61, 73, 67, 108,
// 171, 155, 173, 191, 94, 102, 160, 87, 118, 11, 77, 55, 57, 194, 119, 82]
    static void leiaNum(List<Integer> nums) {
        List<Integer> abc = nums.stream()
                .filter(s -> s < 100)   // filtreeri alla 100 väärtused
                .toList();              // java soovitas collect() asemel kasutada seda
        List<String> bca = new ArrayList<>();   //massiiiv
        for (int i = 0; i<abc.toArray().length; i++) {  // for loop lisada kõik num
            Integer numChar = abc.get(i);
            char muudaStr = numChar.toString().charAt(numChar);
            System.out.println(muudaStr);

        }
        System.out.println("numbrite viimased numbrid: " + abc);
    }
}
