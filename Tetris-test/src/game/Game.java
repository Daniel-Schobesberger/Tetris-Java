package game;

import java.util.ArrayList;

/**
 * 
 * @author Nico Siegl
 */
//Klasse enthält die wichtigsten Variablen wie das Spielfeld
public class Game {
	
	public static int score = 0, highscore = 0, scoreToAdd = 0;
	public static boolean spawnNewBlock = false, speedup = false;
	
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static Block currentBlock, nextBlock;
	
	public static int[][] map = new int[10][18];
	
	public static GameState gamestate = GameState.start;
	
        //Methode zum "zurücksetzen" des Spielfeldes
	public static void clear() {
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				map[x][y] = 0;
			}
		}
		score = 0;
	}
	

}
