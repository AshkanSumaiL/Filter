package com.company.commands.load;

import com.company.commands.Interface.CommandParam;

import java.io.IOException;

public class LoadCommand extends CommandParam {
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
