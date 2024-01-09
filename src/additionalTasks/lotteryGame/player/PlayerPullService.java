package lotteryGame.player;

import lotteryGame.utils.UserInput;

public class PlayerPullService {
    PlayerCardService playerCardService = new PlayerCardService();
    UserInput ui = new UserInput();
    private Player[] players;
    public Player[] getPlayers() {
        return players;
    }


    private int playersNumberInput() {
        boolean isCountCorrect;
        int number;
        do {
            number = ui.uiInt("Insert number of players between 1 and 3: ");
            isCountCorrect = playersNumberCheck(number);
        } while (!isCountCorrect);
        return number;
    }

    private boolean playersNumberCheck(int number) {
        if (number > 0 && number < 4) {
            return  true;
        }
         return false;
    }

    public void createPlayersPull(Integer lotteryMaxNumber) {

        int numberOfPlayers = playersNumberInput();
        players = new Player[numberOfPlayers];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(ui.uiText("Insert name of the player " + (i + 1)));
            players[i].setPlayerCard(playerCardService.fillPlayerCard(players, lotteryMaxNumber, i));
        }
    }

}


