package io.codelex.assignments.charfrequency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

class CharFrequencyTest {

    @Test
    void testFromFile() throws NullPointerException, IOException {
        String expectedResult = "{a=212, b=49, c=106, d=153, e=433, f=59, g=58, h=81, i=237, j=8, k=12, l=144, m=85, n=217, o=195, p=91, q=5, r=191, s=206, t=217, u=103, v=40, w=40, x=16, y=63, z=1}";
        URL path = CharFrequencyTest.class.getResource("text.txt");
        assert path != null;
        File file = new File(path.getFile());
        String result = CharFrequency.fromFile(file).toString();
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testFileNotFoundException() {
        File nonExistingFile = new File("invalid_pathname");
        Assertions.assertThrows(FileNotFoundException.class, () -> CharFrequency.fromFile(nonExistingFile));
    }

}
