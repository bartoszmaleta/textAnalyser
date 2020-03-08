package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class FileContent implements IterableText {

    private String filename;
    private String content;

    public FileContent(String filename) {
        this.filename = filename;
    }

    @Override
    public Iterator<String> wordIterator() {
        return new WordIterator(this);
    }

    public String getFilename() {
        return filename;
    }

    public String readFile() {
        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }

        return content;
    }
}
