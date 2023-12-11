package homework.Pocker.services.utils;

import homework.Pocker.entitys.Card;

public class DeckService {
    //Cards cards = new Cards();

    public void fillDeck(Card[] deck){
        String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] cardSuit = {"♠", "♥", "♣", "♦"};
        int counter = 0;

        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deck[counter] = new Card(cardValue[i], cardSuit[j]);
                counter++;
            }
        }
        //return cardsdeck;
    }
public  Card[] deckShuffel(Card[] deck){
        Card[] deckScuffele = deck.clone();

    for (int i = deckScuffele.length-1; i > 1; i--) {
        int randomIndex = (int) (Math.random()*i);
        Card tempCard = deckScuffele[i];
        deckScuffele[i] = deckScuffele[randomIndex];
        deckScuffele[randomIndex] = tempCard;
    }
    return deckScuffele;
}
}
