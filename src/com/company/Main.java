package com.company;

import com.company.commands.CommandList;
import com.company.commands.Interface.Command;
import com.company.commands.filter.Data;
import com.company.commands.filter.FilterAndCommand;
import com.company.commands.filter.FilterCommand;
import com.company.commands.filter.FilterOrCommand;
import com.company.commands.load.LoadCommand;
import com.company.commands.other.HelpCommand;

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
            if (currentCommand instanceof LoadCommand) {
                ((LoadCommand) currentCommand).setTarget(line.substring(line.indexOf(" ") + 1));
                data = new Data(((LoadCommand) currentCommand).getContent());
            }
            if (currentCommand instanceof FilterCommand) {
                ((FilterCommand) currentCommand).setData(data);
                ((FilterCommand) currentCommand).setParams(line.substring(line.indexOf(" ") + 1));
            }
            if (currentCommand instanceof FilterAndCommand) {
                ((FilterAndCommand) currentCommand).setData(data);
                ((FilterAndCommand) currentCommand).setParams(line.substring(line.indexOf(" ") + 1));
            }
            if (currentCommand instanceof FilterOrCommand) {
                ((FilterOrCommand) currentCommand).setData(data);
                ((FilterOrCommand) currentCommand).setParams(line.substring(line.indexOf(" ") + 1));
            }
            if (currentCommand instanceof HelpCommand) {
                ((HelpCommand) currentCommand).setCommands(commandList.getCommands());
            }
            currentCommand.execute();
        }
    }

}
