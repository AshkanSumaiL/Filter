package com.company.filter.numberFilter;

import com.company.Constants;


import java.util.ArrayList;
import java.util.List;

public class NumberFilterSelector {
    public static List<Integer> filter(String filterParam, List<Integer> data) {
        ContextNumberFilter contextNumberFilter =new ContextNumberFilter();
        IStrategyNumberFilter Filter;

        if (filterParam.equals(Constants.NUMBER_FILTER.EVEN.toString())) {
            Filter=new FilterEven();
        }
        else if (filterParam.equals(Constants.NUMBER_FILTER.ODD.toString())) {
           Filter=new FilterOdd();
        }
       else if (filterParam.equals(Constants.NUMBER_FILTER.PALINDROME.toString())) {
            Filter=new FilterNumberPalindrome();
        }
        else if (filterParam.equals(Constants.NUMBER_FILTER.PRIME.toString())) {
            Filter=new FilterPrime();
        }
        else  if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_7.toString())) {
            Filter=new FilterMultipleOf7();
        }
        else if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_11.toString())) {
            Filter=new FilterMultipleOf11();
        } else {
            System.out.println("FILTER NOT FOUND:" + "'" + filterParam + "'");
            return new ArrayList<>();
        }
        return contextNumberFilter.executeStrategy(Filter,data);
    }

}
