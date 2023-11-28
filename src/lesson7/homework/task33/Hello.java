package lesson7.homework.task33;

import java.util.Objects;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        String hello = "hello";
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert word; hello:");
        String userInput = scanner.nextLine();


        if (Objects.equals(userInput, hello)) {
            System.out.println("Thank you very much!");
        } else {
            while (!Objects.equals(userInput, hello)) {
                System.out.println("Please insert word: hello one more time:");
             userInput = scanner.nextLine();
                counter++;
            }
        }
        System.out.println("Thanks a lot, you made " + counter + " unsuccessful tries");
    }
}



