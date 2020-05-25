package data;

import game.Block;
import game.Game;

public class Collision {

    public static boolean collideWithBlock(Block b, int direction) {
        // -1 = links
        // 0 = runter
        // 1 = rechts

        switch (direction) {
            case -1:
                if (b.getY() > 0) {
                    if (b.getX() > 0) {
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
                            e.printStackTrace();
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
                                    if (Game.map[b.getX() + i - 1][b.getY() + j] >= 1) {
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

    private static void fillBlock(Block b) {
        try {
            for (int i = 0; i < b.getBounds()[b.getRotation()].length; i++) {
                for (int j = 0; j < b.getBounds()[b.getRotation()][i].length; j++) {
                    if (b.getBounds()[b.getRotation()][i][j] == 1) {
                        Game.map[b.getX() + 1][b.getY() + j] = b.getTypeValue();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
