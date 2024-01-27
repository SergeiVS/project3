package task1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListToUniqueStringsList {

    public Set<String> listToUniqueStringsSet(LinkedList<String> listOfStrings){

        return new HashSet<>(listOfStrings);
    }

    public LinkedList<String> listToUniqueStringsList(LinkedList<String> listOfStrings){

        Set<String> uniqueStringsSet = new HashSet<>(listOfStrings);

        return new LinkedList<>(uniqueStringsSet);
    }


}
