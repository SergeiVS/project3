package Entity;

import java.util.List;
import java.util.Map;

public interface TextOperationsInterface {
    void textInput(String text);

    String[] splitText(String text);
    List<String> findAllWords();
    Map<String, Integer> findWordsUsage();
    Map<String, Integer> mostUsedWord();
    Map<String, Integer> lessUsedWord();


}
