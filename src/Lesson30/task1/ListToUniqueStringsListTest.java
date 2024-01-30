package task1;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ListToUniqueStringsListTest {

    ListToUniqueStringsList listToUniqueStringsList = new ListToUniqueStringsList();



    @Test
    public void listToUniqueStringsList() {

        String[] stringsIncoming = {"bbb", "bbb", "aaa", "aaa", "ccc", "ggg", "ccc", "ddd", "AAA", "Acceleration", "Annotation", "SbrTR"};
        LinkedList<String> listOfStrings = new LinkedList<>(List.of(stringsIncoming));

        String[] resultingStrings = {"aaa", "acceleration", "annotation", "bbb", "ccc", "ddd", "ggg", "sbrtr"};
        List<String> expectedListOfStrings = new LinkedList<>(List.of(resultingStrings));

        List<String> actualListOfUniqueStrings = listToUniqueStringsList.listOfUniqueStrings(listOfStrings);


        assertEquals(toString(), expectedListOfStrings, actualListOfUniqueStrings);
    }


    @Test
    public void listToUniqueStringsListNotEquals() {

        String[] stringsIncoming = {"bbb", "bbb", "aaa", "aaa", "ccc", "ggg", "ccc", "ddd", "AAA", "Acceleration", "Annotation", "SbrTR"};
        LinkedList<String> listOfStrings = new LinkedList<>(List.of(stringsIncoming));

        String[] resultingStrings = {"aaa", "acceleration", "bbb", "ccc", "ddd", "ggg", "sbrtr"};
        List<String> expectedListOfStrings = new LinkedList<>(List.of(resultingStrings));

        List<String> actualListOfUniqueStrings = listToUniqueStringsList.listOfUniqueStrings(listOfStrings);


        assertNotEquals(toString(), expectedListOfStrings, actualListOfUniqueStrings);
    }
}