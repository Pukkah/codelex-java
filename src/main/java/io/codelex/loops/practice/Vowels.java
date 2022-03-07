package io.codelex.loops.practice;

public class Vowels {

    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // use for
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }


        // use foreach
        for (char vowel : vowels) {
            System.out.println(vowel);
        }

    }

}
