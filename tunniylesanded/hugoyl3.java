public class hugoyl3 {
    public static void main(String[] args) {
        int x, y, z, i;

        kordaja();
    }
    static void kordaja() {
        int x = 3;
        int y = 2;
        int z = 5;
        int i = 0;
        while (true) {
            if (y > 50000) break;
            x = x*2+y;
            y = x+y+z;
            System.out.println("~~~~~~~~~~~~~vahejoon~~~~~~~~~~~~~~");
            System.out.println("x on " + x);
            System.out.println("y on " + y);
            System.out.println("protsess toimus " + i + " korda.");
            System.out.println("~~~~~~~~~~~~~vahejoon~~~~~~~~~~~~~~");
            i++;
        }
        System.out.println("saadud arvuks on " + x);
        if (i < 5) {
            System.out.println("Protsess kordus vähem kui 5 korda.");
        } else {
            System.out.println("protsess lõppes kui y ületas 50000.");
        }
    }
}
