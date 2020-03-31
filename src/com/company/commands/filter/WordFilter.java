package com.company.commands.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WordFilter {
    public static List<String> palindrome(List<String> words){
        List<String> palindromeWords = new ArrayList<String>();
        for (String word : words) {
            if(isPalindrome(word)){
                palindromeWords.add(word);
            }
        }
        return palindromeWords;
    }

    private static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() - i - 1));
    }

    public static List<String> allVowels(List<String> words){
        List<String> allVowelsWords = new ArrayList<String>();
        for (String word : words) {
            if(hasAllVowels(word)){
                allVowelsWords.add(word);
            }
        }
        return allVowelsWords;
    }

    private static boolean hasAllVowels(String word) {
        return word.contains("a") && word.contains("e") &&
                word.contains("i") && word.contains("o") &&
                word.contains("u");
    }

    public static List<String> diphthong(List<String> words){
        List<String> diphthongWords = new ArrayList();
        for (String word : words) {
            if(isDiphthong(word)){
                diphthongWords.add(word);
            }
        }
        return diphthongWords;
    }

    private static boolean isDiphthong(String word) {
        for(int i=0;i<word.length()-1;i++){
            if((isOpenVowel(word.charAt(i)) && isClosedVowel(word.charAt(i+1))||
                    (isClosedVowel(word.charAt(i)) && isOpenVowel(word.charAt(i+1))))){
                return true;
            }
        }
        return false;
    }

    public static List<String> triphthong(List<String> words){
        List<String> triphthongWords = new ArrayList();
        for (String word : words) {
            if(isTriphthong(word)){
                triphthongWords.add(word);
            }
        }
        return triphthongWords;
    }

    private static boolean isTriphthong(String word) {
        for(int i=0;i<word.length()-2;i++){
            if(isOpenVowel(word.charAt(i))&&
                    isClosedVowel(word.charAt(i+1))&&
                    isClosedVowel(word.charAt(i+2))){
                return true;
            }
        }
        return false;
    }

    private static boolean isOpenVowel(char vowel){
        return vowel == 'a' || vowel == 'e' || vowel == 'o';
    }
    private static boolean isClosedVowel(char vowel){
        return vowel == 'i' || vowel == 'u';
    }
}