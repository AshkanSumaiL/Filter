package com.company.commands.filter;

import com.company.commands.Interface.CommandParam;

public class FilterCommand extends CommandParam {
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
