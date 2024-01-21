package task2;

import java.util.LinkedList;
import java.util.Random;

public class ListService {
    public  LinkedList<Integer> fillList(LinkedList<Integer> demoLinkedList){

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
demoLinkedList.add(random.nextInt(100));
        }
        return demoLinkedList;
    }
    public Integer minMaxFinder(LinkedList<Integer> listForSearch, MinMax minMax){
        int number;
        switch (minMax){
            case MAX -> {
                return maxFinder(listForSearch);
            }
            case MIN ->  {
                return minFinder(listForSearch);
            }
            default -> { return -1;}
        }
    }

    private static int minFinder(LinkedList<Integer> listForSearch) {
        int number;
        number = 100;
        for (int i = 0; i < listForSearch.size(); i++) {
            if (listForSearch.get(i) < number){number = listForSearch.get(i);}
        }
        return number;
    }

    private static int maxFinder(LinkedList<Integer> listForSearch) {
        int number;
        number = 0;
        for (int i = 0; i < listForSearch.size(); i++) {
            if (listForSearch.get(i) > number){number = listForSearch.get(i);}
        }
        return number;
    }

    public void sortList(LinkedList<Integer> listForSearch){
        int temp = 0;
        int length = listForSearch.size();
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if ( listForSearch.get(j-1) > listForSearch.get(j)){
                    temp = listForSearch.get(j-1);
                    listForSearch.set(j-1, listForSearch.get(j));
                    listForSearch.set(j, temp);
                }
               }
        }
    }
}
