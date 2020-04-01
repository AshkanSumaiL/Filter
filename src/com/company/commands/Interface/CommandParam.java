package com.company.commands.Interface;

public abstract class CommandParam extends Command {
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    protected String params;

    public CommandParam(String name, String description) {
        super(name, description);
    }
}
