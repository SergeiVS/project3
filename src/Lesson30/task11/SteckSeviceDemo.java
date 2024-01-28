package task11;

import java.util.Stack;

public class SteckSeviceDemo {
    public static void main(String[] args) {
        StackService service = new StackService();

        int size = 20;
        int searchedElement = 21;
        Stack<Integer> myStack = service.stackBuilder(size);

        System.out.println(myStack);

        System.out.println("///////////////////////////////////////////////////////");

        System.out.println(service.isElementPresent(myStack, searchedElement));

        System.out.println(service.indexOfElement(myStack, searchedElement));

    }
}
