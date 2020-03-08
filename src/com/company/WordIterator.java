package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordIterator implements Iterator<String> {
    String[] words;
    private int pos;

    public WordIterator(FileContent fileContent) {
        this.words = fileContent.readFile().split("\\s+");
    }

    @Override
    public boolean hasNext(){
        return pos < words.length;
    }

    @Override
    public String next(){
        if( pos >= words.length ){
            throw new NoSuchElementException( "no more words in file" );
        }
        return words[pos++];
    }
}