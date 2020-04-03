package com.company.filter.wordFilter;

import com.company.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WordFilterSelector {

    public static List<String> filter(String filterParam, List<String> data) {
        ContextWordFilter contextWordFilter =new ContextWordFilter();
        if (filterParam.equals(Constants.WORD_FILTER.PALINDROME.toString())) {
            return contextWordFilter.executeStrategy(new FilterWordPalindrome(),data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.ALL_VOWELS.toString())) {
            return contextWordFilter.executeStrategy(new FilterAllVowels(),data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.DIPHTHONG.toString())) {
            return contextWordFilter.executeStrategy(new FilterDiphthong(),data);
        }
        if (filterParam.equals(Constants.WORD_FILTER.TRIPHTHONG.toString())) {
            return contextWordFilter.executeStrategy(new FilterTriphthong(),data);
        }
         else {
            System.out.println("FILTER NOT FOUND:" + "'" + filterParam + "'");
            return new ArrayList<>();
        }
    }

}
