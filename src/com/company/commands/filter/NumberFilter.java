package com.company.commands.filter;

import com.company.commands.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public static List<String> filter(String filterParam, List<String> data) {
        if (filterParam.equals(Constants.NUMBER_FILTER.EVEN.toString())) {
            return NumberFilter.even(data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.ODD.toString())) {
            return NumberFilter.odd(data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.PALINDROME.toString())) {
            return NumberFilter.palindrome(data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.PRIME.toString())) {
            return NumberFilter.prime(data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_7.toString())) {
            return NumberFilter.multipleOf7(data);
        }
        if (filterParam.equals(Constants.NUMBER_FILTER.MULTIPLE_OF_11.toString())) {
            return NumberFilter.multipleOf11(data);
        } else {
            System.out.println("FILTER NOT FOUND:" + "'" + filterParam + "'");
            return new ArrayList<>();
        }
    }

    private static List<String> even(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isEven(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<String> odd(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isOdd(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<String> prime(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isPrime(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<String> palindrome(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isPalindrome(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<String> multipleOf7(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isMultipleOf7(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<String> multipleOf11(List<String> numbers) {
        return numbers.stream()
                .filter(number -> isMultipleOf11(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(int number) {
        int remainder, sum = 0, temp;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        return temp == sum;
    }

    private static boolean isPrime(int number) {
        int multiples = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                multiples++;
            }
        }
        return multiples == 2;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static boolean isMultipleOf11(int number) {
        return number % 11 == 0;
    }

    private static boolean isMultipleOf7(int number) {
        return number % 7 == 0;
    }
}
