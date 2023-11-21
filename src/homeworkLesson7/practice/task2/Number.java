package homeworkLesson7.practice.task2;

import java.util.Scanner;

public class Number {

    Scanner scanner = new Scanner(System.in);
    private int x;

    public Number() {

        System.out.println(" Please insert your number =>");

       x = scanner.nextInt();


    }

    public int getX(){ return x;}


}
