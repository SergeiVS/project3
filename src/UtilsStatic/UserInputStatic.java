package UtilsStatic;

import java.util.Scanner;

public class UserInputStatic {
private static final Scanner scanner = new Scanner(System.in);
    public static String inputString(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    public static Integer inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public static Double inputDouble(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
}
