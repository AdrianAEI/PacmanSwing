package pl.polsl.Adrian.Pirog.Pacman.main;

import pl.polsl.Adrian.Pirog.Pacman.controller.GameController;
import pl.polsl.Adrian.Pirog.Pacman.model.GameModel;
import pl.polsl.Adrian.Pirog.Pacman.view.GameView;

/**
 * Main class of the application.
 *
 * @author Adrian Pirog
 * @version 1.2
 */
public class PacmanMain {

    /**
     * Run a whole application, create a model, view and controller. Invocation
     * parameters to the application in the command line
     *
     * @param args first arg is a nick second arg is a number of level subsequent arguments are
     * omitted
     */
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GameController controller= new GameController(view, model, args);

    }
}
