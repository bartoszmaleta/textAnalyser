package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CharIterator implements Iterator<Character> {
    char[] chars;
    private int pos;

    public CharIterator(FileContent fileContent) {
        String allFile = fileContent.readFile();
//        System.out.println(allFile);

        chars = allFile.toCharArray();
//        System.out.println(chars.length);
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
