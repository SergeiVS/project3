package Cons2BingoGame.repositorys;

public class Cards {

    Cons2BingoGame.entitys.Card[] carts;

    public Cards(int numberOfCarts) {this.carts = new Cons2BingoGame.entitys.Card[numberOfCarts];}

    public Cons2BingoGame.entitys.Card[] getCarts() {
        return carts;
    }

    public void setCarts(Cons2BingoGame.entitys.Card[] carts) {
        this.carts = carts;
    }
}
