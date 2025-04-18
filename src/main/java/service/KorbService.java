package service;

import model.Benutzer;
import model.Korb;
import model.KorbEintrag;
import model.Produkte.Produkt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KorbService {




    public static void verkuaftSpeichern(Benutzer benutzer, Korb korb) {

        benutzer.getGesamteVerkauftsProdukt().add(korb.getProdukts());
        korb.getVerkaufteProdukte().add(korb.getProdukts());
        korb.setProdukts(null);

    }


    public static double berechneGesamtPreis(Korb korb) {


        double gesamtpreis = 0.0;

        for (Map.Entry<Produkt, KorbEintrag> eintrag : korb.getProdukts().entrySet()) {
            Produkt produkt = eintrag.getKey();
            KorbEintrag korbEintrag = eintrag.getValue();

            gesamtpreis += korbEintrag.getMenge() * produkt.getPreis();
        }

        return gesamtpreis;
    }

}








