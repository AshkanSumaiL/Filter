package com.company.commands;


import com.company.commands.Interface.Command;


public class ExitCommand extends Command {

    public ExitCommand(String name, String description) {
        super(name, description);
    }

    public void execute() {
        System.exit(0);
    }
}
