package infrastructure;

import game.Block;
import ui.Gui;
import game.Game;
public class Main {

    public static void main(String[] args) {
        Game.currentBlock = new Block();
        Game.blocks.add(Game.currentBlock);
        Game.nextBlock = new Block();
        
        Gui game = new Gui();
        game.create();
        
        start();
    }
    
    //Startet das Spiel
    public static void start(){
        GameLoop loop = new GameLoop();
        loop.start();
    }
    
}
