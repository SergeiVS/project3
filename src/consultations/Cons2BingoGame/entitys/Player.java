package Cons2BingoGame.entitys;

public class Player {
    private String nickName;
    private Cons2BingoGame.entitys.Card[] carts = new Cons2BingoGame.entitys.Card[3];

    public Player(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Cons2BingoGame.entitys.Card[] getCarts() {
        return carts;
    }

    public void setCarts(Cons2BingoGame.entitys.Card[] carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
