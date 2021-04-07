package Sortest_word;

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
        return words[0].length();

    }

    public static void main(String[] args) {
        System.out.println(findShort("siema siema dupa"));
    }
}