package lotteryGame.gameServices;

import lotteryGame.utils.UserInput;

import java.util.Random;

public class LotteryService {

    UserInput ui = new UserInput();
    private Integer[] gamePull;
    private Integer[] winnerNumbers;

    public void createGamePull(){
        Integer gamePullLength = ui.uiInt("insert lottery max number");
        gamePull = new Integer[gamePullLength];
        fillPull(gamePullLength);
        shufflePull();
    }

    private void shufflePull() {
        for (int i = gamePull.length-1; i > 1; i--) {
            int randomIndex = (int) (Math.random()*i);
            Integer temp = gamePull[i];
            gamePull[i] = gamePull[randomIndex];
            gamePull[randomIndex] = temp;
        }
    }

    private void fillPull(Integer gamePullLength) {
        for (int i = 0; i < gamePullLength; i++) {
           gamePull[i] = i+1;
        }
    }

    public Integer[] getGamePull() {
        return gamePull;
    }


    public void setWinnerNumbers(Integer[] gamePull) {

        winnerNumbers = new Integer[5];
        Random random = new Random();

        for (int i = 0; i < winnerNumbers.length; i += (random.nextInt(winnerNumbers.length/5) + 1)) {
            int k = i + random.nextInt(winnerNumbers.length / 5);
            winnerNumbers[i] = gamePull[k];
        }

    }
    public Integer[] getWinnerNumbers(Integer[] gamePull) {
        return winnerNumbers;
    }
}
