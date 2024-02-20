package tunni3;
import java.util.Scanner;

public class hugoyl1 {
    public static void main(String[] args) {
        int number;

        sajaarvaja();
    }
    static void sajaarvaja() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Sisesta number: ");

        String sisestatudNum = inputNumber.nextLine();
        int number = Integer.valueOf(sisestatudNum);
        if (number > 100) {
            System.out.println("Suurem kui 100.");
        } else if (number < 100) {
            System.out.println("Väiksem kui 100.");;
        } else if (number == 100) {
            System.out.println("Täpselt 100!");
        }
    }
}
