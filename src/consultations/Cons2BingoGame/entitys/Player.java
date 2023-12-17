package Cons2BingoGame.entitys;

public class Player {
    private String nickName;
    private Cons2BingoGame.entitys.Card[] cards = new Cons2BingoGame.entitys.Card[3];

    public Player(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Cons2BingoGame.entitys.Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
