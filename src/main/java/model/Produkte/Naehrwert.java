package model.Produkte;

public class Naehrwert {
    private double energieKcal;
    private double fett;
    // davon gesättigte Fettsäuren
    private double dgFett;
    private double kohlenhydrate;
    private double davonZucker;
    private double eiweiss;
    private double salz;
    private double ballaststoffe;

    public Naehrwert(double energieKcal, double fett, double dgFett, double kohlenhydrate,
                     double davonZucker, double eiweiss, double salz, double ballaststoffe) {
        this.energieKcal = energieKcal;
        this.fett = fett;
        this.dgFett = dgFett;
        this.kohlenhydrate = kohlenhydrate;
        this.davonZucker = davonZucker;
        this.eiweiss = eiweiss;
        this.salz = salz;
        this.ballaststoffe = ballaststoffe;
    }

    public double getEnergieKcal() {
        return energieKcal;
    }

    public void setEnergieKcal(double energieKcal) {
        this.energieKcal = energieKcal;
    }

    public double getFett() {
        return fett;
    }

    public void setFett(double fett) {
        this.fett = fett;
    }

    public double getDgFett() {
        return dgFett;
    }

    public void setDgFett(double dgFett) {
        this.dgFett = dgFett;
    }

    public double getKohlenhydrate() {
        return kohlenhydrate;
    }

    public void setKohlenhydrate(double kohlenhydrate) {
        this.kohlenhydrate = kohlenhydrate;
    }

    public double getDavonZucker() {
        return davonZucker;
    }

    public void setDavonZucker(double davonZucker) {
        this.davonZucker = davonZucker;
    }

    public double getEiweiss() {
        return eiweiss;
    }

    public void setEiweiss(double eiweiss) {
        this.eiweiss = eiweiss;
    }

    public double getSalz() {
        return salz;
    }

    public void setSalz(double salz) {
        this.salz = salz;
    }

    public double getBallaststoffe() {
        return ballaststoffe;
    }

    public void setBallaststoffe(double ballaststoffe) {
        this.ballaststoffe = ballaststoffe;
    }
}
