package com.company.filter.wordFilter;


import java.util.List;
import java.util.stream.Collectors;


class FilterWordPalindrome implements IStrategyWordFilter{
    public List<String> execute(List<String> words) {
        return words.stream()
                .filter(FilterAlgorithms::isPalindrome)
                .collect(Collectors.toList());
    }

}
class FilterAllVowels implements IStrategyWordFilter{
    public List<String> execute(List<String> words) {
        return words.stream()
                .filter(FilterAlgorithms::hasAllVowels)
                .collect(Collectors.toList());
    }

}

class FilterDiphthong implements IStrategyWordFilter{
    public List<String> execute(List<String> words) {
        return words.stream()
                .filter(FilterAlgorithms::isDiphthong)
                .collect(Collectors.toList());
    }
}

class FilterTriphthong implements IStrategyWordFilter{
    public List<String> execute(List<String> words) {
        return words.stream()
                .filter(FilterAlgorithms::isTriphthong)
                .collect(Collectors.toList());
    }
}