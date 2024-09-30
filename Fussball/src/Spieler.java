public class Spieler extends Person{

    private String name;
    private int age;
    private int staerke;
    private int torschuss;
    private int ego;
    private int dribbling;
    private int motivation;
    private int anzahlTore;

    public Spieler(String name, int age, int staerke, int torschuss, int ego, int dribbling, int motivation, int anzahlTore){
        super(name,age);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.ego = ego;
        this.dribbling = dribbling;
        this.motivation = motivation;
        this.anzahlTore = anzahlTore;
    }
    public int getStaerke(){ return staerke; }
    public void setStaerke(int staerke){ this.staerke = staerke;}
    public int getTorschuss(){ return torschuss; }
    public void setTorschuss(int torschuss){ this.torschuss = torschuss;}
    public int getEgo(){ return ego; }
    public void setEgo(int ego){ this.ego = ego;}
    public int getDribbling(){ return dribbling; }
    public void setDribbling(int dribbling){this.dribbling = dribbling;}
    public int getMotivation(){ return motivation; }
    public void setMotivation(int motivation){this.motivation = motivation;}
    public int getAnzahlTore(){ return anzahlTore; }
    public void setAnzahlTore(int anzahlTore){ this.anzahlTore = anzahlTore;}

    @Override
    public String toString() {
        String text = super.toString();
        text += "\nStärke\t\t:\t"+ staerke;
        text += "\nTorschuss\t:\t"+torschuss;
        text += "\nEgo\t\t\t:\t"+ego;
        text += "\nDribbling\t:\t"+dribbling;
        text += "\nMotivation\t:\t"+motivation;
        text += "\nAnzahl Tore\t:\t"+anzahlTore+"\n";
        return text;
    }
}

