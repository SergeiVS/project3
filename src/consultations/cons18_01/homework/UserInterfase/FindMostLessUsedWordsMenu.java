package UserInterfase;

import Dto.ResponseMostAndLessUsedWords;
import Service.MostLessUsedWord;

public class FindMostLessUsedWordsMenu implements MenuCommandInterface{

    private final MostLessUsedWord service;

    public FindMostLessUsedWordsMenu(MostLessUsedWord service) {
        this.service = service;
    }

    @Override
    public boolean executeCommand() {

        ResponseMostAndLessUsedWords response = service.mostAndLessUsedWords();
        System.out.println(response);
        return true;
    }

    @Override
    public String getCommandName() {
        return "Most and less used words in the text";
    }
}
