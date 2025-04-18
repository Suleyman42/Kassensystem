package model.Produkte;

public class ProduktEigenschaft {
    private int id;
    private String name;

    public ProduktEigenschaft(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
