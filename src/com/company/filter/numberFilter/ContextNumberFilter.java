package com.company.filter.numberFilter;

import java.util.List;

public class ContextNumberFilter {
    public List<Integer> executeStrategy(StrategyNumberFilter strategyNumberFilter, List<Integer> elements) {
        return strategyNumberFilter.execute(elements);
    }
}
