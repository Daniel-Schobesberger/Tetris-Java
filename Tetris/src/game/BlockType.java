package game;

//Enum enthält alle Blockvariationen
public enum BlockType{

    I, O, T, L, J, Z, S;

    public static BlockType random(){
        int random = (int)(Math.random()*5); //generiert Zufallszahl
        return values()[random];
    }
}