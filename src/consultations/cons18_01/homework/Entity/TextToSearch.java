package Entity;

public class TextToSearch {
    private String textToSearch;

    public TextToSearch(String textToSearch) {
        this.textToSearch = textToSearch;
    }

    public String getTextToSearch() {
        return textToSearch;
    }

    @Override
    public String toString() {
        return "TextToSearch{" +
                "textToSearch='" + textToSearch + '\'' +
                '}';
    }
}
