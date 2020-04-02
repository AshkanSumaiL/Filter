package com.company.commands.Interface;

import java.io.IOException;

public abstract class ParametrizedCommand extends Command {
    public void setParams(String params) throws IOException {
        this.params = params;
    }

    protected String params;

    public ParametrizedCommand(String name, String description) {
        super(name, description);
    }
}
