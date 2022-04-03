package io.codelex.notes.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FilePalindromeTest {

    @Test
    void canReverseFile() throws IOException {
        String testFile = FilePalindromeTest.class.getResource("testfile.dat").getFile();
        FilePalindrome.reverseFile(testFile);
        Path expectedPath = Path.of(FilePalindromeTest.class.getResource("eliftset.dat").getPath());
        String expectedResult = "\nemordnilaPeliF";
        Assertions.assertEquals(expectedResult, Files.readString(expectedPath));
    }

}
