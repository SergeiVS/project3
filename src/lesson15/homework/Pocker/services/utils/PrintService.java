package homework.Pocker.services.utils;

import homework.Pocker.entitys.Card;
import homework.Pocker.entitys.Player;

import java.util.Arrays;

public class PrintService {
    public void printDeck(Card[] currentDeck, String message){

        System.out.println(message);

        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(currentDeck[counter].getValue() + currentDeck[counter].getSuit() + ", ");
                counter++;
            }
            System.out.println();
        }
    }

    public void printPlayers(Player[] players, String message){

        System.out.println(message);
        System.out.println();

        for (int i = 0; i < players.length; i++) {

            System.out.println("Player #" + (i+1) + " " +  players[i].getName());
            System.out.println(Arrays.toString(players[i].getPlayerCards()));
            System.out.println();
        }
    }
}
