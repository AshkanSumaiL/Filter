package com.company.filter.logicOperation.strategies;

import com.company.dataStructures.Data;
import com.company.filter.Filterer;
import com.company.filter.logicOperation.IStrategyLogicOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AndOperation implements IStrategyLogicOperation {
    @Override
    public List<?> execute(Data data, String filterParam) {
        List<String> paramsList = new ArrayList<>(Arrays.asList(filterParam.split(" ")));
        Data aux = new Data(data);
        for (String filter : paramsList) {
            aux.setInfo(Filterer.filter(aux, filter));
        }
        return aux.getInfo();
    }
}


