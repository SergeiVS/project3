package lessonCode;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabetList {
    public ArrayList<Character> alphabet = new ArrayList<Character>();
    public ArrayList<Character> reversAlphabet = alphabet;

public void arrayRevers(){ Collections.reverse(reversAlphabet);}

    public ArrayList<Character> getReversAlphabet() {
        return reversAlphabet;
    }

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
        return "lessonCode.AlphabetList{" +
                "alphabet=" + alphabet +
                '}';
    }


}
