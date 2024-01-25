package Entity;

import Dto.WordDto;

import java.util.*;

public class TextOperations implements TextOperationsInterface {

    private String[] splitText;

    public String[] getSplitText() {
        return splitText;
    }

    public void setSplitText(String[] splitText) {
        this.splitText = splitText;
    }

    @Override
    public void textInput(String text) {
        TextToSearch textToSearch = new TextToSearch(text);
        setSplitText(splitText(text));
    }

    @Override
    public String[] splitText(String text) {

        return text.split(" ");
    }

    @Override
    public List<String> findAllWords(String[] splitText) {
        Set<String> allWords = new HashSet<>(List.of(splitText));
        return new ArrayList<>(allWords);
    }

    @Override
    public Map<String, Integer> findWordsUsage(String[] splitText) {
        Map<String, Integer> wordsUsageCounter =  new HashMap<>();
        for (int i = 0; i < splitText.length; i++)
        {
            String word = splitText[i];
           if(!wordsUsageCounter.containsKey(word)){wordsUsageCounter.put(word, 1);
           }
           else
           {
               int oldCount = wordsUsageCounter.get(word);
               wordsUsageCounter.replace(word, oldCount, oldCount++);
           }
        }
        return wordsUsageCounter;
    }

    @Override
    public Map<String, Integer> mostUsedWord(String[] splitText) {

        Map<String, Integer> wordUsageCounter = findWordsUsage(splitText);
        Integer maxWordUsage = Collections.max(wordUsageCounter.values());
        Map<String, Integer> mostUsedWords = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = wordUsageCounter.entrySet().iterator();

        while (iterator.hasNext()){

            if (iterator.next().getValue().equals(maxWordUsage)){
               mostUsedWords.put(iterator.next().getKey(),maxWordUsage);
            }
        }
        return mostUsedWords;
    }

    @Override
    public Map<String, Integer> lessUsedWord(String[] splitText) {

        Map<String, Integer> wordUsageCounter = findWordsUsage(splitText);
        Integer minWordUsage = Collections.max(wordUsageCounter.values());
        Map<String, Integer> lessUsedWords = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = wordUsageCounter.entrySet().iterator();

        while (iterator.hasNext()){
            if (iterator.next().getValue().equals(minWordUsage)){
                lessUsedWords.put(iterator.next().getKey(),minWordUsage);
            }
        }

        return lessUsedWords;
    }


}
