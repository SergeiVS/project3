package UserInterfase;


import Dto.ResponseFindAllWords;
import Service.FindAllWordsFromText;

public class FindAllWordsMenu implements MenuCommandInterface{
    private final FindAllWordsFromText allWordsFromText;

    public FindAllWordsMenu(FindAllWordsFromText allWordsFromText) {
        this.allWordsFromText = allWordsFromText;
    }


    @Override
    public boolean executeCommand() {

        ResponseFindAllWords responseFindAllWords = allWordsFromText.findAllWords();
        System.out.println(responseFindAllWords);
        return true;

    }

    @Override
    public String getCommandName() {
        return "Find all words from text";
    }
}
