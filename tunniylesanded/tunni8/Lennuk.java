package tunni7;

public class Lennuk extends Soiduk {
    private int maxKorgus;
    private int lennuUlatus;
    private int hind;
    private String number;

    public void setHind() {
        if (maxKorgus > 6) {
            this.hind = 500;
        } else if (lennuUlatus < 500) {
            this.hind = 100;
        } else {
            this.hind = 300;
        }
    }
    public void setNumber(String obamna) {
        this.number = obamna;
    }

    public void show() {
        System.out.println("number = " + number + " --- maxKorgus = " + maxKorgus + " --- hind = " + hind);
        System.out.println("lennuUlatus = " + lennuUlatus);
    }

    public String getNumber() {
        return number;
    }
    public int getHind() {
        return this.hind;
    }
    public void setMaxKorgus(int maxKorg) {
        this.maxKorgus = maxKorg;
    }
    public void setLennuUlatus(int lennuUlatus) {
        this.lennuUlatus = lennuUlatus;
    }
    public int getMaxKorgus() {
        return this.maxKorgus;
    }
    public int getLennuUlatus() {
        return this.lennuUlatus;
    }
}
