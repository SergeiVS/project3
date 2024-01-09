package lotteryGame.player;

import java.util.Arrays;

public class Player {
    private String name;
    private Integer[] playerCard = new Integer[5];

    private Boolean isWinner = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer[] getPlayerCard() {
        return playerCard;
    }

    public void setPlayerCard(Integer[] playerCard) {
        this.playerCard = playerCard;
    }

    public Boolean getWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        isWinner = winner;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerCard=" + Arrays.toString(playerCard) +
                ", isWinner=" + isWinner +
                '}';
    }
}
