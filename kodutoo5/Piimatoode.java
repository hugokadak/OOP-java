package kodu5_hugo;

public class Piimatoode {
         String nimi;
         double hind;
        public String getNimi() { return this.nimi; }
        public double getHind() { return this.hind;}
        public void setNimi(String nimi) { this.nimi = nimi; }
        public void setHind(double hind) { this.hind = hind;}
        public Piimatoode() {}

    public static class Piim extends Piimatoode {
        private String nimi;
        private double hind;
        public Piim() {
            System.out.println("Uus piim");
        }
    }
    public static class Juust extends Piimatoode {
        private String nimi;
        private double hind;
        public Juust() {
            System.out.println("Uus juust");
        }
    }
    public static class Kohupiim extends Piimatoode {
        private String nimi;
        private double hind;
        public Kohupiim() {
            System.out.println("Uus kohupiim");
        }
    }
}
