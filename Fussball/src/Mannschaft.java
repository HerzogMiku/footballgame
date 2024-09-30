import java.util.ArrayList;

public class Mannschaft {


    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;

    Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerliste){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerliste = spielerliste;
    }

    public String getName(){ return name;}
    public void setName(String name){ this.name = name;}

    public Trainer getTrainer() { return trainer;}

    public void setTrainer(Trainer trainer) {this.trainer = trainer;}
    public Torwart getTorwart() {return torwart;}

    public void setTorwart(Torwart torwart) {this.torwart = torwart;}
    public ArrayList<Spieler> getSpielerliste(){return spielerliste;}

    public int getMotivation(){
        int motivation = 0;
        for (Spieler s : spielerliste) {
            motivation += s.getMotivation();
        }
        motivation += torwart.getMotivation();
        motivation = motivation/(spielerliste.size()+1);
        return motivation;
    }

    public int getStaerke(){
        int staerke = 0;
        for (Spieler s : spielerliste) {
            staerke += s.getStaerke();
        }
        staerke += torwart.getStaerke();
        staerke = staerke/(spielerliste.size()+1);
        return staerke;
    }


}
