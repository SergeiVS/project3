package task2;

import java.util.*;

public class StringLengthCheck {

    public static final char ASCII_A = 'a';
    public static final char ASCII_Z = 'z';

    private List<String> textToWordsList(String text) {
        String[] wordsFromText = text.trim().toLowerCase().split(" ");
        return new ArrayList<>(List.of(wordsFromText));
    }

    private HashSet<String> uniqueWordSet(List<String> wordsList) {

        Set<String> uniqueWords = new HashSet<>(wordsList);

        return (HashSet<String>) onlyChars(uniqueWords);

    }

    private Set<String> onlyChars(Set<String> uniqueWordSet) {

        Set<String> noSymbolsSet = new HashSet<>();

        for (String word : uniqueWordSet) {

            StringBuilder s = new StringBuilder();

            String clearWord = onlyChars(word, s);

            noSymbolsSet.add(clearWord);
        }
        return noSymbolsSet;
    }

    private static String onlyChars(String word, StringBuilder s) {


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= ASCII_A && c <= ASCII_Z)
                s.append(c);
        }
        return String.valueOf(s);
    }

    private List<String> findWordsLongerAsFive(Set<String> uniqueWordSet) {

        List<String> londWordsList = new ArrayList<>();

        for (String word : uniqueWordSet) {
            if (word.length() > 5) {

                londWordsList.add(word);
            }
        }
        return londWordsList;
    }

    public void textAnalyze(String text) {

        List<String> wordsFromText = textToWordsList(text);
        Set<String> uniqueWordsFromText = uniqueWordSet(wordsFromText);
        Integer wordsCount = uniqueWordsFromText.size();
        List<String> longWordsFromText = findWordsLongerAsFive(uniqueWordsFromText);
        System.out.println("============================================");
        System.out.println("text contains " + wordsCount + " unique words");

        for (String word : longWordsFromText) {
            System.out.println(word);
        }
    }
}

