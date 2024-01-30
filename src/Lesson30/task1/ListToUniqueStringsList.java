package task1;

import java.util.*;

public class ListToUniqueStringsList {

    private Set<String> listToUniqueStringsSet(LinkedList<String> listOfStrings){

        List<String> stringListLowerCase = new ArrayList<>();

        for (String listOfString : listOfStrings) {

            stringListLowerCase.add(listOfString.toLowerCase());
        }
        return new HashSet<>(stringListLowerCase);
    }

    public List<String> listOfUniqueStrings(LinkedList<String> listOfStrings){

        Comparator<String> comparator = Comparator.naturalOrder();

        Set<String> uniqueStringsSet = listToUniqueStringsSet(listOfStrings);

        List<String> uniqueStringsList = new ArrayList<>(uniqueStringsSet);

        uniqueStringsList.sort(comparator);

        return uniqueStringsList;
    }


}
