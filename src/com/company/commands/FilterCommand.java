package com.company.commands;

import com.company.commands.Interface.ParametrizedCommand;
import com.company.dataStructures.Data;
import com.company.filter.Filterer;

public class FilterCommand extends ParametrizedCommand {
    protected Data data;
    protected String filterParam;

    public FilterCommand(String name, String description) {
        super(name, description);
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public void setParams(String filterParam) {
        this.filterParam = filterParam;
    }

    @Override
    public void execute() {
        System.out.println(Filterer.filter(data, filterParam));
    }

}
