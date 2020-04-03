package com.company.filter.numberFilter;

import java.util.List;
import java.util.stream.Collectors;


class FilterEven implements IStrategyNumberFilter{
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isEven)
                .collect(Collectors.toList());
    }
}

class FilterOdd implements IStrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isOdd)
                .collect(Collectors.toList());
    }
}

class FilterPrime implements IStrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isPrime)
                .collect(Collectors.toList());
    }
}

class FilterNumberPalindrome implements IStrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isPalindrome)
                .collect(Collectors.toList());
    }

}

class FilterMultipleOf7 implements IStrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isMultipleOf7)
                .collect(Collectors.toList());
    }
}

class FilterMultipleOf11 implements IStrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isMultipleOf11)
                .collect(Collectors.toList());
    }
}