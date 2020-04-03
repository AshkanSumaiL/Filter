package com.company.filter.numberFilter;

import java.util.List;
import java.util.stream.Collectors;

public interface StrategyNumberFilter {
    public List<Integer> execute(List<Integer> elements);
}

class FilterEven implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isEven)
                .collect(Collectors.toList());
    }
}

class FilterOdd implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isOdd)
                .collect(Collectors.toList());
    }
}

class FilterPrime implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isPrime)
                .collect(Collectors.toList());
    }
}

class FilterNumberPalindrome implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isPalindrome)
                .collect(Collectors.toList());
    }

}

class FilterMultipleOf7 implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isMultipleOf7)
                .collect(Collectors.toList());
    }
}

class FilterMultipleOf11 implements StrategyNumberFilter {
    @Override
    public List<Integer> execute(List<Integer> elements) {
        return elements.stream()
                .filter(FilterAlgorithms::isMultipleOf11)
                .collect(Collectors.toList());
    }
}