package com.company.commands.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    public String getContent() {
        return content;
    }

    String content;

    public FileInput(String target) throws IOException {
        readFile(target);
    }

    private void readFile(String target) throws IOException {
        File file = new File(target);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            text.append(line);
        }
        content = text.toString();
        System.out.println(content);
    }

}

