import Entity.TextOperations;
import Service.*;
import UserInterfase.*;

import java.util.ArrayList;
import java.util.List;

public class TextApp {
    public static void main(String[] args) {
        TextOperations operations = new TextOperations();
        Validation validation = new Validation();
        FindWordsUsage findWordsUsage = new FindWordsUsage();
        FindAllWordsFromText findAllWordsFromText = new FindAllWordsFromText();
        MostLessUsedWord mostLessUsedWord = new MostLessUsedWord();
        TextInputService textInputService = new TextInputService();

        GetTextMenu getTextMenu = new GetTextMenu(textInputService);
        FindAllWordsMenu findAllWordsMenu = new FindAllWordsMenu(findAllWordsFromText);
        FindWordsUsageMenu findWordsUsageMenu = new FindWordsUsageMenu(findWordsUsage);
        FindMostLessUsedWordsMenu findMostLessUsedWordsMenu = new FindMostLessUsedWordsMenu(mostLessUsedWord);
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
