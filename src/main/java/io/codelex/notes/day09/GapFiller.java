package io.codelex.notes.day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GapFiller {
    public static void main(String[] args) throws FileNotFoundException {

        String regex = "(?<!#)#\\s+#(?!#)";
        Pattern pattern = Pattern.compile(regex);

        File file = new File("./src/main/java/io/codelex/notes/day09/codelex.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            String s = in.nextLine();
            Matcher match = pattern.matcher(s);
            String result = match.replaceAll(matchResult -> "#".repeat(matchResult.group().length()));
            System.out.println(result);
        }

    }

}