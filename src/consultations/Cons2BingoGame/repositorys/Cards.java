package Cons2BingoGame.repositorys;

import java.util.Arrays;

public class Cards {

    private Cons2BingoGame.entitys.Card[] cards;



    public Cards(int numberOfCards) {this.cards = new Cons2BingoGame.entitys.Card[numberOfCards];}

    public Cons2BingoGame.entitys.Card[] getCards() {
        return cards;
    }

    public void setCards(Cons2BingoGame.entitys.Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
