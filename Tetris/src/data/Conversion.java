package data;

public class Conversion {
    public static int cellToCoord(int cell){
        return cell *32;
    }
    public static int cellToCell(int coord){
        return coord / 32;
    }
}
