package task5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TwoListsCommonElementsTest {
 TwoListsCommonElements commonElements = new TwoListsCommonElements();
    @Test
    public void findCommonElements() {

        String[] strings1 = {"aaa", "AAA", "String", "Common", "dsf", "gbrc", "default", "new", "old", "TyPe"};
        List<String> list1 = new LinkedList<>(List.of(strings1));

        String[] strings2 = {"aaa", "AaA", "BBB", "StRing", "old", "dsf", "new", "default", "src", "tyPe", "Ability"};
        List<String> list2 = new ArrayList<>(List.of(strings2));

        String[] strings3 = {"aaa", "string", "dsf", "default", "new", "old", "type"};
        List<String> expectedResultList = new LinkedList<>(List.of(strings3));
        
        List<String> methodResult = commonElements.findCommonElements(list1, list2);

        assertEquals(expectedResultList, methodResult);
    }




}