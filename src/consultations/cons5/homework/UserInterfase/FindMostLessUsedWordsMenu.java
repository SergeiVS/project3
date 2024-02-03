package UserInterfase;

import Dto.ResponseMostAndLessUsedWords;
import Service.MostLessFrequentWord;

public class FindMostLessUsedWordsMenu implements MenuCommandInterface{

    private final MostLessFrequentWord service;

    public FindMostLessUsedWordsMenu(MostLessFrequentWord service) {
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
