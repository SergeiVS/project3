package Cons2BingoGame.services;

import Cons2BingoGame.entitys.Card;
import Cons2BingoGame.repositorys.Cards;
import repositorys.Players;

import java.util.Arrays;
import java.util.Random;

public class CardService {
   PlayersService playersService = new PlayersService();
    private Cards cards;
    Card card;
    int numberOfCards = playersService.getNumberOfPlaiers() * 3;


    private Card fillCard() {

        Random random = new Random();
        int[] workingArr = new int[card.getCart().length];
        Card card = new Card();

        for (int i = 0; i < card.getCart().length; i++) {

                int newNumber;

                do {newNumber = random.nextInt(90 + 1);}

                while (isNumberPresent(workingArr, newNumber));
                workingArr[i] = newNumber;
        }
        Arrays.sort(workingArr);
        card.setCart(workingArr);
        return card;
    }

    public Cards fillCardsArray(){
        cards = new Cards(numberOfCards);
        for (int i = 0; i < cards.getCards().length; i++) {
           cards.getCards()[i] = fillCard();
           cards.getCards()[i].getCart().toString();
        }

        return cards;
    }

    private boolean isNumberPresent(int[] warkingArr, int checkNumber) {

        for (int i = 0; i < warkingArr.length; i++) {
            if (checkNumber == warkingArr[i]) {
                return true;
            }
        }
        return false;
    }

}
