public class Ergebnis {

    private int toreHeim = 0;
    private int toreGast = 0;

    Ergebnis(){

    }

    public int getToreHeim(){ return toreHeim;}
    public void addToHeim(){
        toreHeim += 1;
    }
    public int getToreGast(){ return toreGast;}
    public void addToGast(){toreGast += 1;}
    @Override
    public String toString(){
        String text = "Tore Heim: "+toreHeim;
        text += "\nTore Gast: "+toreGast;
        return text;
    }
}
