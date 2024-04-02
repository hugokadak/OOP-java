package Soidukid;

public class Soiduk {
    String number;          //setNumber() jaoks
    int maxKiirus;          //setKiirus() jaoks
    int hind;               //getHind() määrab 0-ks
    public String getNumber() {
        return this.number;                        // idk
    }
    public void setNumber(String number) {
        this.number = number;                 //setNumber() jaoks
    }
    public int getKiirus() {
        return maxKiirus;                     // du du du du max verstappen
    }
    public void setKiirus(int maxKiirus) {
        this.maxKiirus = maxKiirus;          //setKiirus() jaoks
    }
    public void setHind() {
        this.hind = 0;                      // setHind() määrab 0-ks
    }
    public int getHind() {                  // getHind tagastab hinna
        return this.hind;
    }
    public Soiduk() {}
    public static class Auto extends Soiduk {
        private String number;
        private int maxKiirus;
        private int hind;
        // <>
        public void setHind1() {         //oma meetod hinna määramiseks
            if (maxKiirus < 50) {
                this.hind = 400;
            } else {
                this.hind = 1000;
            }
        }
        public Auto() {System.out.println("uus ato");}  // konstruktor1
    }

    public static class Paat extends Soiduk {
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
    }

}
