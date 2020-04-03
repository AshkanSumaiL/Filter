package com.company.filter.numberFilter;

import com.company.Constants;

import java.util.ArrayList;
import java.util.List;

public class NumberFilterSelector {
    public static List<Integer> filter(String filterParam, List<Integer> data) {
        ContextNumberFilter contextNumberFilter =new ContextNumberFilter();
        if (filterParam.equals(Constants.NUMBER_FILTER.EVEN.toString())) {
            return contextNumberFilter.executeStrategy(new FilterEven(),data);
        }
       if (filterParam.equals(Constants.NUMBER_FILTER.ODD.toString())) {
           return contextNumberFilter.executeStrategy(new FilterOdd(),data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.PALINDROME.toString())) {
            return contextNumberFilter.executeStrategy(new FilterNumberPalindrome(),data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.PRIME.toString())) {
            return contextNumberFilter.executeStrategy(new FilterPrime(),data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_7.toString())) {
            return contextNumberFilter.executeStrategy(new FilterMultipleOf7(),data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_11.toString())) {
            return contextNumberFilter.executeStrategy(new FilterMultipleOf11(),data);
        } else {
            System.out.println("FILTER NOT FOUND:" + "'" + filterParam + "'");
            return new ArrayList<>();
        }
    }

}
