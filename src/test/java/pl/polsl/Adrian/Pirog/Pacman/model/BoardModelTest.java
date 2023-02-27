package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.Point;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Board model tests - all passed
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class BoardModelTest {

    /**
     * Test was successful, the pacman move was correct, position before calling
     * the function move is different than after calling the function move
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"20,18", "20,18", "21,16", "21,17"})
    public void testMovePacRight(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman did not move, because there was the brick
     * next to pacman
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"2,2", "3,3", "4,4", "5,5"})
    public void testShoudlDontMovePacRight(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman move was correct, position before calling
     * the function move is different than after calling the function move
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"20,18", "20,18", "21,16", "21,17"})
    public void testMovePacLeft(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman did not move, because there was the brick
     * next to pacman
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"2,2", "3,3", "4,4", "5,5"})
    public void testShoudlDontMovePacLeft(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman move was correct, position before calling
     * the function move is different than after calling the function move
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"20,18", "20,18", "21,16", "21,17"})
    public void testMovePacUp(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman did not move, because there was the brick
     * next to pacman
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"2,2", "3,3", "4,4", "5,5"})
    public void testShoudlDontMovePacUp(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman move was correct, position before calling
     * the function move is different than after calling the function move
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"20,18", "20,18", "21,16", "21,17"})
    public void testMovePacDown(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test was successful, the pacman did not move, because there was the brick
     * next to pacman
     *
     * @param posX is position x of pacman
     * @param posY is position y of pacman
     */
    @ParameterizedTest
    @CsvSource({"2,2", "3,3", "4,4", "5,5"})
    public void testShoudlDontMovePacDown(int posX, int posY) {
        //GIVEN
        BoardModel instance = new BoardModel(2);
        instance.getPacmanModel().loadCurrentPacmanPosition(posX, posY);
        Point expectedResult = new Point(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacmanLeft();
        result.setLocation(instance.getPacmanModel().getPosLine(), instance.getPacmanModel().getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }
}
