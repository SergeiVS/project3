package lotteryGame;

import java.util.Objects;

public interface WinnerCheck {

    default boolean isWinnerExist(Player[] players, Integer[] winnerNumbers) {
        boolean isWinnerExist = false;

        for (int i = 0; i < players.length; i++) {
            Integer count = 0;
            count = matchesCheck(players, winnerNumbers, i, count);
            if (isPlayerWinner(players, winnerNumbers, count, i)) {
                isWinnerExist = true;
            }
        }
        return isWinnerExist;
    }

    default boolean isPlayerWinner(Player[] players, Integer[] winnerNumbers, Integer count, int i) {
        if (count == winnerNumbers.length) {
            players[i].setWinner(true);
            return true;
        }
        return false;
    }

    default Integer matchesCheck(Player[] players, Integer[] winnerNumbers, int i, Integer count) {

        for (int j = 0; j < players[i].getPlayerCard().length; j++) {
            count = isNumberWinner(players, winnerNumbers, i, j, count);
        }
        return count;
    }

    default Integer isNumberWinner(Player[] players, Integer[] winnerNumbers, int i, int j, Integer count) {
        for (int k = 0; k < winnerNumbers.length; k++) {

            if (Objects.equals(players[i].getPlayerCard()[j], winnerNumbers[k])) {
                count++;
            }
        }
        return count;
    }
}
