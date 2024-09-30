public class Spiel {

    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis = new Ergebnis();
    private StringBuilder spielbericht;

    Spiel(Mannschaft heim, Mannschaft gast){
        this.heim = heim;
        this.gast = gast;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }
    @Override
    public String toString(){
        String text = "Gast: "+gast.getName();
        text += "\nHeim: "+heim.getName();
        text += "\nErgebnis: "+ergebnis;
        text += "\nSpielbericht: "+spielbericht;
        return text;
    }
}
