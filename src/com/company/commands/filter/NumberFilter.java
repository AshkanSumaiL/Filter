package com.company.commands.filter;

import java.util.ArrayList;
import java.util.List;

public class NumberFilter {
    public static List<String> even(List<String> numbers){
        List<String> evenNumbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isEven(Integer.parseInt(number))){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static List<String> odd(List<String> numbers){
        List<String> evenNumbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isOdd(Integer.parseInt(number))){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static List<String> prime(List<String> numbers) {
        List<String> primeNumbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isPrime(Integer.parseInt(number))){
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public static List<String> palindrome(List<String> numbers) {
        List<String> palindromeNumbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isPalindrome(Integer.parseInt(number))){
                palindromeNumbers.add(number);
            }
        }
        return palindromeNumbers;
    }

    public static List<String> multipleOf7(List<String> numbers) {
        List<String> multipleOf7Numbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isMultipleOf7(Integer.parseInt(number))){
                multipleOf7Numbers.add(number);
            }
        }
        return multipleOf7Numbers;
    }

    public static List<String> multipleOf11(List<String> numbers) {
        List<String> multipleOf11Numbers = new ArrayList<String>();
        for (String number : numbers) {
            if(isMultipleOf11(Integer.parseInt(number))){
                multipleOf11Numbers.add(number);
            }
        }
        return multipleOf11Numbers;
    }

    public static boolean isPalindrome(int number){
        int remainder,sum=0,temp;
        temp=number;
        while(number>0){
            remainder=number%10;
            sum=(sum*10)+remainder;
            number=number/10;
        }
        return temp == sum;
    }

    public static boolean isPrime(int number){
        int multiples=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                multiples++;
            }
        }
        return multiples == 2;
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }
    private static boolean isOdd(int number){
        return number % 2 != 0;
    }
    private static boolean isMultipleOf11(int number){
        return number % 11 == 0;
    }
    private static boolean isMultipleOf7(int number){
        return number % 7 == 0;
    }
}
