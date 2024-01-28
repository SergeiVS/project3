package task2;

public class TextLengthApp {
    public static void main(String[] args) {

        StringLengthCheck check = new StringLengthCheck();

        String text = "\",Gibt, es universelle Regeln, wann ein Wort maskulin, feminin oder neutral ist? Leider nur sehr wenige. Wenn du wirklich sicher sein willst, ob ein Substantiv mit der, die oder das benutzt wird, musst du das Genus auswendig lernen. Du solltest also bei jeder neuen Vokabel nicht nur lernen, was sie heißt, sondern auch, welches Genus sie hat.\"";
        check.textAnalyze(text);
    }
}
