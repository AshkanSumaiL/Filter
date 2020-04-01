package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterOrCommand extends FilterCommand {
    public FilterOrCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        List<String> paramsList = new ArrayList<String>(Arrays.asList(filterParam.split(" ")));
        List<String> temp;
        List<String> result = new ArrayList<String>();

        for (String filterParam : paramsList) {
            temp = Filterer.filter(data, filterParam);
            for (String num : temp) {
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        System.out.println(result);
    }
}
