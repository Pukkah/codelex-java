package io.codelex.assignments.charfrequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that reads a text file by invoking {@link #fromFile(File)} and returns character frequency in a {@code Map} object.
 *
 * @author Miks Ramāns
 * @version 1.1
 * @since 2022-03-23
 */
public class CharFrequency {
    /**
     * Opens, Reads and Analyses provided {@code file}'s text for english ASCII character frequency
     *
     * @param file the {@code File} to read and analise
     * @return frequency {@code Map} of english ASCII characters
     * @throws FileNotFoundException if the file does not exist
     * @throws IOException           if unable to read from file
     */
    public static Map<Character, Integer> fromFile(File file) throws IOException {
        final int indexOffset = 'a';
        final int caseOffset = 'a' - 'A';
        int[] frequency = new int['Z' - 'A' + 1];
        try (FileReader reader = new FileReader(file)) {
            int data;
            while ((data = reader.read()) != -1) {
                if (data >= 'a' && data <= 'z') {
                    ++frequency[data - indexOffset];
                } else if (data >= 'A' && data <= 'Z') {
                    ++frequency[data - indexOffset + caseOffset];
                }
            }
        }
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < frequency.length; i++) {
            freqMap.put((char) (i + indexOffset), frequency[i]);
        }
        return freqMap;
    }

}
