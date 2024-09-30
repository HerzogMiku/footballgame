public class Torwart extends Spieler{

    private int reaction;
    private int sprungkraft;
    public Torwart(String name, int age, int staerke, int ego, int motivation, int reaction, int sprungkraft) {
        super(name, age, staerke, 0, ego, 0, motivation, 0);
        this.reaction = reaction;
        this.sprungkraft = sprungkraft;
    }

    public int getReaction(){return reaction; }
    public void setReaction(int reaction){this.reaction = reaction;}
    private int getSprungkraft(){return sprungkraft; }
    public void setSprungkraft(int sprungkraft){this.sprungkraft = sprungkraft;}

    @Override
    public String toString(){
        String text = super.toString();
        text += "\nReaktion\t:\t"+reaction;
        text += "\nSprungkraft\t:\t"+sprungkraft;
        return text;
    }
}


