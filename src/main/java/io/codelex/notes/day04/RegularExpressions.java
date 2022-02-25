package io.codelex.notes.day04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        // === RegEx ===
        String emailRegEx = "\\b[\\w.-]+@[\\w.-]+.\\w{2,4}\\b";
        String validEmail = "user@domain.com";
        String invalidEmail = "_232@@@dd2--.c+";

        System.out.println(validEmail + " " + validEmail.matches(emailRegEx));
        System.out.println(invalidEmail + " " + validEmail.matches(invalidEmail));

        // === Pattern and Matcher

        Pattern myPattern = Pattern.compile("\\b[\\w.-]+@[\\w.-]+.\\w{2,4}\\b");
        Matcher myMatcher = myPattern.matcher("user@domain.com");
        boolean matches = myMatcher.matches();
        System.out.println(matches);


        // Useful tools
        // - http://regexplanet.com
        // - https://regexr.com/

    }
}
