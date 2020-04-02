package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Filterer {
    public static List<String> filter(Data data, String filterParam) {
        if (data.type.equals("int")) {
            return NumberFilter.filter(filterParam, data.info);
        }
        if (data.type.equals("string")) {
            return WordFilter.filter(filterParam, data.info);
        } else {
            System.out.println("Data Type not defined");
            return new ArrayList<>();
        }
    }

    public static List<String> filterAnd(Data data, String filterParam) {
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        Data aux = new Data(data);
        for (String filter : paramsList) {
            aux.setInfo(filter(aux, filter));
        }
        return aux.getInfo();
    }

    public static List<String> filterOr(Data data, String filterParam) {
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        List<String> temp;
        List<String> result = new ArrayList<>();
        for (String filter : paramsList) {
            temp = filter(data, filter);
            for (String num : temp) {
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        return result;
    }

}
