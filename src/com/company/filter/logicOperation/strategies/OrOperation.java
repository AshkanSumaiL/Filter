package com.company.filter.logicOperation.strategies;

import com.company.dataStructures.Data;
import com.company.filter.Filterer;
import com.company.filter.logicOperation.IStrategyLogicOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrOperation implements IStrategyLogicOperation {
    @Override
    public List<?> execute(Data data, String filterParam) {
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        List<?> temp;
        List<String> result = new ArrayList<>();
        for (String filter : paramsList) {
            temp = Filterer.filter(data, filter);
            for (Object num : temp) {
                if (!result.contains(num)) {
                    result.add((String) num);
                }
            }
        }
        return result;
    }
}