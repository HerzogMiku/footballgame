public class gameplay {

    public static final int zeit = 90;
    public static final int nachSpielZeit = 5;
    public static final int aktion = 10;

    gameplay(){
    }

    private static int ermittelMannschaftsWert(Mannschaft mannschaft,Trainer trainer){
        int mannschaftwert = mannschaft.getMotivation() * mannschaft.getStaerke() * trainer.getErfahrung();
        if (mannschaftwert<1){
            return 1;
        } else {
            return mannschaftwert;
        }
    }

    private static boolean erzieltTor(Spieler schuetze, Torwart torwart){
        if (((Math.random()*10)*schuetze.getTorschuss())>((Math.random()*10)*torwart.getReaction())){
            return true;
        } else return false;
    }

    public static void spielen(Spiel spiel){
        int zeitraum = (int) (Math.random() * nachSpielZeit);
        zeitraum = zeit + zeitraum;
        do {
            int akti = (int) (Math.random() * aktion);
            zeitraum = zeitraum - akti;
            double gast = ermittelMannschaftsWert(spiel.getGast(),spiel.getGast().getTrainer()) * Math.random();
            double heim = ermittelMannschaftsWert(spiel.getHeim(),spiel.getHeim().getTrainer()) * Math.random();
            if (gast>heim){
                boolean tor = erzieltTor(getSchuetze(spiel.getGast()),spiel.getHeim().getTorwart());
                if (tor){
                    spiel.getErgebnis().addToGast();
                    System.out.println(zeitraum);
                    System.out.println("Tor für Gast!");
                } else{
                    System.out.println(zeitraum);
                    System.out.println("Kein Tor!");
                }
            } else {
                boolean tor = erzieltTor(getSchuetze(spiel.getHeim()), spiel.getGast().getTorwart());
                if (tor) {
                    System.out.println(zeitraum);
                    spiel.getErgebnis().addToHeim();
                    System.out.println("Tor für Heim!");
                } else {
                    System.out.println(zeitraum);
                    System.out.println("Kein Tor!");
                }
            }
        } while (zeitraum>0);
        System.out.println(spiel.getErgebnis());
    }

    private static Spieler getSchuetze(Mannschaft mannschaft){
        int nummer = (int) (Math.random() * mannschaft.getSpielerliste().size());
        return mannschaft.getSpielerliste().get(nummer);
    }
}
