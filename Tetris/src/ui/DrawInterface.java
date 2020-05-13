package ui;

import data.Conversion;
import game.Game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

//DrawInterface erstellt die Oberfläche des Spielfeldes für den nächsten Block
public class DrawInterface extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //nächster Block wird rechts angezeigt
        g.setColor(Game.nextBlock.getColor());
        for (int j = 0; j < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()].length; j++) {
            for (int k = 0; k < Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][j].length; k++) {
                if (Game.nextBlock.getBounds()[Game.nextBlock.getRotation()][j][k] == 1) {
                    g.fillRect(Conversion.cellToCoord(1 + j),Conversion.cellToCoord(k), 32, 32);
                }
            }
        }
        
        //Feld rechts oben wird gezeichnet
        //Größe 4*4
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.drawRect(i * 32 + 32, j * 32, 32, 32);
            }
        }
        //Rand des Feldes rechts oben
        g.setColor(Color.BLACK);
        g.drawRect(32, 0, 128, 128);

        repaint();
    }
}
