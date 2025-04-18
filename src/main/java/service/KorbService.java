package service;

import model.Benutzer;
import model.Korb;
import model.KorbEintrag;
import model.Produkte.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KorbService {




    public static void verkaufAbschliessen(Benutzer benutzer, Korb korb) {

        Map<Produkt, List<KorbEintrag>> verkaufProdukt = benutzer.getVerkaufProdukt();
        List<Map<Produkt,KorbEintrag>> gesamteVerkaufP = korb.getVerkaufteProdukte();

        for (Map.Entry<Produkt, KorbEintrag> eintrag : korb.getProdukts().entrySet()) {
            Produkt produkt = eintrag.getKey();
            KorbEintrag korbEintrag = eintrag.getValue();

            verkaufProdukt.putIfAbsent(produkt, new ArrayList<>());
            verkaufProdukt.get(produkt).add(korbEintrag);


        }
        gesamteVerkaufP.add(korb.getProdukts());
        korb.getProdukts().clear();
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








