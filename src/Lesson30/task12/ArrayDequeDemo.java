package task12;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(25);
        arrayDeque.addLast(54);
        arrayDeque.add(77);
        arrayDeque.addLast(34);
        arrayDeque.addFirst(15);

        System.out.println(arrayDeque);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");

        int size = arrayDeque.size();

        for (int i = 0; i < size; i++) {

            System.out.println(arrayDeque.pollLast());
        }
    }
}