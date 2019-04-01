

public class Skladiste extends Prostorija{
    private double preostaloMesta, dimenzijaPalete;

    public Skladiste(String naziv, double duzina
            , double sirina, double dimenzijaPalete) {
        super(naziv, duzina, sirina);
        this.preostaloMesta = duzina * sirina;
        this.dimenzijaPalete = dimenzijaPalete;
    }

    public double getPreostaloMesta() {
        return preostaloMesta;
    }

    public double getDimenzijaPalete() {
        return dimenzijaPalete;
    }

    public void setPreostaloMesta(double preostaloMesta) {
        this.preostaloMesta = preostaloMesta;
    }

    public void setDimenzijaPalete(double dimenzijaPalete) {
        this.dimenzijaPalete = dimenzijaPalete;
    }

    public void dodajPalete(int brojPaleta) {
        int maxBrojPaleta = (int)Math.floor(this.preostaloMesta / (this.dimenzijaPalete*this.dimenzijaPalete));
        if (maxBrojPaleta == 0) {
            System.out.println("Nista nismo ubacili, skladiste je puno");
            }
        else if (maxBrojPaleta < brojPaleta) {
            System.out.println("Uspesno je ubaceno " + maxBrojPaleta + " paleta");
            this.preostaloMesta -= maxBrojPaleta * Math.pow(this.dimenzijaPalete, 2);
        }
        else {
            System.out.println("Uspesno je ubaceno sve");
            this.preostaloMesta -= brojPaleta * Math.pow(this.dimenzijaPalete, 2);
        }
    }

    @Override
    public String toString() {
        return "Skladiste " + super.getNaziv()
                + " povrsine " + super.getDuzina()*super.getSirina() + "m^2"
                + "(slobodno " + preostaloMesta + "m^2)";
    }
}
