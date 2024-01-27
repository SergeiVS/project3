package task1;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ListToUniqueStringsListTest {

    ListToUniqueStringsList listToUniqueStringsList = new ListToUniqueStringsList();
    @Test
    public void listToUniqueStringsList() {

        String[] stringsIncoming = { "bbb", "bbb", "aaa", "aaa",  "ccc", "ggg", "ccc", "ddd", "AAA"};
        LinkedList<String> listOfStrings = new LinkedList<>(List.of(stringsIncoming));

        String[] resultingStrings = {"aaa", "AAA", "ccc", "bbb", "ddd", "ggg"};
        List<String> expectedListOfStrings = new LinkedList<>(List.of(resultingStrings));


        List<String> actualListOfUniqueStrings = listToUniqueStringsList.listToUniqueStringsList(listOfStrings);


        assertEquals(toString(), expectedListOfStrings, actualListOfUniqueStrings);
    }
}