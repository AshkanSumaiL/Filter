package com.company.commands;

import com.company.filter.Filterer;


public class FilterAndCommand extends FilterCommand {

    public FilterAndCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        System.out.println(Filterer.filterAnd(data, filterParam));
        //IStrategyNumberFilter andFilter = new AndDecorator(NumberFilterSelector.getFilter(filterParam));
        //System.out.println(andFilter.execute((List<Integer>) data.getInfo()));
    }
}
