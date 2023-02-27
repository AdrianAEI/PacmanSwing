package pl.polsl.Adrian.Pirog.Pacman.view;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pl.polsl.Adrian.Pirog.Pacman.model.Block;

/**
 * Board view class, show all images on screen
 *
 * @author Adrian Pirog
 * @version 1.1
 */
public class BoardView extends JPanel {

    private List<ImageIcon> imageIcons;
    private ImageIcon pacmanImage;
    private final static int EMPTY = Block.EMPTY.ordinal(), BLOCK = Block.BLOCK.ordinal(),
            PACMAN = Block.PACMAN.ordinal(), STRAWBERRY = Block.STRAWBERRY.ordinal(),
            APPLE = Block.APPLE.ordinal(), HEART = Block.HEART.ordinal(), PILL = Block.PILL.ordinal(),
            REDGHOST=Block.REDGHOST.ordinal();
    private List<List<Integer>> reveicedBoardList = new ArrayList<>();

    /**
     * Set the path of image of pacman
     *
     * @param pacmanPath is a current path of image
     */
    public final void setPacmanImage(String pacmanPath) {
        if (null == pacmanPath) {
            pacmanImage = imageIcons.get(9);
        } else {
            pacmanImage = switch (pacmanPath) {
                case "UP" ->
                    imageIcons.get(1);
                case "DOWN" ->
                    imageIcons.get(2);
                case "RIGHT" ->
                    imageIcons.get(3);
                case "LEFT" ->
                    imageIcons.get(4);
                default ->
                    imageIcons.get(9);
            };
        }
    }

    /**
     * Board view constructor
     */
    public BoardView() {

        setFocusable(true);
        setRequestFocusEnabled(true);
        initImages();
        setPacmanImage("NULL");
    }

    /**
     * Init list of images
     */
    public final void initImages() {
        List<String> filePaths = Arrays.asList("./src/main/java/Images/block25.png", "./src/main/java/Images/up.gif", "./src/main/java/Images/down.gif",
                "./src/main/java/Images/right.gif", "./src/main/java/Images/left.gif", "./src/main/java/Images/pill.png",
                "./src/main/java/Images/emptyArea.png", "./src/main/java/Images/apple.png", "./src/main/java/Images/strawberry.png",
                "./src/main/java/Images/pacman_1.png", "./src/main/java/Images/heart.png", "./src/main/java/Images/redGhost.png");
        imageIcons = filePaths.stream()
                .map(string -> new ImageIcon(string))
                .collect(Collectors.toList());
    }

    /**
     * Paint the game board
     *
     * @param g are a graphics to draw
     */
    @Override
    public void paint(Graphics g) {
        int posX = 0;
        int posY = 0;

        Image offIm = createImage(800, 800);
        Graphics g2 = offIm.getGraphics();

        for (List<Integer> row : reveicedBoardList) {

            for (int elem : row) {
                if (elem == BLOCK) {
                    imageIcons.get(0).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == PILL) {
                    imageIcons.get(5).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == APPLE) {
                    imageIcons.get(7).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == STRAWBERRY) {
                    imageIcons.get(8).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == HEART) {
                    imageIcons.get(10).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == EMPTY) {
                    imageIcons.get(6).paintIcon(this, g2, posX * 25, posY * 25);
                } else if (elem == PACMAN) {
                    pacmanImage.paintIcon(this, g2, posX * 25, posY * 25);
                }else if (elem == REDGHOST) {
                    imageIcons.get(11).paintIcon(this, g2, posX * 25, posY * 25);
                }
                posX++;
            }
            posX = 0;
            posY++;
        }
        g.drawImage(offIm, 0, 0, this);
    }

    /**
     * Set the current view of board
     *
     * @param board is a current board
     */
    public void setBoardSetUP(List<List<Integer>> board) {
        this.reveicedBoardList = board;
    }
}
