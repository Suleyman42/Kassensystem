package model;

import model.Produkte.Produkt;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Korb {

    // kodiere untere felder in Benutzer

    private List<Map<Produkt, KorbEintrag>> verkaufteProdukte;
    private  Map<Produkt, KorbEintrag> produkts;
    private double menge = 1;




    public Korb() {


    }


    public void hinzufugen(Produkt produkt,Double menge){


        if (produkts.isEmpty()){
            produkts.put(produkt,new KorbEintrag(getMenge(), produkt.getPreis()));
            setMenge(1);

        } else if (produkts.containsKey(produkt)) {

                KorbEintrag eintrag = produkts.get(produkt);
                double neueMenge = eintrag.getMenge()+menge;
                produkts.put(produkt,new KorbEintrag(neueMenge, produkt.getPreis()));

                setMenge(1);

        } else if (!produkts.containsKey(produkt)) {
            produkts.put(produkt,new KorbEintrag(getMenge(), produkt.getPreis()));
            setMenge(1);

        }


    }

    public double getMenge() {
        return menge;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    private void entfernen(Produkt produkt,double menge){

        if (!produkts.isEmpty()){
            produkts.remove(produkt);

        }



    }

    public void druckeProdukte(){

        if (produkts.isEmpty()) {
            System.out.println("Der Warenkorb ist leer.");

        }

        System.out.println("Produkte im Warenkorb:");
        for (Map.Entry<Produkt, KorbEintrag> eintrag : produkts.entrySet()) {
            Produkt produkt = eintrag.getKey();
            KorbEintrag korbEintrag = eintrag.getValue();

            System.out.println("Produkt: " + produkt.getName());
            System.out.println("Menge: " + korbEintrag.getMenge());
            System.out.println("Preis pro Stück: " + produkt.getPreis());
            System.out.println("Gesamtpreis: " + (korbEintrag.getMenge() * produkt.getPreis()));
            System.out.println("------------------------");
        }




    }


    public List<Map<Produkt, KorbEintrag>> getVerkaufteProdukte() {
        return verkaufteProdukte;
    }

    public void setVerkaufteProdukte(List<Map<Produkt, KorbEintrag>> verkaufteProdukte) {
        this.verkaufteProdukte = verkaufteProdukte;
    }

    public  Map<Produkt, KorbEintrag> getProdukts() {
        return produkts;
    }

    public  void setProdukts(Map<Produkt, KorbEintrag> produkts) {
        this.produkts = produkts;
    }
}
