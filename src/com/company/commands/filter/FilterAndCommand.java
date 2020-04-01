package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAndCommand extends FilterCommand {

    public FilterAndCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        List<String> paramsList = new ArrayList<String>(Arrays.asList(filterParam.split(" ")));
        Data aux=new Data(data);
        for (String filterParam : paramsList) {
            aux.setInfo(Filterer.filter(aux, filterParam));
        }
        System.out.println(aux.getInfo());
    }
}
