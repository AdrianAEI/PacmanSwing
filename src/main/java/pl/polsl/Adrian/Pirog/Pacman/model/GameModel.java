package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.event.KeyEvent;
import java.util.List;
import pl.polsl.Adrian.Pirog.Pacman.exception.TooBigNumberException;

/**
 * Main model of application
 *
 * @author Adrian Pirog
 * @version 1.2
 */
public class GameModel {

    private BoardModel boardModel;
    private String name;

    /**
     * Set the default first level
     */
    public void setBoardModelOne() {

        boardModel = new BoardModel(1);
    }

    /**
     * Set the player name
     * @param name is a user input
     */
    public void setName(String name){
       this.name=name;
    }
    /**
     * Model constructor
     */
    public GameModel() {
    }

    /**
     * Try to set board level from arg, throw exception when arg is a string
     *
     * @param arg is a invocation parameter from command line
     * @throws TooBigNumberException throw exception when number is bigger then
     * 2
     */
    public void setBoardLevel(String arg) throws TooBigNumberException {
        int numberArg = 0;
        numberArg = Integer.parseInt(arg);
        if (!(numberArg <= 2)) {
            throw new TooBigNumberException();
        }
        boardModel = new BoardModel(numberArg);
    }

    /**
     * Get current board
     *
     * @return the model of game board
     */
    public List<List<Integer>> getCurrBoard() {
        return boardModel.getCurrentBoard();
    }

    /**
     * Return board model
     *
     * @return boardModel
     */
    public BoardModel getBoard() {
        return boardModel;
    }

    /**
     * Execute a move on a board
     *
     * @param n represents a event of key input
     */
    public void movePacman(int n) {
        switch (n) {
            case KeyEvent.VK_DOWN ->
                boardModel.movePacmanDown();
            case KeyEvent.VK_UP ->
                boardModel.movePacmanUp();
            case KeyEvent.VK_LEFT ->
                boardModel.movePacmanLeft();
            case KeyEvent.VK_RIGHT ->
                boardModel.movePacmanRight();
        }

    }
}
