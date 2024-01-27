package task2;

import java.util.*;

public class StringLengthCheck {

    private List<String> textToWordsList(String text){
        String[] wordsFromText = text.trim().toLowerCase().split(" ");
       return new ArrayList<>(List.of(wordsFromText));
    }

    private HashSet<String> uniqueWordSet(List<String> wordsList){
        return new HashSet<>(wordsList);
    }

    private void cleanUpSymbols(Set<String> uniqueWordSet){
        for (String word : uniqueWordSet) {
            
            StringBuilder s = new StringBuilder();

            findSymbols(word, s);
            if(!word.equals(s)) {
                uniqueWordSet.remove(word);
                uniqueWordSet.add(String.valueOf(s));
            }
        }
    }

    private static void findSymbols(String word, StringBuilder s) {


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
if(c != '!' && c != '?' && c != ',' && c != '.' && c !='(' && c != ')' && c != '"' && c != ':' && c != ';')
            s.append(c);
        }
    }

    private List<String> findWordsLongerAsFive(Set<String> uniqueWordSet){

        List<String> londWordsList = new ArrayList<>();

        for ( String word : uniqueWordSet) {
            if (word.length() > 5){

                londWordsList.add(word);
            }
        }
        return londWordsList;
    }

    public void textAnalyze(String text){

        List<String> wordsFromText = textToWordsList(text);
        Set<String> uniqueWordsFromText = uniqueWordSet(wordsFromText);
        Integer wordsCount = uniqueWordsFromText.size();
        List<String> longWordsFromText = findWordsLongerAsFive(uniqueWordsFromText);
        System.out.println("============================================");
        System.out.println("text contains " + wordsCount + " unique words");

        for (String word : longWordsFromText)
        {
            System.out.println(word);
        }
    }
}

