package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.Point;

/**
 * Class that represents a model of pacman
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class PacmanModel {

    private final Point position;

    /**
     * Pacman model constructor
     *
     * @param x is an x position of pacman
     * @param y is an y position of pacman
     */
    public PacmanModel(int x, int y) {
        position = new Point(x, y);
    }

    /**
     * Get the position x of pacman
     *
     * @return position x
     */
    public int getPosLine() {
        return position.x;
    }

    /**
     * Get the position y of pacman
     *
     * @return position y
     */
    public int getPosColum() {
        return position.y;
    }

    /**
     * Load the current model position of pacman on board
     *
     * @param L is a pacman model line position
     * @param C is a pacman model colum position
     */
    public void loadCurrentPacmanPosition(int L, int C) {
        position.setLocation(L, C);
    }

}
