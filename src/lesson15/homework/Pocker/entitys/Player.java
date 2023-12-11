package homework.Pocker.entitys;

import java.util.Arrays;

public class Player {

    private String name;
    private  Card[] cards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public Card[] getPlayerCards() {return cards;}

    @Override
    public String toString() {
        return  name + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}

