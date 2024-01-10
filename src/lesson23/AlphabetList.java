import java.util.ArrayList;
import java.util.Collections;

public class AlphabetList {
    public ArrayList<Character> alphabet = new ArrayList<Character>();
    public ArrayList<Character> reversAlphabet = alphabet;



    public void setLatinAlphabet(){

        for (char i = 'a'; i <= 'z'; i++) {
             alphabet.add(i);
        }
    }

    public ArrayList<Character> getAlphabet() {
        return alphabet;
    }

    @Override
    public String toString() {
        return "AlphabetList{" +
                "alphabet=" + alphabet +
                '}';
    }


}
