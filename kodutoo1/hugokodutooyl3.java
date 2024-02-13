public class hugokodutooyl3 {
    public static void main(String[] args) {
        int[] massiiv;
        int yksarv, n;

        numbrileidja();
    }
    static void numbrileidja() {
        int[] massiiv = {3,2,1,4,55,2,1,9,0,2};
        int a = 0;
        for (int i=0; i < massiiv.length; i++) {
            int n = 41;
            if (massiiv[i] == n) {
                a++;
            }
        }
        System.out.println(a);
    }
}
