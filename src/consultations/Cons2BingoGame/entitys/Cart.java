package Cons2BingoGame.entitys;

import java.util.Arrays;

public class Cart {
    private int[] cart;

    public Cart(int cartRange){this.cart = new int[cartRange];}

    public int[] getCart() {
        return cart;
    }

    public void setCart(int[] cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + Arrays.toString(cart) +
                '}';
    }
}
