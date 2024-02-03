package UserInterfase;

import Dto.ResponseWordsFrequency;
import Service.FindWordsFrequent;

public class FindWordsUsageMenu implements MenuCommandInterface{
    private final FindWordsFrequent service;

    public FindWordsUsageMenu(FindWordsFrequent service) {
        this.service = service;
    }

    @Override
    public boolean executeCommand() {

        ResponseWordsFrequency response = service.wordsUsage();
        System.out.println(response);

        return true;

    }

    @Override
    public String getCommandName() {
        return "Find words using scores";
    }
}
