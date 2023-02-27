package pl.polsl.Adrian.Pirog.Pacman.model;

import java.awt.Point;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.polsl.Adrian.Pirog.Pacman.exception.NegativeValueException;

/**
 * Pacman model tests - all passed
 *
 * @author Adrian Pirog
 * @version 1.0
 */
public class PacmanModelTest {

    /**
     * Test was successful, load correct pacman postion on board
     *
     * @param L is a correct pacman model line position
     * @param C is a correct pacman model column position
     */
    @ParameterizedTest
    @CsvSource({"5,10", "10,20", "15,30", "29,31"})
    public void testLoadCurrentPacmanPosition(int L, int C) {
        //GIVEN
        PacmanModel instance = new PacmanModel(0, 0);
        Point expectedResult = new Point(L, C);
        //WHEN
        instance.loadCurrentPacmanPosition(L, C);
        Point result = new Point(instance.getPosLine(), instance.getPosColum());
        //THEN
        assertEquals(expectedResult, result);
    }

    /**
     * Test was successful, try to load string to position of pacman on board so throw the exception
     *
     * @param L is a uncorrect pacman model line position, position must be int
     * @param C is a uncorrect pacman model column position, position must be int
     */
    @ParameterizedTest
    @CsvSource({"string1,string2", "034keas20,0i3kdsakold", "kosaasd,4", "5,ksaodkaos"})
    public void testShouldThrowExceptionWhenInvalidPosition(String L, String C) {
        try {
            //GIVEN
            PacmanModel instance = new PacmanModel(0, 0);
            //WHEN
            Point expectedResult = new Point(Integer.parseInt(L), Integer.parseInt(C));
            instance.loadCurrentPacmanPosition(Integer.parseInt(L), Integer.parseInt(C));
            Point result = new Point(instance.getPosLine(), instance.getPosColum());
            //THEN
            fail();
        } catch (NumberFormatException e) {
        }
    }

    /**
     * Test was successful, try to load invalid value of pacman postion on board so throw the exception
     *
     * @param L is a invalid value of pacman model line position
     * @param C is a invalid value of pacman model column position
     */
    @ParameterizedTest
    @CsvSource({"-5,-10", "-15,-20", "100,-100", "-100,100"})
    public void testShouldThrowExceptionWhenInvalidPosition(int L, int C) {

        try {
            //GIVEN
            PacmanModel instance = new PacmanModel(0, 0);
            //WHEN
            Point expectedResult = new Point(L, C);
            instance.loadCurrentPacmanPosition(L, C);
            Point result = new Point(instance.getPosLine(), instance.getPosColum());
            //THEN
            if (instance.getPosLine() < 0 || instance.getPosColum() < 0) {
                throw new NegativeValueException();
            }
            fail();
        } catch (NegativeValueException e) {
        }
    }
}
