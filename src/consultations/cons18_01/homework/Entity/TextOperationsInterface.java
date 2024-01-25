package Entity;

import java.util.List;
import java.util.Map;

public interface TextOperationsInterface {
    void textInput(String text);

    String[] splitText(String text);
    List<String> findAllWords(String[] splitText);
    Map<String, Integer> findWordsUsage(String[] splitText);
    Map<String, Integer> mostUsedWord(String[] splitText);
    Map<String, Integer> lessUsedWord(String[] splitText);


}
