package com.company.filter.wordFilter;

import java.util.List;

public class ContextWordFilter {
    public List<String> executeStrategy(IStrategyWordFilter strategyWordFilter, List<String> elements) {
        return strategyWordFilter.execute(elements);
    }
}
