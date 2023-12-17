package Cons2BingoGame.entitys;

import java.util.Arrays;

public class Card {
    private int[] cart;

    public Card(){this.cart = new int[15];}

    public int[] getCart() {
        return cart;
    }

    public void setCart(int[] cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cart=" + Arrays.toString(cart) +
                '}';
    }

}
