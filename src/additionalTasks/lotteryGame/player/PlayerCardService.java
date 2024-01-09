package lotteryGame.player;

import lotteryGame.utils.UserInput;

public class PlayerCardService {

    UserInput ui = new UserInput();

    public Integer[] fillPlayerCard(Player[] players, Integer lotteryMaxNumber, int i) {

        int length = players[i].getPlayerCard().length;
        Integer[] checkArray = new Integer[length];

        for (int j = 0; j < length; j++) {
            checkArray[j] = ui.uiInt("insert your happy number " + (j + 1) + " not higher as " + lotteryMaxNumber);
            wrongNumberReInsert(lotteryMaxNumber, checkArray, j);
        }
        return checkArray;
    }

    private void wrongNumberReInsert(Integer lotteryMaxNumber, Integer[] checkArray, int j) {

        while (!numberCheck(lotteryMaxNumber, checkArray, j)){
            checkArray[j] = ui.uiInt("your number is out of range or repeated, pleas insert your happy number " + (j + 1) + " once again:");
        }
    }

    private boolean numberCheck(Integer lotteryMaxNumber, Integer[] checkArray, int j) {

        boolean isRepeated = repeatCheck(checkArray, j);

        boolean isInRange = rangeCheck(lotteryMaxNumber, checkArray, j);

        return isInRange && !isRepeated;
    }


    private boolean rangeCheck(Integer lotteryMaxNumber, Integer[] checkArray, int j) {

        return checkArray[j] > 0 && checkArray[j] <= lotteryMaxNumber;
    }

    private static boolean repeatCheck(Integer[] checkArray, int j) {

        for (int k = 0; k < j; k++) {
            if (checkArray[k].equals(checkArray[j])) { return true;}
        }
        return false;
    }
}


