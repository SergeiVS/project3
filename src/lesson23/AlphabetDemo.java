import java.util.ArrayList;
import java.util.Collections;

public class AlphabetDemo {
    public static void main(String[] args) {
AlphabetList alphabetList = new AlphabetList();
alphabetList.setLatinAlphabet();
        System.out.println(alphabetList.getAlphabet().toString());
        ArrayList<Character> reversAlphabet = alphabetList.getAlphabet();
        Collections.reverse(reversAlphabet);
        System.out.println(reversAlphabet);
    }
}
