package task6;

import java.util.ArrayList;
import java.util.HashSet;

public class ElementsSetDemo {
    public static void main(String[] args) {
        ElementsSetService elementsSetService = new ElementsSetService();
        ArrayList<Integer> elementsSet = new ArrayList<>();
        HashSet<Integer> noDuplicatedElementsSet = new HashSet<>();

        elementsSetService.fillElementsSet(elementsSet);

        System.out.println(elementsSet);

        elementsSetService.tansferArrayListToHashSet(elementsSet, noDuplicatedElementsSet);

        System.out.println(noDuplicatedElementsSet);

        elementsSetService.returnArrayListFromHashSet(noDuplicatedElementsSet, elementsSet);

        System.out.println(elementsSet);
        noDuplicatedElementsSet.add(15);
        noDuplicatedElementsSet.add(8);
        noDuplicatedElementsSet.add(5);

        System.out.println(noDuplicatedElementsSet);

        elementsSetService.returnArrayListFromHashSet(noDuplicatedElementsSet, elementsSet);

        System.out.println(elementsSet);
    }
}
