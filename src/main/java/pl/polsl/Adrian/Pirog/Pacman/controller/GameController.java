package pl.polsl.Adrian.Pirog.Pacman.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import pl.polsl.Adrian.Pirog.Pacman.model.GameModel;
import pl.polsl.Adrian.Pirog.Pacman.view.GameView;

/**
 * Main controller of application
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class GameController implements KeyListener, ActionListener {
    private EnemyController enemyController;
    private final GameView view;
    private final GameModel model;
    private boolean inGame;

    /**
     * Controller constructor, set view and model, add action to menu buttons
     * and init menu view
     *
     * @param view is a main view of application
     * @param model is a main model of application
     * @param args are the user nickname and the selected board
     */
    public GameController(GameView view, GameModel model, String[] args) {
        this.view = view;
        this.model = model;
        this.inGame = false;
        addActionToButtons();
        setLevelAndNick(args);
        initView();
    }
    private void startEnemyController() {
    this.enemyController=new EnemyController(model.getBoard().getGhostModel(), model.getBoard().getPacmanModel(), model.getBoard());
    }
    /**
     * Add action listener to buttons
     */
    private void addActionToButtons() {
        this.view.getMenuPanel().getExitButton().addActionListener(this);
        this.view.getMenuPanel().getScoreButton().addActionListener(this);
        this.view.getMenuPanel().getPlayButton().addActionListener(this);
        this.view.getScorePanel().getScoreButton().addActionListener(this);
    }

    /**
     * Try to set level of board and player nick
     *
     * @param args = args from command line or user input
     */
    private void setLevelAndNick(String[] args) {
        try {
            model.setBoardLevel(args[1]);
            model.setName(args[0]);

        } catch (Exception e) {
            model.setBoardModelOne();
            model.setName(view.showInputDialog());
        }
    }

    /**
     * Set default values of view and graphic window, set main menu visable
     */
    private void initView() {

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(815, 838);
        view.setBackground(Color.black);
        view.setVisible(true);
        view.setMenuListener(this);
    }

    /**
     * Init game board after click play button
     */
    private void initGameView() {
        view.loadBoard(model.getCurrBoard());
        view.setBoardListener(this);
        this.inGame = true;
        startEnemyController();
        checkGameState();
    }

    /**
     * Function controls the movement of the pacman and close window on ESC
     *
     * @param e represents a event of key input
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && inGame) {
            model.movePacman(KeyEvent.VK_LEFT);
            view.reBoard("LEFT");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && inGame) {
            model.movePacman(KeyEvent.VK_RIGHT);
            view.reBoard("RIGHT");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && inGame) {
            model.movePacman(KeyEvent.VK_UP);
            view.reBoard("UP");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && inGame) {
            model.movePacman(KeyEvent.VK_DOWN);
            view.reBoard("DOWN");
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            view.dispose();
        }
        //to do change this with ghost moving
        if (inGame){
            checkGameState();
            enemyController.moveGhost();
        }
    }

    /**
     * Override a method from class KeyListener
     *
     * @param e represents a event of key input
     */
    @Override
    public void keyReleased(KeyEvent e) {
    }

    /**
     * Override a method from class KeyListener
     *
     * @param e represents a event of key input
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Set actions on button click
     *
     * @param e is a user action
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getMenuPanel().getPlayButton()) {
            this.initGameView();
            view.closeMenu();
        } else if (e.getSource() == view.getMenuPanel().getScoreButton()) {
            view.loadScorePanel();
            view.setScoreListener(this);
            view.getMenuPanel().setVisible(false);
            view.getScorePanel().setVisible(true);

        } else if (e.getSource() == view.getMenuPanel().getExitButton()) {
            view.closeMenu();
            view.dispose();
        } else if (e.getSource() == view.getScorePanel().getScoreButton()) {
            view.closeScore();
            view.getMenuPanel().setVisible(true);
        }
    }
    public void checkGameState(){

            if(enemyController.checkCollision()==true){
                inGame=false;
                view.dispose();
            }

    }
}
