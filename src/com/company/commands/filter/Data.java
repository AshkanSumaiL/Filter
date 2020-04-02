package com.company.commands.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    protected String type;
    protected List<String> info;

    public Data(String input) {
        type = input.substring(0, input.indexOf(" "));
        String elements = input.substring(input.indexOf(" ") + 1);
        String[] array = elements.split(" ");
        info = new ArrayList<String>(Arrays.asList(array));
    }

    public Data(Data data) {
        type = data.type;
        info = data.info;
    }

}
