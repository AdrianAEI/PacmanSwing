package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.Point;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Game model tests - all passed
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class GameModelTest {

    /**
     * Test was successful, read values ​​from the keyboard and move pacman
     * correct
     *
     * @param n is a number given to switch
     */
    @ParameterizedTest
    @ValueSource(ints = {37, 38, 39, 40})
    public void testMovePacman(int n) {
        //GIVEN
        GameModel instance = new GameModel();
        instance.setBoardModelOne();
        instance.getBoard().getPacmanModel().loadCurrentPacmanPosition(20, 18);
        Point expectedResult = new Point(instance.getBoard().getPacmanModel().getPosLine(), instance.getBoard().getPacmanModel().getPosColum());
        Point result = new Point();
        //WHEN
        instance.movePacman(n);
        result.setLocation(instance.getBoard().getPacmanModel().getPosLine(), instance.getBoard().getPacmanModel().getPosColum());
        //THEN
        assertNotEquals(expectedResult, result);
    }

    /**
     * Test was successful, user-entered values ​​did not correspond to those
     * for moving so pacman don not move
     *
     * @param n is a number given to switch
     */
    @ParameterizedTest
    @ValueSource(ints = {321132, 412421412, -421421, 65656})
    public void testShoudlNotMovePacman(int n) {
        //GIVEN
        GameModel instance = new GameModel();
        instance.setBoardModelOne();
        instance.getBoard().getPacmanModel().loadCurrentPacmanPosition(20, 18);
        Point expectedResult = new Point(instance.getBoard().getPacmanModel().getPosLine(), instance.getBoard().getPacmanModel().getPosColum()); 
        Point result = new Point();
        //WHEN
        instance.movePacman(n);
        result.setLocation(instance.getBoard().getPacmanModel().getPosLine(), instance.getBoard().getPacmanModel().getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }
}
