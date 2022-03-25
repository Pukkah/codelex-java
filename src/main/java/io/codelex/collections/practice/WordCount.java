package io.codelex.collections.practice;

import java.io.IOException;
import java.lang.reflect.Parameter;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> allLines = Files.readAllLines(path, charset);
        long lineCount = allLines.size();
        long wordCount = 0;
        long charCount = 0;
        final Pattern wordPattern = Pattern.compile("\\w+");
        for (String line : allLines) {
            Matcher wordMatcher = wordPattern.matcher(line);
            wordCount += wordMatcher.results().count();
            charCount += line.length();
        }
        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }

}
