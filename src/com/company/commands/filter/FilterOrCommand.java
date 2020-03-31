package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterOrCommand extends FilterCommand {

    public FilterOrCommand(String type, String params, List<String> data) {
        super(type, params, data);
        execute();
    }

    @Override
    public void execute() {
        List<String> paramsList = new ArrayList<String>(Arrays.asList(params.split(" ")));
        List<String> temp;
        List<String> result = new ArrayList<String>();

        for (String param : paramsList) {
            FilterCommand filterCommand = new FilterCommand(type, param, super.data);
            temp = filterCommand.filter();

            for (String num : temp) {
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        System.out.println(result);
    }
}
