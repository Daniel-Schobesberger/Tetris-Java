/**
 * @author Nico Siegl
 */
package infrastructure;

import game.Block;
import ui.Gui;
import game.Game;
import io.DataHandler;

public class Main {

    public static void main(String[] args) {

        DataHandler.load();

        Game.currentBlock = new Block();
        Game.blocks.add(Game.currentBlock);
        Game.nextBlock = new Block();

        /**
         * @author Mia Mandel
         */
        Gui g = new Gui();
        g.create();
        
        start();
    }
    
    // Startet das Spiel
    public static void start(){
        GameLoop loop = new GameLoop();
        loop.start();
    }
    
}
