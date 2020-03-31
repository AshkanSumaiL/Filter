package com.company;

import com.company.commands.filter.FilterAndCommand;
import com.company.commands.filter.FilterCommand;
import com.company.commands.filter.FilterOrCommand;
import com.company.commands.load.FileInput;
import com.company.commands.load.LoadCommand;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInput fileInput = null;
        while(true){
            System.out.println("Insert a command:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            String type = line.substring(0,line.indexOf(" "));

            String params  = line.substring(line.indexOf(" ")+1,line.length());

            if(type.equals("LOAD")){
                LoadCommand command = new LoadCommand(params);
                fileInput = command.getFileInput();

            }
            if(type.equals("FILTER")){
                FilterCommand command  = new FilterCommand(fileInput.getType(),params,fileInput.getData());
            }
            if(type.equals("FILTER_AND")){
                FilterAndCommand command  = new FilterAndCommand(fileInput.getType(),params,fileInput.getData());
            }
            if(type.equals("FILTER_OR")){
                FilterOrCommand command  = new FilterOrCommand(fileInput.getType(),params,fileInput.getData());
            }else {
                System.out.println("Command not found");
            }

        }
    }
}
