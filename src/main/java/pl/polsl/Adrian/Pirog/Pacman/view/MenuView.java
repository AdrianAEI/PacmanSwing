package pl.polsl.Adrian.Pirog.Pacman.view;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Class of main menu view
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class MenuView extends JPanel {

    private JButton playButton;
    private JButton scoreButton;
    private JButton exitButton;

    /**
     * Main menu view constuctor
     */
    public MenuView() {
        initButtons();
        this.setLayout(null);
        this.setFocusable(true);
        this.setRequestFocusEnabled(true);

    }

    /**
     * Init menu buttons
     */
    private void initButtons() {
        playButton = new JButton("Play");
        scoreButton = new JButton("Scoreboard");
        exitButton = new JButton("Exit");
        playButton.setBounds(300, 125, 200, 100);
        scoreButton.setBounds(300, 325, 200, 100);
        exitButton.setBounds(300, 525, 200, 100);
        this.add(playButton);
        this.add(scoreButton);
        this.add(exitButton);
    }

    /**
     * Get play button
     *
     * @return play button
     */
    public JButton getPlayButton() {
        return playButton;
    }

    /**
     * Get score button
     *
     * @return score button
     */
    public JButton getScoreButton() {
        return scoreButton;
    }

    /**
     * Get exit button
     *
     * @return exit button
     */
    public JButton getExitButton() {
        return exitButton;
    }

    /**
     * Close main menu view
     */
    public void closeMenu() {
        this.setVisible(false);
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
    }
}
