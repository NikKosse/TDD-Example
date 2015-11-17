package Tests;

import Java.Calculator;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Class to perform tests on calculator class
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private ArrayList<Integer> averageNumbers = new ArrayList<>();
    private ArrayList<Integer> addNumbers = new ArrayList<>();
    private ArrayList<Integer> subtractNumbers = new ArrayList<>();
    private ArrayList<Integer> multiplyNumbers = new ArrayList<>();

    @Test
    public void testAverageNumbers_Given2_2_shouldReturn2() throws Exception {
        //setup
        double expected = 2;
        averageNumbers.add(2);
        averageNumbers.add(2);
        //act
        double actual = calculator.averageNumbers(averageNumbers);
        //assert
        assertEquals(expected,actual,10);
    }

    @Test
    public void testAddNumbers_Given2_2_shouldReturn4() throws Exception {
        //setup
        int expected = 4;
        addNumbers.add(2);
        addNumbers.add(2);
        //act
        int actual = calculator.addNumbers(addNumbers);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testSubtractNumbers_Given2_1_shouldReturn1() throws Exception {
        //setup
        int expected = 1;
        subtractNumbers.add(2);
        subtractNumbers.add(1);
        //act
        int actual = calculator.subtractNumbers(subtractNumbers);
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNumbers_Given2_2_ShouldReturn4() throws Exception {
        //setup
        int expected = 4;
        multiplyNumbers.add(2);
        multiplyNumbers.add(2);
        //act
        int actual = calculator.multiplyNumbers(multiplyNumbers);
        //assert
        assertEquals(expected,actual);
    }
}