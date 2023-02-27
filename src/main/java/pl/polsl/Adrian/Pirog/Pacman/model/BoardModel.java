package pl.polsl.Adrian.Pirog.Pacman.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Class represent a model of board
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class BoardModel {

    private List<List<Integer>> currentBoardList = new ArrayList<>();
    private PacmanModel pacmanModel;
    private GhostModel ghostModel;
    private final int empty = Block.EMPTY.ordinal();
    private final int block = Block.BLOCK.ordinal();
    private final int pacman = Block.PACMAN.ordinal();

    /**
     * Model of board constructor
     *
     * @param level is a user-selected level
     */
    public BoardModel(int level) {
        switch (level) {
            case 1 -> initBoardLvlOne();
            case 2 -> initBoardLvlTwo();
            default -> initBoardLvlTwo();
        }
    }

    /**
     * Initializes the board for the first level
     */
    private void initBoardLvlOne() {
        List<Integer> row1 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row2 = Arrays.asList(1, 1, 1, 1, 1, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 1, 1, 1, 1, 1);
        List<Integer> row3 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row4 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row5 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row6 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 1);
        List<Integer> row7 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row8 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row9 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row10 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row11 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 6, 6, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row12 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row13 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row14 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row15 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row16 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row17 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row18 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1);
        List<Integer> row19 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 1, 1, 1, 1, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row20 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 3, 6, 1, 1, 1, 1, 1);
        List<Integer> row21 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row22 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row23 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 1, 1, 1, 1, 6, 1, 6, 6, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1);
        List<Integer> row24 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 1, 6, 6, 6, 6, 1, 6, 6, 6, 6, 1, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1);
        List<Integer> row25 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row26 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row27 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row28 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row29 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row30 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row31 = Arrays.asList(1, 1, 1, 1, 1, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 1, 1, 1, 1, 1);
        List<Integer> row32 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        Collections.addAll(currentBoardList, row1, row2, row3, row4, row5, row6, row7, row8,
                row9, row10, row11, row12, row13, row14, row15, row16,
                row17, row18, row19, row20, row21, row22, row23, row24,
                row25, row26, row27, row28, row29, row30, row31, row32);

        currentBoardList.get(15).set(12, pacman);
        pacmanModel = new PacmanModel(15, 12);
    }

    /**
     * Initializes the board for the second level
     */
    private void initBoardLvlTwo() {
        List<Integer> row1 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row2 = Arrays.asList(1, 1, 1, 1, 1, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 1, 1, 1, 1, 1);
        List<Integer> row3 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row4 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row5 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 6, 1, 1, 1, 1, 1);
        List<Integer> row6 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 1);
        List<Integer> row7 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row8 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 6, 1, 6, 1, 1, 1, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row9 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row10 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 6, 6, 1, 6, 6, 6, 1, 6, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row11 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 6, 6, 6, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row12 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row13 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row14 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row15 = Arrays.asList(1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 6, 1, 6, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1);
        List<Integer> row16 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row17 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row18 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1);
        List<Integer> row19 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 1, 1, 1, 1, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row20 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 3, 6, 1, 1, 1, 1, 1);
        List<Integer> row21 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row22 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row23 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 1, 1, 1, 1, 6, 1, 6, 6, 1, 1, 1, 1, 1, 6, 1, 6, 1, 1, 1, 1, 1);
        List<Integer> row24 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 1, 6, 6, 6, 6, 1, 6, 6, 6, 6, 1, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1);
        List<Integer> row25 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row26 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 1, 1, 1, 1, 1);
        List<Integer> row27 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row28 = Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 1, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row29 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 6, 6, 6, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row30 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1);
        List<Integer> row31 = Arrays.asList(1, 1, 1, 1, 1, 1, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 1, 1, 1, 1, 1);
        List<Integer> row32 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        Collections.addAll(currentBoardList, row1, row2, row3, row4, row5, row6, row7, row8,
                row9, row10, row11, row12, row13, row14, row15, row16,
                row17, row18, row19, row20, row21, row22, row23, row24,
                row25, row26, row27, row28, row29, row30, row31, row32);
        currentBoardList.get(22).set(18, pacman);
        pacmanModel = new PacmanModel(22, 18);
        ghostModel = new GhostModel(4,25);
    }

    public GhostModel getGhostModel() {
        return ghostModel;
    }

    public void setGhostModel(GhostModel ghostModel) {
        this.ghostModel = ghostModel;
    }

    /**
     * Get the look of current board
     *
     * @return current board
     */
    public List<List<Integer>> getCurrentBoard() {
        return currentBoardList;
    }

    /**
     * Get the look of current board
     *
     * @return pacman model
     */
    public PacmanModel getPacmanModel() {
        return pacmanModel;
    }

    /**
     * Move pacman model to right
     */
    public void movePacmanRight() {
        int tPacLine = pacmanModel.getPosLine();
        int tPacCol = pacmanModel.getPosColum();
        if (currentBoardList.get(0).size() > tPacCol + 1 && currentBoardList.get(tPacLine).get(tPacCol + 1) != block) {
            currentBoardList.get(tPacLine).set(tPacCol, empty);
            currentBoardList.get(tPacLine).set(tPacCol + 1, pacman);
            pacmanModel.loadCurrentPacmanPosition(tPacLine, tPacCol + 1);
        }
    }

    /**
     * Move pacman model to left
     */
    public void movePacmanLeft() {
        int tPacLine = pacmanModel.getPosLine();
        int tPacCol = pacmanModel.getPosColum();
        if (0 <= tPacCol - 1 && currentBoardList.get(tPacLine).get(tPacCol - 1) != block) {
            currentBoardList.get(tPacLine).set(tPacCol, empty);
            currentBoardList.get(tPacLine).set(tPacCol - 1, pacman);
            pacmanModel.loadCurrentPacmanPosition(tPacLine, tPacCol - 1);
        }
    }

    /**
     * Move pacman model to down
     */
    public void movePacmanDown() {
        int tPacLine = pacmanModel.getPosLine();
        int tPacCol = pacmanModel.getPosColum();
        if (currentBoardList.size() > tPacLine + 1 && currentBoardList.get(tPacLine + 1).get(tPacCol) != block) {
            currentBoardList.get(tPacLine).set(tPacCol, empty);
            currentBoardList.get(tPacLine + 1).set(tPacCol, pacman);
            pacmanModel.loadCurrentPacmanPosition(tPacLine + 1, tPacCol);
        }
    }

    /**
     * Move pacman model to up
     */
    public void movePacmanUp() {
        int tPacLine = pacmanModel.getPosLine();
        int tPacCol = pacmanModel.getPosColum();
        if (0 <= tPacLine - 1 && currentBoardList.get(tPacLine - 1).get(tPacCol) != block) {
            currentBoardList.get(tPacLine).set(tPacCol, empty);
            currentBoardList.get(tPacLine - 1).set(tPacCol, pacman);
            pacmanModel.loadCurrentPacmanPosition(tPacLine - 1, tPacCol);
        }
    }

}
