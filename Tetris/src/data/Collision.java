package data;

import game.Block;
import game.Game;

public class Collision {

    /**
     *
     * @author Florian Doppler
     */
    public static boolean collideWithBlock(Block b, int direction) {
        // direction: -1 = links, 0 = runter, 1 = rechts

        switch (direction) {
            case -1:
                if (b.getY() > 0 && b.getX() > 0) {

                    for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                        for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                            if (b.getBounds()[b.getRotation()][i][j] == 1) {
                                if (Game.map[b.getX() + i - 1][b.getY() + j] >= 1) {

                                    return true;
                                }
                            }
                        }

                    }
                }
                break;
            case 0:
                if (b.getY() + b.getSize() > 1) {
                    if (b.getY() - b.getSize() < 17) {
                        try {
                            for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                                for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                                    if (b.getBounds()[b.getRotation()][i][j] == 1) {

                                        if (Game.map[b.getX() + i][b.getY() + j + 1] >= 1) {

                                            Game.spawnNewBlock = true;
                                            fillBlock(b);

                                            return true;
                                        }

                                    }
                                }
                            }
                        } catch (Exception e) {
                            return false;
                        }
                    }
                }

                break;
            case 1:
                if (b.getY() > 0) {
                    if (b.getX() < 10) {
                        for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                            for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                                if (b.getBounds()[b.getRotation()][i][j] == 1) {
                                    if (Game.map[b.getX() + i + 1][b.getY() + j] >= 1) {

                                        return true;
                                    }
                                }
                            }
                        }

                    }
                }
                break;
        }

        return false;
    }

    /**
     * 
     * @author Daniel Schobesberger 
     */
    public static boolean collideInRotation(Block b) {
        int rot = b.getRotation() + 1;
        if (rot == 4) {
            rot = 0;
        }
        //erstellen eines neuen Blocks
        Block newBlock = new Block();
        //Block bekommt die gleichen werte nur andere Rotation
        newBlock.setRotation(rot);
        newBlock.setBounds(b.getBounds());
        newBlock.setSize(b.getSize());
        newBlock.setX(b.getX() - 1);
        newBlock.setY(b.getY());

        if (collideWithWall(newBlock, 1)) {
            return true;
        }
        newBlock.setX(b.getX() + 2);
        if (collideWithWall(newBlock, -1)) {
            return true;
        }

        if (b.getY() > 0) {
            for (int i = 0; i < b.getBounds()[rot].length; i++) {
                for (int j = 0; j < b.getBounds()[rot][i].length; j++) {
                    if (b.getBounds()[rot][i][j] == 1) {
                        try {
                            if (Game.map[b.getX() + i][b.getY() + j] >= 1) {

                                return true;
                            }
                        } catch (Exception e) {
                            return true;
                        }
                    }
                }

            }
        }

        return false;
    }

    /**
     *
     * @author Nico Siegl
     */
    public static boolean collideWithWall(Block b, int direction) {
        // direction: -1 = links, 0 = runter, 1 = rechts
        switch (direction) {
            case -1:
                for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                    for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                        //wenn die Bedingung stimmt sind wir am linken Rand
                        if (b.getBounds()[b.getRotation()][i][j] == 1) {
                            if (b.getX() + i == 0) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 0:
                for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                    for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                        if (b.getBounds()[b.getRotation()][i][j] == 1) {
                            //wenn die Bedingung stimmt sind wir ganz unten
                            if (b.getY() + j == 17) {
                                Game.spawnNewBlock = true;   //Spawnen von neuem Block weil wir ganz unten sind
                                fillBlock(b);

                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                    for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                        if (b.getBounds()[b.getRotation()][i][j] == 1) {
                            //wenn die Bedingung stimmt sind wir am rechten Rand
                            if (b.getX() + (i + 2) >= 11) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }

        return false;
    }

    /**
     *
     * @author Florian Doppler
     */
    private static void fillBlock(Block b) {
        try {
            for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                    if (b.getBounds()[b.getRotation()][i][j] == 1) {
                        Game.map[b.getX() + i][b.getY() + j] = b.getTypeValue();

                    }

                }
            }
        } catch (Exception e) {

        }
    }
}
