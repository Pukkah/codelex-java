package io.codelex.notes.day15.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    @Test
    void testFirstNumbers() {
        //GIVEN
        int firstNumberToGet = 1;
        int secondNumberToGet = 2;
        int thirdNumberToGet = 3;
        int fourthNumberToGet = 5;

        int expectedFirst = 0;
        int expectedSecond = 1;
        int expectedThird = 1;
        int expectedForth = 3;

        // WHEN + THEN
        Assertions.assertEquals(expectedFirst, FibonacciSequence.getNumber(firstNumberToGet));
        Assertions.assertEquals(expectedSecond, FibonacciSequence.getNumber(secondNumberToGet));
        Assertions.assertEquals(expectedThird, FibonacciSequence.getNumber(thirdNumberToGet));
        Assertions.assertEquals(expectedForth, FibonacciSequence.getNumber(fourthNumberToGet));
    }

    @Test
    void testLaterNumbers() {
        Assertions.assertEquals(55, FibonacciSequence.getNumber(11));
        Assertions.assertEquals(89, FibonacciSequence.getNumber(12));
        Assertions.assertEquals(144, FibonacciSequence.getNumber(13));
    }

    @Test
    void testIncorrectIndex() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FibonacciSequence.getNumber(-1));
    }

}
