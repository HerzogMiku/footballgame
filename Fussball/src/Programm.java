import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Trainer nuha = new Trainer("Patthamaporn",20,1);
        Spieler sara = new Spieler("Sara",24,4,7,2,3,1,20);
        Torwart miguel = new Torwart("Miguel",22,3,2,0,7,4);

        //Team 1
        Spieler sarer1 = new Spieler("Sara1",24,4,7,2,3,1,20);
        Spieler sarer2 = new Spieler("Sara2",24,4,7,2,3,1,20);
        Spieler sarer3 = new Spieler("Sara3",24,4,7,2,3,1,20);
        Spieler sarer4 = new Spieler("Sara4",24,4,7,2,3,1,20);
        Spieler sarer5 = new Spieler("Sara5",24,4,7,2,3,1,20);
        Spieler sarer6 = new Spieler("Sara6",24,4,7,2,3,1,20);
        Spieler sarer7 = new Spieler("Sara7",24,4,7,2,3,1,20);
        Spieler sarer8 = new Spieler("Sara8",24,4,7,2,3,1,20);
        Spieler sarer9 = new Spieler("Sara9",24,4,7,2,3,1,20);
        Spieler sarer10 = new Spieler("Sara10",24,4,7,2,3,1,20);
        Torwart sarerT = new Torwart("SarerT",22,3,2,0,7,4);

        //Team 2
        Spieler miguel1 = new Spieler("Miguel1",22,7,5,10,1,1,15);
        Spieler miguel2 = new Spieler("Miguel2",22,7,5,10,1,1,15);
        Spieler miguel3 = new Spieler("Miguel3",22,7,5,10,1,1,15);
        Spieler miguel4 = new Spieler("Miguel4",22,7,5,10,1,1,15);
        Spieler miguel5 = new Spieler("Miguel5",22,7,5,10,1,1,15);
        Spieler miguel6 = new Spieler("Miguel6",22,7,5,10,1,1,15);
        Spieler miguel7 = new Spieler("Miguel7",22,7,5,10,1,1,15);
        Spieler miguel8 = new Spieler("Miguel8",22,7,5,10,1,1,15);
        Spieler miguel9 = new Spieler("Miguel9",22,7,5,10,1,1,15);
        Spieler miguel10 = new Spieler("Miguel10",22,7,5,10,1,1,15);
        Torwart miguelT = new Torwart("MiguelT",22,3,10,0,7,4);




        ArrayList<Spieler> heim = new ArrayList<>();
        heim.add(0,sarer1);
        heim.add(1,sarer2);
        heim.add(2,sarer3);
        heim.add(3,sarer4);
        heim.add(4,sarer5);
        heim.add(5,sarer6);
        heim.add(6,sarer7);
        heim.add(7,sarer8);
        heim.add(8,sarer9);
        heim.add(9,sarer10);

        ArrayList<Spieler> gast = new ArrayList<>();
        gast.add(0,miguel1);
        gast.add(1,miguel2);
        gast.add(2,miguel3);
        gast.add(3,miguel4);
        gast.add(4,miguel5);
        gast.add(5,miguel6);
        gast.add(6,miguel7);
        gast.add(7,miguel8);
        gast.add(8,miguel9);
        gast.add(9,miguel10);

        Mannschaft mannschaft = new Mannschaft("Miguelson", nuha, miguelT, gast);
        Mannschaft mannschaft1 = new Mannschaft("Sarerson", nuha, sarerT, heim);

        Spiel spiel = new Spiel(mannschaft,mannschaft1);

        gameplay.spielen(spiel);

    }



}
