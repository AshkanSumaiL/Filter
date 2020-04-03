package com.company.commands;

import com.company.Constants;
import com.company.commands.Interface.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandList {
    public List<Command> getCommands() {
        return commands;
    }

    private List<Command> commands = new ArrayList<>();

    public CommandList() {
        commands.add(new LoadCommand(Constants.COMMANDS.LOAD.toString(), "Loads a file"));
        commands.add(new FilterCommand(Constants.COMMANDS.FILTER.toString(), "Filters a word or number"));
        commands.add(new FilterAndCommand(Constants.COMMANDS.FILTER_AND.toString(), "Filters AND a word or number"));
        commands.add(new FilterOrCommand(Constants.COMMANDS.FILTER_OR.toString(), "Filters OR a word or number"));
        commands.add(new ExitCommand(Constants.COMMANDS.EXIT.toString(), "Out of System"));
        commands.add(new HelpCommand(Constants.COMMANDS.HELP.toString(), "Shows all commands and descriptions"));
    }

    public Command findCommand(String commandName) {
        String firstWord = !commandName.contains(" ") ?
                commandName : commandName.substring(0, commandName.indexOf(" "));
        for (Command command : commands) {
            if (firstWord.equals(command.getName())) {
                return command;
            }
        }
        return null;
    }
}
