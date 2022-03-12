package io.codelex.notes.day10;

public class WavyText {
    public static void main(String[] args) {

        String text = "Hello World! This text is wavy.";
        int amplitude = 2;

        char[][] lines = new char[amplitude * 2 + 1][text.length()];
        boolean goingDown = true;
        int displacement = amplitude;

        for (int i = 0; i < text.length(); i++) {
            lines[displacement][i] = text.charAt(i);
            if (displacement == 0 || displacement == amplitude * 2) {
                goingDown = !goingDown;
            }
            displacement += goingDown ? +1 : -1;
        }

        for (char[] line : lines) {
            for (char c : line) {
                System.out.print(c != 0 ? c : " ");
            }
            System.out.println();
        }

    }

}
