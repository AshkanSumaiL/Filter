package com.company.commands.load;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileInput {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    private String data;


    public FileInput(String target) throws IOException {
        readFile(target);
    }

    private void readFile(String target) throws IOException {
        File file = new File(target);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder text= new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line);
        }

        type = text.toString().substring(0,text.toString().indexOf(" "));
        data = text.toString().substring(text.toString().indexOf(" ")+1,text.toString().length());

        System.out.println(type);
        System.out.println(data);
    }

    public List<String> getData(){
        String[] array= data.split(" ");
        return new ArrayList<String>(Arrays.asList(array));
    }

}

