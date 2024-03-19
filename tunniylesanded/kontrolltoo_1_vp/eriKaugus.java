package kontrolltoo_1_vp;

public class eriKaugus {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println(eriKaugus1(1, 2, 3));
    }
    static boolean eriKaugus1(int a, int b, int c) {
        int aa = 2; // 1, 2, 3
        int bb = 2; // 1, 2, 3
        int cc = 10; // 9, 10, 11
        boolean kaksSama = false;
        boolean uksErinev = false;
        for (int i = 0; i < 2; i++) {
            if (a == b || a == b-1 || a-1 == b) {
                System.out.println("a ja b on samad");
                kaksSama = true;
                break;
            } else if (b == c || b == c-1 || b-1 == c) {
                System.out.println("b ja c on samad");
                kaksSama = true;
                break;
            } else if (c == a || c == a-1 || c-1 == a) {
                System.out.println("a ja c on samad");
                kaksSama = true;
                break;
            }
        }
        for (int i = 0; i<9; i++) {
            if (kaksSama) {
                if (a != b && a != b-1 && a-1 != b) {
                    uksErinev = true;
                    System.out.println("a ja b ei ole samad");
                    break;
                } else if(b != c && b != c-1 && b-1 != c) {
                    uksErinev = true;
                    System.out.println("b ja c ei ole samad");
                    break;
                } else if(a != c && a != c-1 && a-1 != c) {
                    uksErinev = true;
                    System.out.println("a ja c ei ole samad");
                    break;
                }
            }
        }
        if (kaksSama && uksErinev) {
            return true;
        } else {
            return false;
        }
    }
}
