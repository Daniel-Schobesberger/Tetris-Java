/**
 * @author Nico Siegl
 */
package infrastructure;

import game.Block;
import ui.Gui;
import game.Game;
public class Main {

    public static void main(String[] args) {

        DataHandler.load();

        Game.currentBlock = new Block();
        Game.blocks.add(Game.currentBlock);
        Game.nextBlock = new Block();

        /**
         * @author Mia Mandel
         */
        try {
            Gui g = new Gui();
            g.create();
        } catch (FontFormatException | IOException e) {
            System.out.println("Failed to create GUI.");
            e.printStackTrace();
        }
        
        start();
    }
    
    // Startet das Spiel
    public static void start(){
        GameLoop loop = new GameLoop();
        loop.start();
    }
    
}
