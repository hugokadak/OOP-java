package tunni7;

import tunni6.Soiduk;

public class Auto extends Soiduk {
    private String number;
    private int maxKiirus;
    private int hind;
    // <>
    public void setHind() {         //oma meetod hinna määramiseks
        if (maxKiirus < 50) {
            this.hind = 400;
        } else {
            this.hind = 1000;
        }
    }
    public void show() {
        System.out.println("number = " + number + " --- maxKiirus = " + maxKiirus + " --- hind = " + hind);
    }
    public Auto() {System.out.println("uus ato");}  // konstruktor1
}

