


public class Prostorija {
    private String naziv;
    private double duzina, sirina;

    public Prostorija(String naziv, double duzina, double sirina) {
        this.naziv = naziv;
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getDuzina() {
        return duzina;
    }

    public double getSirina() {
        return sirina;
    }

    @Override
    public String toString() {
        //"Prostorija Lotus povrsine 50.0m^2"
        return "Prostorija " + naziv
                + " povrsine " + (duzina*sirina) + "m^2";
    }
}
