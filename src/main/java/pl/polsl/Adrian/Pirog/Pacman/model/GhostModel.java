package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.*;
/**
 * Ghost model of application
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class GhostModel {
private int hp;
    private final Point position;

    /**
     * Pacman model constructor
     *
     * @param x is x position of ghost
     * @param y is y position of ghost
     */
    public GhostModel(int x, int y) {
        position = new Point(x, y);
    }

    /**
     * Get the position x of ghost
     *
     * @return position x
     */
    public int getPosLine() {
        return position.x;
    }

    /**
     * Get the position y of ghost
     *
     * @return position y
     */
    public int getPosColum() {
        return position.y;
    }

    /**
     * Load the current model position of ghost on board
     *
     * @param L is a ghost model line position
     * @param C is a ghost model colum position
     */
    public void loadCurrentGhostPosition(int L, int C) {
        position.setLocation(L, C);
    }

}

