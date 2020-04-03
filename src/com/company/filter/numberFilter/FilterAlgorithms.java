package com.company.filter.numberFilter;

public class FilterAlgorithms {
    public  static boolean isPrime(int number) {
        int multiples = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                multiples++;
            }
        }
        return multiples == 2;
    }

    public static boolean isPalindrome(int number) {
        int remainder, sum = 0, temp;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        return temp == sum;
    }

    public static boolean isMultipleOf7(int number) {
        return number % 7 == 0;
    }
    public static boolean isMultipleOf11(int number) {
        return number % 11 == 0;
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
