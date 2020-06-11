package game;

import static game.BlockType.values;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Mia Mandel
 */
public enum BlockType {
	I,O,T,L,J,Z,S;//alle möglichen Blocktypen
	
        //Methde liefert zufälligen Block zurück
	public static BlockType random() {
		int random = (int)(Math.random()* values().length);
		return values()[random];
	}
}


