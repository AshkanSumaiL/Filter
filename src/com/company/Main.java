package com.company;

import com.company.commands.CommandList;
import com.company.commands.Interface.Command;
import com.company.commands.Interface.ParametrizedCommand;
import com.company.dataStructures.Data;
import com.company.commands.FilterCommand;
import com.company.commands.LoadCommand;
import com.company.commands.HelpCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static CommandList commandList = new CommandList();
    static Command currentCommand;
    static Data data;

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Insert a command:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            currentCommand = commandList.findCommand(line);
            if (currentCommand instanceof LoadCommand || currentCommand instanceof FilterCommand) {
                ((ParametrizedCommand) currentCommand).setParams(line.substring(line.indexOf(" ") + 1));
                if (currentCommand instanceof LoadCommand) {
                    data = new Data(((LoadCommand) currentCommand).getContent());
                }
                if (currentCommand instanceof FilterCommand) {
                    ((FilterCommand) currentCommand).setData(data);
                }
            }
            if (currentCommand instanceof HelpCommand) {
                ((HelpCommand) currentCommand).setCommands(commandList.getCommands());
            }
            currentCommand.execute();
        }
    }

}
