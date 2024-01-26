package Entity;

import java.util.*;

public class TextOperations implements TextOperationsInterface {

    private final TextData textData;

    public TextOperations(TextData textData) {
        this.textData = textData;
    }

    @Override
    public void textInput(String text) {
        textData.setSplitText(splitText(text));
        textData.setTextToSearch(text);
    }

    @Override
    public String[] splitText(String text) {

        return text.split(" ");
    }

    @Override
    public List<String> findAllWords( ){
        String[] splitText = textData.getSplitText();
        Set<String> allWords = new HashSet<>(List.of(splitText));
        return new ArrayList<>(allWords);
    }

    @Override
    public Map<String, Integer> findWordsUsage() {

        String[] splitText = textData.getSplitText();
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
    public Map<String, Integer> mostUsedWord() {

        Map<String, Integer> wordUsageCounter = findWordsUsage();
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
    public Map<String, Integer> lessUsedWord() {

        Map<String, Integer> wordUsageCounter = findWordsUsage();

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
