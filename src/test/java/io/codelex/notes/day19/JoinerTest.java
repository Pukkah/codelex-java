package io.codelex.notes.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    @Test
    void join() {
        String expected = "1-2-3";
        Joiner joiner = new Joiner("-");
        Assertions.assertEquals(expected, joiner.join(1, 2, 3));
    }

}
