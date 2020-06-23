package io;

import data.Collision;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import game.Game;

/**
 * 
 * @author Florian Doppler
 */
public class KeyHandler implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(Game.gamestate == Game.gamestate.start){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                Game.gamestate = Game.gamestate.ingame;
            }
        }
        
        if(Game.gamestate == Game.gamestate.ingame){
            //Block rotieren
            if(e.getKeyCode() == KeyEvent.VK_SPACE){
                try{
                    if(!Collision.collideInRotation(Game.currentBlock)){
                        Game.currentBlock.rotate();
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                    System.out.println("Hallo");
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_R){
                try{
                    if(!Collision.collideInRotation(Game.currentBlock)){
                        Game.currentBlock.rotate();
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            
            //Hinunterfallen lassen des Blocks
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                Game.speedup = true;
            }
            if(e.getKeyCode() == KeyEvent.VK_S){
                Game.speedup = true;
            }
            
            //Block nach rechts Bewegen
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                try{
                    if(!Collision.collideWithWall(Game.currentBlock,1) && !Collision.collideWithWall(Game.currentBlock,1)){
                        Game.currentBlock.setX(Game.currentBlock.getX() + 1);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }
            if(e.getKeyCode() == KeyEvent.VK_D){
                try{
                    if(!Collision.collideWithWall(Game.currentBlock,1) && !Collision.collideWithWall(Game.currentBlock,1)){
                        Game.currentBlock.setX(Game.currentBlock.getX() + 1);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }
            
            
            //Block nach links bewegen
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                try{
                    if(!Collision.collideWithWall(Game.currentBlock,-1) && !Collision.collideWithWall(Game.currentBlock,-1)){
                        Game.currentBlock.setX(Game.currentBlock.getX() - 1);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_A){
                try{
                    if(!Collision.collideWithWall(Game.currentBlock,-1) && !Collision.collideWithWall(Game.currentBlock,-1)){
                        Game.currentBlock.setX(Game.currentBlock.getX() - 1);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            
            //Schnelles Tempo stoppen
            if(e.getKeyCode() == KeyEvent.VK_W){
                Game.speedup = false;
            }
            
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                Game.gamestate = Game.gamestate.pause;
            }
        }else if(Game.gamestate == Game.gamestate.pause){
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                Game.gamestate = Game.gamestate.ingame;
            }
        }else if(Game.gamestate == Game.gamestate.gameover){
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                Game.gamestate = Game.gamestate.ingame;
                Game.clear();
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(Game.gamestate == Game.gamestate.ingame){
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                Game.speedup = false;
            }else if(e.getKeyCode() == KeyEvent.VK_S){
                Game.speedup = false;
            }
        }
    }
    
}
