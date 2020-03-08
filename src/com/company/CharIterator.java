package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CharIterator implements Iterator<Character> {
    Character[] chars;
    private int pos;

    public CharIterator(FileContent fileContent) {
        String allFile = fileContent.readFile();
        System.out.println(allFile);

        int lengthOfFile = fileContent.readFile().length();

        this.chars = new Character[lengthOfFile];

        for (int i = 0; i < lengthOfFile; i++) {
            chars[i] = allFile.charAt(i);
        }
    }


    @Override
    public boolean hasNext() {
        return pos < chars.length;
    }

    @Override
    public Character next() {
        if (pos >= chars.length) {
            throw new NoSuchElementException("no more chars in file");
        }

        return chars[pos++];
    }
}
