package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import data.Conversion;
import game.Game;

public class DrawInterface extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        String type = Game.nextBlock.getType().toString();
        g.setColor(Color.BLACK);
        if (type == "I") {
            for (int x = 0; x < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; x++) {
                for (int y = 0; y < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][x].length; y++) {
                    if (Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][x][y] == 1) {
                        g.fillRect(Conversion.cellToCoord(1 + x),
                                Conversion.cellToCoord(1 + y + 1), 32, 32);
                    }
                }
            }
        } else {
            for (int x = 0; x < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; x++) {
                for (int y = 0; y < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][x].length; y++) {
                    if (Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][x][y] == 1) {
                        g.fillRect(Conversion.cellToCoord(1 + x + 1),
                                Conversion.cellToCoord(1 + y + 1), 32, 32);
                    }
                }
            }
        }

        g.setColor(Color.BLACK);
        g.setFont(Gui.pixelfont.deriveFont(16f));
        g.drawString("NEXT BLOCK ", 32, 25);

        //Zeichnet rechts den kommenden Block
        //Breite von Feld
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 4; i++) {
            //Höhe von Feld
            for (int j = 1; j < 5; j++) {
                g.drawRect(i * 32 + 32, j * 32, 32, 32);
            }
        }

        g.setColor(Color.BLACK);
        g.drawRect(32, 32, 128, 128);

        g.setFont(Gui.pixelfont);
        if(Game.score>=Game.highscore){
            g.setColor(Color.RED);
            g.drawString("SCORE: " + Game.score, 32, 200);
            g.setColor(Color.BLACK);
            g.drawString("BEST: " + Game.highscore, 32, 250);
        }else{
        g.drawString("SCORE: " + Game.score, 32, 200);
        g.setColor(Color.RED);
        g.drawString("BEST: " + Game.highscore, 32, 250);
        }
        repaint();
    }

}
