package io.codelex.notes.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @Test
    @DisplayName("Tests ar nosaukumu")
    public void testJUnit() {
        JUnit junit = new JUnit("JUnit");
    }

    @Test
    public void testToString() {
        // GIVEN
        JUnit junit = new JUnit("test");
        String expectedToStringResult = "JUnit{name='test'}";

        // WHEN
        String actualResult = junit.toString();

        // THEN
        Assertions.assertEquals(expectedToStringResult, actualResult);
    }

    @Test
    public void testThrowException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException();
        });
    }

}
