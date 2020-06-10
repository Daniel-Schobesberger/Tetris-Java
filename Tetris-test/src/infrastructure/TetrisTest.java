/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.awt.FontFormatException;
import java.io.IOException;

import game.Block;
import game.Game;
import io.DataHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.Gui;

public class TetrisTest {

    public static void main(String[] args) {

        try {
            DataHandler.load();
            
            Game.currentBlock = new Block();
            Game.blocks.add(Game.currentBlock);
            Game.nextBlock = new Block();
            
            Gui g = new Gui();
            g.create();
            
            startLoop();
        } catch (FontFormatException ex) {
            Logger.getLogger(TetrisTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TetrisTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void startLoop() {
        GameLoop loop = new GameLoop();
        loop.start();
    }

}
