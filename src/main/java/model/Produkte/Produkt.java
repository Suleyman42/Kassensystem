package model.Produkte;

import java.util.List;
import java.util.Map;

public class Produkt {

    private int artkNum;
    private String name;
    private String beschreibung;
    private int gram;
    private Map<Mehl, Double> mehlMischung;
    private List<ProduktEigenschaft> produktEigenschafts;
    private List<Zutat> zutatens;
    private ProduktKategorie produktKategorie;
    private double preis;

    public Produkt(int artkNum,String name,double preis){
        this.artkNum = artkNum;
        this.name = name;
        this.preis = preis;
    }

    public Produkt(int artkNum,String name, String beschreibung, int gram, Map<Mehl, Double> mehlMischung, List<ProduktEigenschaft> produktEigenschafts, List<Zutat> zutatens, ProduktKategorie produktKategorie, double preis) {
        this.artkNum = artkNum;
        this.beschreibung = beschreibung;
        this.gram = gram;
        this.mehlMischung = mehlMischung;
        this.produktEigenschafts = produktEigenschafts;
        this.zutatens = zutatens;
        this.produktKategorie = produktKategorie;
        this.preis = preis;
    }

    public int getArtkNum() {
        return artkNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtkNum(int artkNum) {
        this.artkNum = artkNum;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public Map<Mehl, Double> getMehlMischung() {
        return mehlMischung;
    }

    public void setMehlMischung(Map<Mehl, Double> mehlMischung) {
        this.mehlMischung = mehlMischung;
    }

    public List<ProduktEigenschaft> getProduktEigenschafts() {
        return produktEigenschafts;
    }

    public void setProduktEigenschafts(List<ProduktEigenschaft> produktEigenschafts) {
        this.produktEigenschafts = produktEigenschafts;
    }

    public List<Zutat> getZutatens() {
        return zutatens;
    }

    public void setZutatens(List<Zutat> zutatens) {
        this.zutatens = zutatens;
    }

    public ProduktKategorie getProduktKategorie() {
        return produktKategorie;
    }

    public void setProduktKategorie(ProduktKategorie produktKategorie) {
        this.produktKategorie = produktKategorie;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
