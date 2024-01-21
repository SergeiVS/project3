package task2;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        ListService ls = new ListService();


        LinkedList<Integer> demoLinkedList = new LinkedList<>();
        demoLinkedList = ls.fillList(demoLinkedList);
        System.out.println(demoLinkedList);

        ls.sortList(demoLinkedList);
        System.out.println(demoLinkedList);


        System.out.println("The smallest number of list is: " + demoLinkedList.getFirst());
        System.out.println("The largest number of list is: " + demoLinkedList.getLast());



        System.out.println("The smallest number of list is: " + ls.minMaxFinder(demoLinkedList, MinMax.MAX));
        System.out.println("The largest number of list is: " + ls.minMaxFinder(demoLinkedList, MinMax.MIN));
    }


}
