package pl.polsl.Adrian.Pirog.Pacman.controller;

import pl.polsl.Adrian.Pirog.Pacman.model.BoardModel;
import pl.polsl.Adrian.Pirog.Pacman.model.GhostModel;
import pl.polsl.Adrian.Pirog.Pacman.model.PacmanModel;
/**
 * Enemy controller of application
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class EnemyController {
    GhostModel ghostModel;
    PacmanModel pacmanModel;
    BoardModel boardModel;

    /**
     *
     * @param ghostModel is a current ghost model
     * @param pacmanModel is a current pacman model
     */
    public EnemyController(GhostModel ghostModel, PacmanModel pacmanModel,BoardModel boardModel) {
        this.ghostModel = ghostModel;
        this.pacmanModel = pacmanModel;
        this.boardModel =boardModel;
    }

    /**
     *
     * @return true when pacman position is equal to ghost position and false when pacman do not hit a ghost
     */
    boolean checkCollision(){
        //to do resolve a problem that y is x and x is y lol, ghost is only on level two, must do ghost logic and mov
        //now game ends when player hit ghost
        System.out.println("Pac pos " + pacmanModel.getPosLine() + " " + pacmanModel.getPosColum());
        System.out.println("Ghost pos" + ghostModel.getPosLine() + " " + ghostModel.getPosColum());
        return pacmanModel.getPosColum() == ghostModel.getPosColum() && pacmanModel.getPosLine() == ghostModel.getPosLine();
    }

    void moveGhost(){
        this.ghostModel.loadCurrentGhostPosition(ghostModel.getPosLine()-1, ghostModel.getPosColum()-1);
        this.boardModel.moveGhost();
    }

}
