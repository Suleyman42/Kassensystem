package model;

public class KorbEintrag {

    private double menge;
    private double preis;

    public KorbEintrag(double menge, double preis) {
        this.menge = menge;
        this.preis = preis;
    }

    public double getMenge() {
        return menge;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
