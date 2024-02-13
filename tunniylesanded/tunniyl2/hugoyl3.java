package tunni2;

public class hugoyl3 {
    public static void main(String[] args) {
        int nr1, nr2, nr3;
        int[] intArray;
        massiivjarjest();
    }
    static void massiivjarjest() {
        int[] intArray = {1, 3, 2, 5, 6, 7, 8};
        int arraySize = intArray.length; // pikkus vaja for tsükliks
        boolean trueOrFalse = false; // boolean sest tsükkel muidu kordab outputi konsooli
        for (int i=0; i < arraySize-2; i++) { // kontrollib kõik väärtused läbi
            int nr1 = intArray[i];
            if (intArray[i] == intArray[i+1]-1 && intArray[i+1] == intArray[i+2]-1) {
                // if (nr1 == nr2-1) ehk nt (3 == 4-1) && (nr2 == nr3-1) nt (4 == 5-1)
                trueOrFalse = true;
                //System.out.println("tõene"); // testimiseks printer
            } else {
                //System.out.println("väär"); // kontrollib ka tsükli kaupa outputtides
                trueOrFalse = false;
            }
        }
        System.out.println(trueOrFalse);
    }
}
