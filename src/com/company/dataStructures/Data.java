package com.company.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Data {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<?> getInfo() {
        return info;
    }

    public void setInfo(List<?> info) {
        this.info = info;
    }

    private String type;
    private List<?> info;

    public Data(String input) {
        type = input.substring(0, input.indexOf(" "));
        String elements = input.substring(input.indexOf(" ") + 1);
        String[] array = elements.split(" ");
        info = new ArrayList<>(Arrays.asList(array));
        if(type.equals("int")){
            info = info.stream()
                    .map(number -> Integer.parseInt((String) number))
                    .collect(Collectors.toList());
        }
    }

    public Data(Data data) {
        type = data.type;
        info = data.info;
    }

}
