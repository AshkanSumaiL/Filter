package com.company.filter.logicOperation;

import com.company.dataStructures.Data;

import java.util.List;

public interface IStrategyLogicOperation {
    List<?> execute(Data data, String filterParam);
}
