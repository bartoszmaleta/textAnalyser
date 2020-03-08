package com.company;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StatisticalAnalysis {
    FileContent fileContent = new FileContent("resources/test.txt");
    private WordIterator wordIterator;

    public StatisticalAnalysis() {
        wordIterator = new WordIterator(fileContent);
    }


    public void countOf(String... elems) {

    }

    public int dictionarySize() {
        WordIterator wordIterator = new WordIterator(fileContent);

        HashMap<String, Integer> dicWor = new HashMap<>();
        while (wordIterator.hasNext()) {
            String word = wordIterator.next();
            if (!dicWor.containsKey(word)) {
                dicWor.put(word, 1);
            } else {
                dicWor.put(word, dicWor.get(word) + 1);
            }
        }
        return dicWor.size();
    }

    public void displayDictionarySize() {
        System.out.println("Dict size: " + dictionarySize());
    }

    public void displayDictionary() {

        WordIterator wordIterator = new WordIterator(fileContent);

        HashMap<String, Integer> dicWor = new HashMap<>();
        while (wordIterator.hasNext()) {
            String word = wordIterator.next();
            if (!dicWor.containsKey(word)) {
                dicWor.put(word, 1);
            } else {
                dicWor.put(word, dicWor.get(word) + 1);
            }
        }
        for (String word: dicWor.keySet()) {
            System.out.println("Word " + word + " occurred " + dicWor.get(word) + " times");
        }
    }

    public int numberOfWords() {
        int counter = 0;
        HashMap<String, Integer> dicWor = new HashMap<>();
        while (wordIterator.hasNext()) {
            wordIterator.next();
            counter++;
        }
        return counter;
    }

    public void displayWordCount() {
        System.out.println("Word count: " + numberOfWords());
    }


}
