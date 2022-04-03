package io.codelex.notes.day19;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... elements) {
        return Arrays.stream(elements)
                     .map(Objects::toString)
                     .collect(Collectors.joining(separator));
    }

}
