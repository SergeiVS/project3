package task3;

import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        System.out.println("listOfIntegers is enpty " + listOfIntegers.isEmpty());

        listOfIntegers.add(5);
        listOfIntegers.add(2);
        listOfIntegers.add(6);
        listOfIntegers.addFirst(10);
        listOfIntegers.addLast(55);
        listOfIntegers.add(3,77);
        listOfIntegers.add(84);
        listOfIntegers.add(24);

        System.out.println(listOfIntegers);

        System.out.println("++++++++++++++++++++++++++++++++++=");
        System.out.println("listOfIntegers is empty " + listOfIntegers.isEmpty());
        System.out.println("===========================================");

        System.out.println("size of listOfIntegers is " + listOfIntegers.size());
        System.out.println("______________________________________________");

        listOfIntegers.remove(4);

        int index = 0;

        for (int i = 0; i < listOfIntegers.size(); i++) {

            if(listOfIntegers.get(i).equals(77)){
                index = i;
                break;
            }
        }
        listOfIntegers.remove(index);
        System.out.println("-------------------------------------------------");

        System.out.println("all elements of list of Integers:");

        index = 0;

        for (Integer i : listOfIntegers) {
            System.out.println("element " + index + " : " + i);
            index++;
        }
    }

}
