package task11;

import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class StackService {
    public Stack<Integer> stackBuilder(Integer size){

        Random random = new Random();
        Stack<Integer> workingStack = new Stack<>();
        for (int i = 0; i < size; i++) {

            workingStack.push(random.nextInt(50));
        }
        return workingStack;
    }

    public boolean isElementPresent(Stack<Integer> workingStack, Integer element){

        boolean isPresent = false;

        if(workingStack.contains(element)){
            isPresent = true;
        }
        return isPresent;
    }


    public Integer indexOfElement(Stack<Integer> workingStack, Integer element){

        boolean isPresent = isElementPresent(workingStack, element);
        if (isPresent) {

            return workingStack.indexOf(element);

        }else {

            System.out.println("current element " + element + " presents in the stack " + isPresent);

            return -1;
        }
    }
}
