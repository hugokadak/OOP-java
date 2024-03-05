package kodu2_hugo;

public class makeComputerMove {
    public static void main(String[] args) {
        // int a = 16; int b = 3;
        System.out.println("Arvuti kord võtta!");
        int uusTikuKogus = arvutiNumber(16, 3);
        System.out.println("laual on " + uusTikuKogus + " tikku.");
    }
    public static int arvutiNumber(int a, int b) {
        // võta 3 tikku              ><
        if (a < 3) {
            return (a-b);
        } else {
            return (a-b+1);
        }
    }
}
