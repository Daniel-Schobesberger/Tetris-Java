/**
 * @author Nico Siegl
 */
package game;

import java.util.ArrayList;

public class Game {
    public static int score = 0,highScore = 0,scoreToAdd = 0;
    public static boolean spawnNewBlock = false,speedup = false;
    public static ArrayList<Block> blocks = new ArrayList();
    public static Block currentBlock;
    public static Block nextBlock;
    public static int[][] map = new int [10][18];
    public static GameState gameState = GameState.start;
    public static GameState gamestate;

    //Funktion zum reset des Spiels
    public static void clear(){
        for (int i = 0; i < map.length; i++) {
            //Setzt jede stelle der Map auf 0 => somit map leer
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
        score = 0;
    }

    public Block getCurrentBlock() {
        return currentBlock;
    }
}
