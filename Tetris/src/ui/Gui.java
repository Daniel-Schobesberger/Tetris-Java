package ui;

import processing.core.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import io.KeyHandler;
import ui.DrawGame;
import ui.DrawInterface;

public class Gui {

    public static int width = 320, height = 576;

    JFrame jf;
    
    public void create() {
        jf = new JFrame ("Tetris");
        jf.setSize(width + 17 + 200, height + 41); //10 Felder in der Breite und 18 Felder in der Höhe ergeben diese Werte
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.addKeyListener(new KeyHandler());
        jf.requestFocus();
        
        DrawGame dg = new DrawGame();
        setupDraw(dg, 0, 0, width+1, height+1);
        
        DrawInterface di = new DrawInterface();
        setupDraw(di, width+1, 1, width, height);
        
        
        jf.setVisible(true);
        
    }
    
    private void setupDraw(JLabel draw, int x, int y, int width, int height) {
        draw.setBounds(x,y,width,height);
        draw.setVisible(true);
        jf.add(draw);
    }
    
}
