package homework.task3;

public class WordCount {

    UserInput3 ui = new UserInput3();
    private String line = ui.uiText("Please insert your string: ");



    private int wordCount() {
        int wordCount = 0;
        String trim = getTrim(line);
        if (trim == null) return 0;
        int endOfLine = trim.length() - 1;
        boolean word = false;
        for (int i = 0; i < trim.length(); i++) {
            if (Character.isLetter(trim.charAt(i)) && i != endOfLine) {word = true;}
            if (!Character.isLetter(trim.charAt(i)) && word){
                wordCount++;
                word = false;
            }
            if (Character.isLetter(trim.charAt(i)) && i == endOfLine) {
                word = true;
                wordCount++;
            }
        }
        return wordCount;
    }


        private String getTrim (String line){
            String trim = line.trim();
            if (trim.isEmpty()) {
                return null;
            }
            return trim;
        }
        public void printOut(){
            System.out.println("In our string are " + wordCount() + " words");
        }
    }