package io.codelex.assignments.charfrequency;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
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
