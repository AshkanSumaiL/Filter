package com.company.commands.Interface;

import java.io.IOException;

public abstract class Command {
    protected String params;

    public Command(String params) {
        this.params = params;
    }

    public abstract void execute() throws IOException;

}
