package com.company.filter.wordFilter;

import java.util.List;

public interface IStrategyWordFilter {
    public List<String> execute(List<String> elements);
}

