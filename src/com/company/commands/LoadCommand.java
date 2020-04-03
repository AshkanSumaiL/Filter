package com.company.commands;

import com.company.commands.Interface.ParametrizedCommand;
import com.company.dataStructures.FileInput;

import java.io.IOException;

public class LoadCommand extends ParametrizedCommand {
    FileInput fileInput;
    String target;

    public LoadCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() throws IOException {
    }

    public FileInput getFileInput() {
        return fileInput;
    }


    @Override
    public void setParams(String target) throws IOException {
        this.target = target;
        fileInput = new FileInput(target);
    }

    public String getContent() {
        return fileInput.getContent();
    }
}
