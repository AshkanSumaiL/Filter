package com.company.commands.filter;

import java.util.ArrayList;
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
}
