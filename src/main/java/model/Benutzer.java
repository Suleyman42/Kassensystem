package model;

import model.Produkte.Produkt;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Benutzer {

    private int id;
    private Rolle rolle;
    private String vorname;
    private String nachname;
    private String benutzername;
    private String passwortHash;
    private boolean arbeitet;
    private boolean inPause;
    private LocalDateTime schichtBeginn;
    private LocalDateTime pauseBeginn;
    private List<Map<Produkt,KorbEintrag>> gesamteVerkauftsProdukt;

    public Benutzer(int id){
        this.id = id;

    }

    public Benutzer(int id, Rolle rolle, String vorname, String nachname, String benutzername, String passwortHash
                   ) {
        this.id = id;
        this.rolle = rolle;
        this.vorname = vorname;
        this.nachname = nachname;
        this.benutzername = benutzername;
        this.passwortHash = passwortHash;

    }



    public List<Map<Produkt,KorbEintrag>> getGesamteVerkauftsProdukt() {
        return gesamteVerkauftsProdukt;
    }

    public void setGesamteVerkauftsProdukt(List<Map<Produkt,KorbEintrag>> gesamteVerkauftsProdukt) {
        this.gesamteVerkauftsProdukt = gesamteVerkauftsProdukt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rolle getRolle() {
        return rolle;
    }

    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswortHash() {
        return passwortHash;
    }

    public void setPasswortHash(String passwortHash) {
        this.passwortHash = passwortHash;
    }

    public boolean isArbeitet() {
        return arbeitet;
    }

    public void setArbeitet(boolean arbeitet) {
        this.arbeitet = arbeitet;
    }

    public boolean isInPause() {
        return inPause;
    }

    public void setInPause(boolean inPause) {
        this.inPause = inPause;
    }

    public LocalDateTime getSchichtBeginn() {
        return schichtBeginn;
    }

    public void setSchichtBeginn(LocalDateTime schichtBeginn) {
        this.schichtBeginn = schichtBeginn;
    }

    public LocalDateTime getPauseBeginn() {
        return pauseBeginn;
    }

    public void setPauseBeginn(LocalDateTime pauseBeginn) {
        this.pauseBeginn = pauseBeginn;
    }
}
