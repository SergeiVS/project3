import Entity.TextData;
import Entity.TextOperations;
import Service.*;
import UserInterfase.*;

import java.util.ArrayList;
import java.util.List;

public class TextApp {
    public static void main(String[] args) {

        TextData textData = new TextData();
        TextOperations operations = new TextOperations(textData);
        Validation validation = new Validation();

        FindWordsFrequent findWordsUsage = new FindWordsFrequent(textData, operations, validation);
        FindAllWordsFromText findAllWordsFromText = new FindAllWordsFromText(operations,validation,textData);
        MostLessFrequentWord mostLessFrequentWord = new MostLessFrequentWord(operations, validation, textData);
        TextInputService textInputService = new TextInputService(operations);

        GetTextMenu getTextMenu = new GetTextMenu(textInputService);
        FindAllWordsMenu findAllWordsMenu = new FindAllWordsMenu(findAllWordsFromText);
        FindWordsUsageMenu findWordsUsageMenu = new FindWordsUsageMenu(findWordsUsage);
        FindMostLessUsedWordsMenu findMostLessUsedWordsMenu = new FindMostLessUsedWordsMenu(mostLessFrequentWord);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommandInterface> commands = new ArrayList<>();

        commands.add(findAllWordsMenu);
        commands.add(findWordsUsageMenu);
        commands.add(findMostLessUsedWordsMenu);
        commands.add(exitMenu);

        UserMenu userMenu = new UserMenu(commands, getTextMenu);

        userMenu.userMenuCommands();


    }
}
