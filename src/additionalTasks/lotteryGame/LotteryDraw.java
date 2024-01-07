package lotteryGame;

public class LotteryDraw implements WinnerCheck {

    private final LotteryService lS = new LotteryService();
    private final PlayerService pS = new PlayerService();
    private final Output output = new Output();



    public void lotteryDraw(){
        lS.createGamePull();
        lS.setWinnerNumbers(lS.getGamePull());
        pS.createPlayersPull(lS.getGamePull().length);
        output.winnerNumbersPrint(lS.getWinnerNumbers(lS.getGamePull()));
        output.playersPrintOut(pS.getPlayers());
       output.winnerPlayersPrint(isWinnerExist(pS.getPlayers(), lS.getWinnerNumbers(lS.getGamePull())), pS.getPlayers());
    }
}
