package Cons2BingoGame.services;

import repositorys.Players;

import java.util.Arrays;
import java.util.Random;

public class CardService {

    public void fillCart(Cons2BingoGame.entitys.Card cartToFill, int range) {
        Random random = new Random();
        int[] workingArr = cartToFill.getCart();
        for (int i = 0; i < range; i++) {
            int newNumber;
            do { newNumber = random.nextInt(range) + 1;}

            while (isNumberPresent(workingArr, newNumber));

            workingArr[i] = newNumber;
        }
        Arrays.sort(workingArr);
    }

    private boolean isNumberPresent(int[] warkingArr, int checkNumber) {
        for (int i = 0; i < warkingArr.length; i++) {
            if (checkNumber == warkingArr[i]) {
                return true;
            }
        }
        return false;
    }
public void dealCards(Cons2BingoGame.repositorys.Cards cards, Players players){
    for (int i = 0; i < players.getPlayers().length; i++) {
        for (int j = 0; j < cards.getCarts().length; j++) {
            players.getPlayers()[i].getCarts();
        }

    }
}
}
