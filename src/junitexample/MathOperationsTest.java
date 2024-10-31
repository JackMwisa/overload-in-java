package src.junitexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    // Test cases for the subtraction method
    @Test
    public void testSubtractionPositiveNumbers() {
        int result = MathOperations.subtraction(10, 3);
        System.out.println("Testing subtraction with positive numbers: 10 - 3");
        assertEquals(7, result, "Subtraction of 10 - 3 should be 7");
    }

    @Test
    public void testSubtractionNegativeResult() {
        int result = MathOperations.subtraction(3, 10);
        System.out.println("Testing subtraction resulting in a negative: 3 - 10");
        assertEquals(-7, result, "Subtraction of 3 - 10 should be -7");
    }

    // Test cases for the multiplication method
    @Test
    public void testMultiplicationPositiveNumbers() {
        int result = MathOperations.multiplication(4, 5);
        System.out.println("Testing multiplication with positive numbers: 4 * 5");
        assertEquals(20, result, "Multiplication of 4 * 5 should be 20");
    }

    @Test
    public void testMultiplicationWithZero() {
        int result = MathOperations.multiplication(7, 0);
        System.out.println("Testing multiplication with zero: 7 * 0");
        assertEquals(0, result, "Multiplication of 7 * 0 should be 0");
    }
}
