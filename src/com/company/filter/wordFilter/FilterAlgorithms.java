package com.company.filter.wordFilter;

import java.util.stream.IntStream;

public class FilterAlgorithms {

    public static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() - i - 1));
    }

    public static boolean hasAllVowels(String word) {
        return word.contains("a") && word.contains("e") &&
                word.contains("i") && word.contains("o") &&
                word.contains("u");
    }

    public static boolean isDiphthong(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if ((isOpenVowel(word.charAt(i)) && isClosedVowel(word.charAt(i + 1)) ||
                    (isClosedVowel(word.charAt(i)) && isOpenVowel(word.charAt(i + 1))))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTriphthong(String word) {
        for (int i = 0; i < word.length() - 2; i++) {
            if (isOpenVowel(word.charAt(i)) &&
                    isClosedVowel(word.charAt(i + 1)) &&
                    isClosedVowel(word.charAt(i + 2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOpenVowel(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'o';
    }

    private static boolean isClosedVowel(char vowel) {
        return vowel == 'i' || vowel == 'u';
    }
}
