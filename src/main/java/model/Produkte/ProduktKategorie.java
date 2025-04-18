package model.Produkte;

public class ProduktKategorie {
    private int id;
    private String name;

    public ProduktKategorie(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}