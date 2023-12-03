package Cons2BingoGame.repositorys;

import Cons2BingoGame.entitys.Cart;

public class Carts {

    Cart[] carts;

    public Carts(int numberOfCarts) {this.carts = new Cart[numberOfCarts];}

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }
}
