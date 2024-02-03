package Entity;

import java.util.*;

public class TextData {
    private String textToSearch;
    private List<String> splitText;
    private Map<String, Integer> wordFrequency;
    private Set<String> allUniqWords;

    public TextData() {
        this.textToSearch = "";
        this.splitText = new ArrayList<>();
        this.wordFrequency = new HashMap<>();
        this.allUniqWords = new HashSet<>();
        this.mostFrequentWord = new HashMap<>();
        this.lessFrequentWord = new HashMap<>();
    }

    private Map<String, Integer> mostFrequentWord;
    private Map<String, Integer> lessFrequentWord;

    public Map<String, Integer> getLessFrequentWord() {
        return lessFrequentWord;
    }

    public List<String> getSplitText() {
        return splitText;
    }

    public void setSplitText(List<String> splitText) {
        this.splitText = splitText;
    }

    public Set<String> getAllUniqWords() {
        return allUniqWords;
    }

    public void setAllUniqWords(Set<String> allUniqWords) {
        this.allUniqWords = allUniqWords;
    }

    public void setLessFrequentWord(Map<String, Integer> lessFrequentWord) {
        this.lessFrequentWord = lessFrequentWord;
    }

    public Map<String, Integer> getMostFrequentWord() {
        return mostFrequentWord;
    }

    public void setMostFrequentWord(Map<String, Integer> mostFrequentWord) {
        this.mostFrequentWord = mostFrequentWord;
    }

    public void setWordFrequency(Map<String, Integer> wordFrequency) {
        this.wordFrequency = wordFrequency;
    }

    public void setTextToSearch(String textToSearch) {
        this.textToSearch = textToSearch;
    }



    public Map<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    public String getTextToSearch() {
        return textToSearch;
    }



    @Override
    public String toString() {
        return "TextData{" +
                "textToSearch='" + textToSearch + '\'' +
                '}';
    }
}
