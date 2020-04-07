package com.company.filter;

import com.company.dataStructures.Data;

import com.company.filter.logicOperation.strategies.AndOperation;
import com.company.filter.logicOperation.strategies.OrOperation;
import com.company.filter.numberFilter.NumberFilterSelector;
import com.company.filter.wordFilter.WordFilterSelector;

import java.util.ArrayList;
import java.util.List;

public final class Filterer {
    public static List<?> filter(Data data, String filterParam) {
        if (data.getType().equals("int")) {
            return NumberFilterSelector.filter(filterParam, (List<Integer>) data.getInfo());
        }
        if (data.getType().equals("string")) {
            return WordFilterSelector.filter(filterParam, (List<String>) data.getInfo());
        } else {
            System.out.println("Data Type not defined");
            return new ArrayList<>();
        }
    }

    public static List<?> filterAnd(Data data, String filterParam) {
        AndOperation andOperation = new AndOperation();
        return andOperation.execute(data,filterParam);
    }

    public static List<?> filterOr(Data data, String filterParam) {
        OrOperation orOperation = new OrOperation();
        return orOperation.execute(data,filterParam);
    }

}
