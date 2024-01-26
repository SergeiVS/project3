package Entity;

public class TextData {
    private String textToSearch;
    private  String[] splitText;

    public void setTextToSearch(String textToSearch) {
        this.textToSearch = textToSearch;
    }

    public void setSplitText(String[] splitText) {
        this.splitText = splitText;
    }

    public String getTextToSearch() {
        return textToSearch;
    }

    public String[] getSplitText() {
        return splitText;
    }

    @Override
    public String toString() {
        return "TextData{" +
                "textToSearch='" + textToSearch + '\'' +
                '}';
    }
}
