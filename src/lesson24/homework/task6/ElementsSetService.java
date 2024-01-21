package task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ElementsSetService {

    public void fillElementsSet(ArrayList<Integer> arrayList){
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arrayList.add(random.nextInt(8));
        }
    }
    public HashSet<Integer> tansferArrayListToHashSet(ArrayList<Integer> arrayList, HashSet<Integer> noDuplicatedElementsSet){

        noDuplicatedElementsSet.addAll(arrayList);
        return noDuplicatedElementsSet;
    }

    public ArrayList<Integer> returnArrayListFromHashSet(HashSet<Integer> noDuplicatedElementsSet, ArrayList<Integer> arrayList){
       arrayList.clear();
        arrayList.addAll(noDuplicatedElementsSet);
        return arrayList;
    }
}

