package task5;

import java.util.*;

public class TwoListsCommonElements {

    public List<String> findCommonElements(List<String> list1, List<String> list2) {

        Set<String> commonElements = new HashSet<>();
        //List<String> commonElementsList = new LinkedList<>();
        List<String> list2LowerCase = new LinkedList<>();

        list2LowerCase = list2lowCase(list2, list2LowerCase);

        for (String element : list1) {
            String lowCaseElement = element.toLowerCase();
            if (list2LowerCase.contains(lowCaseElement)) {
                commonElements.add(lowCaseElement);
            }
        }
        return new LinkedList<>(commonElements);
    }

    private static List<String> list2lowCase(List<String> list2, List<String> list2LowerCase) {

        for (String element : list2) {
            String s = element.toLowerCase();
            list2LowerCase.add(s);
        }
        return list2LowerCase;
    }
}

