package task3;

import homework.Pocker.services.utils.UserInput;

import java.util.HashMap;
import java.util.Map;

public class Glossary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        homework.Pocker.services.utils.UserInput ui = new UserInput();

        dictionary.put("value", "значение");
        dictionary.put("key", "ключ");
        dictionary.put("map", "карта");
        dictionary.put("task", "задание");
        dictionary.put("collection", "коллекция");

        System.out.println(dictionary);

        String searchedWord = ui.uiText("Insert word to translate: ");

        String translateOfSearchedWord = dictionary.get(searchedWord);

        System.out.println("translate into russian of the word- " + searchedWord + "  is:" + translateOfSearchedWord);

        dictionary.remove(searchedWord);

        System.out.println(dictionary);


    }
}
