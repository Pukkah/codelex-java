package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final int maxScore = 100;
        final int step = 10;
        final String scores = fileContent();
        List<Integer> scoresList = Arrays.stream(scores.split(" "))
                                         .map(Integer::parseInt)
                                         .toList();
        for (int i = 0; i <= maxScore; i += step) {
            if (i < maxScore) {
                System.out.printf("%02d-%02d: ", i, i + step - 1);
            } else {
                System.out.printf("%5d: ", maxScore);
            }
            int scoresInRange = 0;
            for (int score : scoresList) {
                if (score >= i && score <= i + step - 1) {
                    scoresInRange++;
                }
            }
            System.out.println("*".repeat(scoresInRange));
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                    .findFirst()
                    .orElseThrow(IllegalStateException::new);
    }

}
