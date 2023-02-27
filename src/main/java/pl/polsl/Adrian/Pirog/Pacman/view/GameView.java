package pl.polsl.Adrian.Pirog.Pacman.view;

import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Main class of game view
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class GameView extends JFrame {

    private final BoardView boardPanel;
    private final MenuView menuPanel;
    private final ScoreView scorePanel;

    /**
     * Game view constructor, add main menu panel at start of the application
     */
    public GameView() {
        super("Pacman");
        menuPanel= new MenuView();
        scorePanel = new ScoreView();
        boardPanel = new BoardView();
        this.add(menuPanel);
    }

    /**
     * Get menu panel
     * @return current menu panel
     */
    public MenuView getMenuPanel() {
        return menuPanel;
    }

    /**
     * Get score panel
     * @return current score panle
     */
    public ScoreView getScorePanel() {
        return scorePanel;
    }
    
    /**
     * Add score panel to frame
     */
    public void loadScorePanel()
    {
        this.add(scorePanel);
    }

    /**
     * User can input nick
     * @return a user nick
     */
    public String showInputDialog()
    {
        String nick = JOptionPane.showInputDialog(null, "You should input your nick!", 
                "Exception, user input is empty!", JOptionPane.ERROR_MESSAGE);
        return nick;
    }
    /**
     * Load the board and set to be visable on screen
     *
     * @param board is a current board
     */
    public void loadBoard(List<List<Integer>> board) {
        boardPanel.setBoardSetUP(board);
        add(boardPanel);
        setVisible(true);
    }

    /**
     * Set the listener to key from user input
     *
     * @param k is a current key input
     */
    public void setBoardListener(KeyListener k) {
        this.boardPanel.addKeyListener(k);
    }
        public void setMenuListener(KeyListener k) {
        this.menuPanel.addKeyListener(k);
    }
        public void setScoreListener(KeyListener k) {
        this.scorePanel.addKeyListener(k);
    }

    /**
     * Show the pacman direction and paint current board
     *
     * @param pacmanDirection is a direction of pacman model
     */
    public void reBoard(String pacmanDirection) {
        boardPanel.setPacmanImage(pacmanDirection);
        boardPanel.repaint();
    }
    
    /**
     * Close menu panel
     */
    public void closeMenu()
    {
        menuPanel.closeMenu();
        this.remove(menuPanel);
    }
    
    /**
     * Close score panel
     */
    public void closeScore()
    {
        scorePanel.closeScore();
        this.remove(scorePanel);
    }
}
