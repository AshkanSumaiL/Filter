package com.company.commands.other;

import com.company.commands.Interface.Command;

import java.util.ArrayList;
import java.util.List;

public class HelpCommand extends Command {
    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    private List<Command> commands = new ArrayList<>();

    public HelpCommand(String name, String description) {
        super(name, description);
    }

    public void execute() {
        System.out.println("ALL COMMANDS:");
        for (Command command : commands) {
            System.out.println(command.getName() + ": " + command.getDescription());
        }
    }
}
