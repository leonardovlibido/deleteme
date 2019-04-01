


public class Zvucnik {
    private String proizvodjac;
    private String model;
    private int snaga;
    private boolean ukljucen;

    public Zvucnik(String proizvodjac, String model, int snaga) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.snaga = snaga;
        this.ukljucen = false;
    }

    public Zvucnik(Zvucnik other) {
        //this.proizvodjac = other.proizvodjac;
        //this.model = other.model;
        //this.snaga = other.snaga;
        this(other.proizvodjac, other.model, other.snaga);
        this.ukljucen = other.ukljucen;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public int getSnaga() {
        return snaga;
    }

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void switchOnOff() {
        ukljucen = !ukljucen;
    }

    @Override
    public String toString() {
        String isOnOff = this.ukljucen ? " je ukljucen" : " je iskljucen";
        return "Zvucnik "
                + proizvodjac + " "
                + model
                + ", snaga " + snaga + "W"
                + isOnOff;
    }
}
