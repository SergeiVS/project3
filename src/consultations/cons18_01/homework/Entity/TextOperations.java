package Entity;

import java.util.*;

public class TextOperations implements TextOperationsInterface {

    private final TextData textData;

    public TextOperations(TextData textData) {
        this.textData = textData;
    }


    @Override
    public void textInput(String text) {
        textData.setTextToSearch(text);
        splitText(text);
        findAllUniqWords();
        findWordsFrequent();
        mostFrequentWord();
        lessUsedWord();
    }

    @Override
    public void splitText(String text) {

        List<String> splitT = List.of(text.split(" "));
        textData.setSplitText(splitT);
    }

    @Override
    public void findAllUniqWords( ){
        List<String> splitText = textData.getSplitText();
        Set<String> allWords = textData.getAllUniqWords();
        allWords.addAll(splitText);
        textData.setAllUniqWords(allWords);
    }

    @Override
    public void findWordsFrequent() {

        List<String> splitText = textData.getSplitText();
        Map<String, Integer> wordsFrequentCounter =  textData.getWordFrequency();

        for (String word : splitText) {
           word = word.toLowerCase();
           wordsFrequentCounter.put(word, wordsFrequentCounter.getOrDefault(word, 0)+1);
        }
        textData.setWordFrequency(wordsFrequentCounter);
    }

    @Override
    public void mostFrequentWord() {

        Map<String, Integer> wordFrequentCounter = textData.getWordFrequency();
        Integer maxWordFrequency = Collections.max(wordFrequentCounter.values());
        Map<String, Integer> mostFrequentWords = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = wordFrequentCounter.entrySet().iterator();

        while (iterator.hasNext()){

            if (iterator.next().getValue().equals(maxWordFrequency)){
               mostFrequentWords.put(iterator.next().getKey(),maxWordFrequency);
            }
        }
        textData.setMostFrequentWord(mostFrequentWords);
    }

    @Override
    public void  lessUsedWord() {

        Map<String, Integer> wordUsageCounter = textData.getWordFrequency();

        Integer minWordFrequency = Collections.min(wordUsageCounter.values());

        Map<String, Integer> lessFrequentWords = textData.getLessFrequentWord();

        Iterator<Map.Entry<String, Integer>> iterator = wordUsageCounter.entrySet().iterator();

        while (iterator.hasNext()){
            if (iterator.next().getValue().equals(minWordFrequency)){
                lessFrequentWords.put(iterator.next().getKey(),minWordFrequency);
            }
        }

        textData.setLessFrequentWord(lessFrequentWords);
    }


}
