package io.codelex.assignments.charfrequency;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static Map<Character, Integer> fromFile(File file) throws IOException {
        final int offset = 'a' - 'A';
        int[] frequency = new int['Z' + 1];
        try (FileReader reader = new FileReader(file)) {
            int data;
            while ((data = reader.read()) != -1) {
                if (data >= 'a' && data <= 'z') {
                    ++frequency[data - offset];
                } else if (data >= 'A' && data <= 'Z') {
                    ++frequency[data];
                }
            }
        }
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            if (frequency[i] != 0) {
                freqMap.put((char) (i + offset), frequency[i]);
            }
        }
        return freqMap;
    }

}
