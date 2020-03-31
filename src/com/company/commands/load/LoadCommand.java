package com.company.commands.load;

import com.company.commands.Interface.Command;

import java.io.IOException;

public class LoadCommand extends Command {
    FileInput fileInput;
    public FileInput getFileInput() {
        return fileInput;
    }
    public LoadCommand(String params) throws IOException {
        super(params);
        execute();
    }

    @Override
    public void execute() throws IOException {
        fileInput = new FileInput(params);
    }
}
