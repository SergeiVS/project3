package lotteryGame.gameServices;

import lotteryGame.player.Player;

import java.util.Objects;

public class WinnerCheck {

    boolean isWinnerExist(Player[] players, Integer[] winnerNumbers) {
        boolean isWinnerExist = false;

        for (int i = 0; i < players.length; i++) {
            Integer count = 0;
            count = isCardWinner(players, winnerNumbers, i, count);
            if (isPlayerWinner(players, winnerNumbers, count, i)) {
                isWinnerExist = true;
            }
        }
        return isWinnerExist;
    }

    boolean isPlayerWinner(Player[] players, Integer[] winnerNumbers, Integer count, int i) {
        if (count == winnerNumbers.length) {
            players[i].setWinner(true);
            return true;
        }
        return false;
    }

    Integer isCardWinner(Player[] players, Integer[] winnerNumbers, int i, Integer count) {

        for (int j = 0; j < players[i].getPlayerCard().length; j++) {
            count = isNumberWinner(players, winnerNumbers, i, j, count);
        }
        return count;
    }

    Integer isNumberWinner(Player[] players, Integer[] winnerNumbers, int i, int j, Integer count) {
        for (Integer winnerNumber : winnerNumbers) {

            if (Objects.equals(players[i].getPlayerCard()[j], winnerNumber)) {
                count++;
            }
        }
        return count;
    }
}
