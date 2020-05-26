package infrastructure;

import data.Collision;
import game.Block;
import game.Game;
import game.GameState;
import static java.lang.Thread.sleep;

/**
 *
 * @author Nico Siegl
 */
public class GameLoop extends Thread {

    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            try {
                if (Game.gameState == GameState.ingame) {

                    if (!Collision.collideWithWall(Game.currentBlock, 0) && !Collision.collideWithBlock(Game.currentBlock, 0)) {
                        Game.currentBlock.setY(Game.currentBlock.getY() + 1);
                        Collision.collideWithWall(Game.currentBlock, 0);

                    }

                    if (Game.spawnNewBlock) {
                        Game.blocks.add(Game.nextBlock);
                        Game.currentBlock = Game.nextBlock;
                        Game.nextBlock = new Block();
                        Game.spawnNewBlock = false;
                    }
                }
                if (!Game.speedup) {
                    sleep(1000);
                } else {
                    sleep(100);
                }

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

}
