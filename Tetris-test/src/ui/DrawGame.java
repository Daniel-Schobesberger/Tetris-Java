package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import data.Conversion;
import game.Block;
import game.Game;

/**
 *
 * @author Nico Siegl
 */
public class DrawGame extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Game.currentBlock.getColor());
        for (int x = 0; x < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()].length; x++) {
            for (int k = 0; k < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][x].length; k++) {
                if (Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][x][k] == 1) {
                    g.fillRect(Conversion.cellToCoord(Game.currentBlock.getX() + x),
                            Conversion.cellToCoord(Game.currentBlock.getY() + k), 32, 32);
                }
            }
        }

        for (int i = 0; i < Game.map.length; i++) {
            for (int j = 0; j < Game.map[i].length; j++) {
                //überprüft an welcher Stelle sich ein Block befindet
                if (Game.map[i][j] > 0) {
                    switch (Game.map[i][j]) {
                        case 1:
                            g.setColor(Color.CYAN);
                            break;
                        case 2:
                            g.setColor(Color.YELLOW);
                            break;
                        case 3:
                            g.setColor(Color.MAGENTA);
                            break;
                        case 4:
                            g.setColor(Color.ORANGE);
                            break;
                        case 5:
                            g.setColor(Color.BLUE);
                            break;
                        case 6:
                            g.setColor(Color.RED);
                            break;
                        case 7:
                            g.setColor(Color.GREEN);
                            break;
                    }
                    g.fillRect(Conversion.cellToCoord(i), Conversion.cellToCoord(j), 32, 32);
                }
            }
        }
        g.setColor(Color.lightGray);
        //Feld wird gezeichnet
        //Breite von Feld
        for (int i = 0; i < 10; i++) {
            //Höhe von Feld
            for (int j = 0; j < 18; j++) {
                //Rechteck zeichnen 32*32
                g.drawRect(i * 32, j * 32, 32, 32);
            }
        }

        //Außenlinie von Spielfeld
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, Gui.width, Gui.height);

        repaint();
    }

}
