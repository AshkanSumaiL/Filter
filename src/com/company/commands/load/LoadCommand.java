package com.company.commands.load;

import com.company.commands.Interface.CommandParam;

import java.io.IOException;

public class LoadCommand extends CommandParam {
    FileInput fileInput;

    public void setTarget(String target) throws IOException {
        this.target = target;
        fileInput = new FileInput(target);
    }

    String target;

    public LoadCommand(String name, String description) {
        super(name, description);
    }

    public FileInput getFileInput() {
        return fileInput;
    }


    @Override
    public void execute() throws IOException {
    }

    public String getContent() {
        return fileInput.getContent();
    }
}
