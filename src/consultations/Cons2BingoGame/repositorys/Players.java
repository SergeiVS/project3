package repositorys;

import Cons2BingoGame.entitys.Player;

import java.util.Arrays;

public class Players {
    Player[] players;

    public Players(int numberOfPlayers) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + Arrays.toString(players) +
                '}';
    }
}
