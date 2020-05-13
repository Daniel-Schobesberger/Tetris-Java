package ui;

import data.Conversion;
import game.Game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

//DrawGame erstellt die Oberfläche des Spielfeldes
public class DrawGame extends JLabel{
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Game.currentBlock.getColor());
        for (int j = 0; j < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()].length; j++) {
            for (int k = 0; k < Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][j].length; k++) {
                if (Game.currentBlock.getBounds()[Game.currentBlock.getRotation()][j][k] == 1) {
                    g.fillRect(Conversion.cellToCoord(Game.currentBlock.getX() + j),Conversion.cellToCoord(Game.currentBlock.getY() + k), 32, 32);
                }
            }
        }
        
        //Feld wird gezeichnet
        g.setColor(Color.lightGray);
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
