package task5;

import java.util.*;

public class TwoListsCommonElements {

    public List<String> findCommonElements(List<String> list1, List<String> list2) {

        Set<String> commonElements = new HashSet<>();

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

    private static List<String> list2lowCase(List<String> list, List<String> listLowerCase) {

        for (String element : list) {
            String s = element.toLowerCase();
            listLowerCase.add(s);
        }
        return listLowerCase;
    }
}

