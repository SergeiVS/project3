package Cons2BingoGame.services;

import java.util.Scanner;

public class UserInputBingo {

    public int uiInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    public String uiString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
