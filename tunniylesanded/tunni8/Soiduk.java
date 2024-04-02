package tunni7;

public abstract class Soiduk {
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
    public abstract void setHind();         // abstract setHind()
    public int getHind() {                  // getHind tagastab hinna
        return this.hind;
    }
    public abstract void show();        // abstract show()
    public Soiduk() {
    }
    public void setMaxKorgus(int a) {

    }
}
