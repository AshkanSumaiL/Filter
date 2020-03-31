package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAndCommand extends FilterCommand {
    public FilterAndCommand(String type, String params, List<String> data) {
        super(type, params, data);
        execute();
    }

    @Override
    public void execute() {
        List<String> paramsList = new ArrayList<String>(Arrays.asList(params.split(" ")));
        for (String param : paramsList) {
            FilterCommand filterCommand = new FilterCommand(type, param, super.data);
            super.data = filterCommand.filter();
        }
        System.out.println(super.data);
    }
}
