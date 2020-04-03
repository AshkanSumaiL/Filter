package com.company.filter;

import com.company.dataStructures.Data;
import com.company.filter.numberFilter.NumberFilterSelector;
import com.company.filter.wordFilter.WordFilterSelector;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        Data aux = new Data(data);
        for (String filter : paramsList) {
            aux.setInfo(filter(aux, filter));
        }
        return aux.getInfo();
    }

    public static List<?> filterOr(Data data, String filterParam) {
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        List<?> temp;
        List<String> result = new ArrayList<>();
        for (String filter : paramsList) {
            temp = filter(data, filter);
            for (Object num : temp) {
                if (!result.contains(num)) {
                    result.add((String) num);
                }
            }
        }
        return result;
    }

}
