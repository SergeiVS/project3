package homework.Pocker.services.utils;

import java.util.Scanner;

public class UserInput {

    public String uiText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public int uiInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public int getPlayersNumber(){
        int numberOfPlayers = uiInt("Please insert number of players: ");
        return numberOfPlayers;
    }
}
