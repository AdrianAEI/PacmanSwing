package pl.polsl.Adrian.Pirog.Pacman.view;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Scoreboard view class, show score board
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class ScoreView extends JPanel {

    private final DefaultTableModel scoreboardTable = new DefaultTableModel();

    private final JTable scoreboard = new JTable(scoreboardTable);

    private final JScrollPane scrollpane = new JScrollPane(scoreboard);

    private JButton scoreButton;

    /**
     * Score view class constructor
     */
    public ScoreView() {
        String[][] testUsers = {{"1", "Mario31", "120"}, {"2", "John321", "12"}, {"3", "Mario13431", "5"}, {"4", "Alex2341", "3"}, {"5", "Mario531", "1"}};
        this.add(scrollpane);
        initBackButton();
        scoreboardTable.setColumnIdentifiers(new String[]{"Position", "Player name", "Player score"});
        addNewRecord(testUsers[0]);
        addNewRecord(testUsers[1]);
        addNewRecord(testUsers[2]);
        addNewRecord(testUsers[3]);
        addNewRecord(testUsers[4]);

    }

    /**
     * Init score board button
     */
    private void initBackButton() {
        scoreButton = new JButton("Back");
        scoreButton.setBounds(100, 100, 250, 250);
        this.add(scoreButton);
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
     * Close score board
     */
    public void closeScore() {
        this.setVisible(false);
        this.setFocusable(false);
        this.setRequestFocusEnabled(false);
    }

    /**
     * Add new record to table
     *
     * @param record is a table of string add to record
     */
    private void addNewRecord(String[] record) {
        scoreboardTable.addRow(record);
        scoreboard.setPreferredScrollableViewportSize(new Dimension(750, scoreboard.getPreferredSize().height));
    }
}
