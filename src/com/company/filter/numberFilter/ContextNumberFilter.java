package com.company.filter.numberFilter;

import java.util.List;

public class ContextNumberFilter {
    public List<Integer> executeStrategy(IStrategyNumberFilter strategyNumberFilter, List<Integer> elements) {
        return strategyNumberFilter.execute(elements);
    }
}
