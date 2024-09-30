public class Trainer extends Person {


    private int erfahrung;

    public Trainer(String name, int age, int erfahrung){
        super(name,age);
        this.erfahrung = erfahrung;

    }
    public int getErfahrung(){ return erfahrung;}

    public void setErfahrung(int erfahrung){
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString() {
        String text = super.toString();
        text += "\nErfahrung\t:\t" +erfahrung;
        return text;
    }
}
