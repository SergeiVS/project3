package lotteryGame;

import java.util.Objects;

public class LotteryDraw {

    private final LotteryService lS = new LotteryService();
    private final PlayerService pS = new PlayerService();
    private final Output output = new Output();



    public void lotteryDraw(){
        lS.setWinnerNumbers(lS.createGamePull());
        pS.createPlayersPull(lS.getGamePull().length);
        output.winnerNumbersPrint(lS.getWinnerNumbers());
        output.playersPrintOut(pS.getPlayers());
       output.winnerPlayersPrint(isWinnerExist(), pS.getPlayers());
    }



    private boolean isWinnerExist(){
       boolean isWinnerExist = false;
        for (int i = 0; i < pS.getPlayers().length; i++) {
            Integer count = 0;
            count = matchesCheck(i, count);
           if (isPlayerWinner(count, i)){isWinnerExist = true;}
        }
        return isWinnerExist;
    }

    private boolean isPlayerWinner(Integer count, int i) {
        if(count == lS.getWinnerNumbers().length){
            pS.getPlayers()[i].setWinner(true);
            return true;
        }
        return false;
    }

    private Integer matchesCheck(int i, Integer count) {
        for (int j = 0; j < pS.getPlayers()[i].getPlayerCard().length; j++) {
            count = isNumberWinner(i, j, count);
        }
        return count;
    }

    private Integer isNumberWinner(int i, int j, Integer count) {
        for (int k = 0; k <lS.getWinnerNumbers().length; k++) {
            if (Objects.equals(pS.getPlayers()[i].getPlayerCard()[j], lS.getWinnerNumbers()[k])){
                count++;
            }
        }
        return count;
    }



}
