package com.company.commands.filter;

import com.company.commands.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordFilter {

    public static List<String> filter(String filterParam, List<String> data) {
        if (filterParam.equals(Constants.WORD_FILTER.PALINDROME.toString())) {
            return palindrome(data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.ALL_VOWELS.toString())) {
            return allVowels(data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.DIPHTHONG.toString())) {
            return diphthong(data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.TRIPHTHONG.toString())) {
            return triphthong(data);
        } else {
            System.out.println("FILTER NOT FOUND");
            return new ArrayList<>();
        }
    }

    public static List<String> palindrome(List<String> words) {
        return  words.stream()
                .filter(WordFilter::isPalindrome)
                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() - i - 1));
    }

    public static List<String> allVowels(List<String> words) {
        return  words.stream()
                .filter(WordFilter::hasAllVowels)
                .collect(Collectors.toList());
    }

    private static boolean hasAllVowels(String word) {
        return word.contains("a") && word.contains("e") &&
                word.contains("i") && word.contains("o") &&
                word.contains("u");
    }

    public static List<String> diphthong(List<String> words) {
        return  words.stream()
                .filter(WordFilter::isDiphthong)
                .collect(Collectors.toList());
    }

    private static boolean isDiphthong(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if ((isOpenVowel(word.charAt(i)) && isClosedVowel(word.charAt(i + 1)) ||
                    (isClosedVowel(word.charAt(i)) && isOpenVowel(word.charAt(i + 1))))) {
                return true;
            }
        }
        return false;
    }

    public static List<String> triphthong(List<String> words) {
        return  words.stream()
                .filter(WordFilter::isTriphthong)
                .collect(Collectors.toList());
    }

    private static boolean isTriphthong(String word) {
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
