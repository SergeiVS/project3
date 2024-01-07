package lotteryGame;

import java.util.Arrays;

public class Output {
    PlayerService pS = new PlayerService();
    LotteryService lS = new LotteryService();

    public void playersPrintOut(Player[] players){
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].toString());
        }
    }
    public void winnerNumbersPrint(Integer[] winnerNumbers){

        System.out.println("winner number are: " + Arrays.toString(winnerNumbers));
    }
    public void winnerPlayersPrint(boolean isWinnerExist, Player[] players){
        if(isWinnerExist){
            for (int i = 0; i < players.length; i++) {
                if (players[i].getWinner()){
                    System.out.println("Player: " + players[i].getName() + " is winner!");
                }else {
                    System.out.println("no winner in this game!");
                }
            }
        }
    }
}
