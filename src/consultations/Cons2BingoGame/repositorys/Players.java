package repositorys;

public class Players {
    Cons2BingoGame.entitys.Player[] players;

    public Players(Cons2BingoGame.entitys.Player[] players) {
        this.players = players;
    }

    public Cons2BingoGame.entitys.Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Cons2BingoGame.entitys.Player[] players) {
        this.players = players;
    }
}
