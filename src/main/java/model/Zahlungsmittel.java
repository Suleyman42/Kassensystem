package model;

public enum Zahlungsmittel {

    CENT_1(0.01),
    CENT_2(0.02),
    CENT_5(0.05),
    CENT_10(0.10),
    CENT_20(0.20),
    CENT_50(0.50),
    EURO_1(1.00),
    EURO_2(2.00),
    EURO_5(5.00),
    EURO_10(10.00),
    EURO_20(20.00),
    EURO_50(50.00),
    EURO_100(100.00),
    EURO_200(200.00);

    private final double wert;

    Zahlungsmittel(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

}
