package lotteryGame.gameServices;

import lotteryGame.player.PlayerPullService;
import lotteryGame.utils.Output;

public class LotteryDraw {
    WinnerCheck winnerCheck = new WinnerCheck();
    private final LotteryService lS = new LotteryService();
    private final PlayerPullService pS = new PlayerPullService();
    private final Output output = new Output();



    public void lotteryDraw(){
        lS.createGamePull();
        lS.setWinnerNumbers(lS.getGamePull());
        pS.createPlayersPull(lS.getGamePull().length);
        output.winnerNumbersPrint(lS.getWinnerNumbers(lS.getGamePull()));
        output.playersPrintOut(pS.getPlayers());
       output.winnerPlayersPrint(winnerCheck.isWinnerExist(pS.getPlayers(), lS.getWinnerNumbers(lS.getGamePull())), pS.getPlayers());
    }
}
