package tunni7;

import tunni6.Soiduk;

public class Paat extends Soiduk {
        private double syvis;                           //priv double
        private int hind;                               // hind
        private int maxKiirus;                          // maxKiirus
        private String number;                          // number
        public double getSyvis() {                      // get meetod
            return syvis;
        }
        public void setSyvis(double syvis) {            // set meetod
            this.syvis = syvis;
        }
        public void show() {
            System.out.println("number = " + number + " --- maxKiirus = " + maxKiirus + " --- hind = " + hind);
            System.out.println("syvis = " + syvis);
        }

    public Paat() {System.out.println("uus pat");} // konstruktor1
        public Paat(String number) {
            this.number = number;                      // konstruktor2
        }
        public void setHind1() {                        // hinnamääraja
            if (syvis < 0.5) {
                this.hind = 100;
            } else if (maxKiirus < 10) {
                this.hind = 300;
            } else {
                this.hind = 1500;
            }
        }
        public int getHind() {
            return this.hind;
        }
}
