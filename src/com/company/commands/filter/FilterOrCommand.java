package com.company.commands.filter;

public class FilterOrCommand extends FilterCommand {
    public FilterOrCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        System.out.println(Filterer.filterOr(data, filterParam));
    }
}
