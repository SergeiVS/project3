package lesson7.Practice.exercise2BankOld;

import java.util.Scanner;

public class Money {

    private int amount;

    Scanner scanner = new Scanner(System.in);
    public Money(){

        System.out.println("Insert your account amount =>");
        amount = scanner.nextInt();
        System.out.println();
    }
    public int getAmount() {
        return amount;
    }
}
