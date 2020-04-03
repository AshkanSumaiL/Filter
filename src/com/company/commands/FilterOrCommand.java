package com.company.commands;

import com.company.filter.Filterer;

public class FilterOrCommand extends FilterCommand {
    public FilterOrCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        System.out.println(Filterer.filterOr(data, filterParam));
    }
}
