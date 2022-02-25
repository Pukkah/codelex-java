package io.codelex.notes.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackingTime {
    public static void main(String[] args) throws IOException {

        // Get website source and print it
        String theUrl = "http://laame.info";
        URL url = new URL(theUrl);

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuilder buffer = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            buffer.append(inputLine);
            buffer.append("\n");
        }
        in.close();

        String result = buffer.toString();
        System.out.println(result);

        // Find all links in websites source
        Pattern urlPattern = Pattern.compile("((\\w+://)[-a-zA-Z0-9:@;?&=/%+.*!'(),$_{}^~\\[\\]`#|]+)");
        Matcher urlMatch = urlPattern.matcher(result);

        while (urlMatch.find()) {
            String s = urlMatch.group(1);
            System.out.println(s);
        }

    }
}
