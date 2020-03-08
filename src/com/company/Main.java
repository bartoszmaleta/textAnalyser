package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        FileContent fileContent = new FileContent("resources/test.txt");
//        WordIterator wordIterator = (WordIterator) fileContent.wordIterator();
//
//        int counter = 0;
//        while(wordIterator.hasNext()) {
//            System.out.println(wordIterator.next());
//            counter++;
//        }
//
//        System.out.println(counter);

        System.out.println("\n\n\n---------------------------- Word");

        StatisticalAnalysis statisticalAnalysis = new StatisticalAnalysis();

        statisticalAnalysis.displayWordCount();
        statisticalAnalysis.displayDictionarySize();

        statisticalAnalysis.displayDictionary();
    }
}
