package lotteryGame;

public class PlayerService {
    Player[] players;
    UserInput ui = new UserInput();

    public Player[] getPlayers() {
        return players;
    }

    private int playersNumberInput(){

      boolean isCountCorrect = false;
      int number;

      do {
          number = ui.uiInt("Insert number of players between 1 and 3: ");
          if (number > 0 && number < 4) {
              isCountCorrect = true;
          }
      }  while (!isCountCorrect);

              return number;
    }
    public void createPlayersPull(Integer lotteryMaxNumber) {

        int numberOfPlayers = playersNumberInput();
        players = new Player[numberOfPlayers];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(ui.uiText("Insert name of the player " + (i + 1)));
            players[i].setPlayerCard (fillPlayerCard(players, lotteryMaxNumber, i));
        }
    }

    private Integer[] fillPlayerCard(Player[] players, Integer lotteryMaxNumber, int i) {

        Integer[] checkArray = new Integer[players[i].getPlayerCard().length];

        for (int j = 0; j < players[i].getPlayerCard().length; j++) {
                checkArray[j] = ui.uiInt("insert your happy number " + (j + 1) + " not higher as " + lotteryMaxNumber);
               while (!numberCheck(lotteryMaxNumber, checkArray, j)){
                   checkArray[j] = ui.uiInt("your number is out of range or repeated, pleas insert your happy number " + (j + 1) + " once again:");
               }
        }
      return checkArray;
    }

    private boolean numberCheck(Integer lotteryMaxNumber,  Integer[] checkArray, int j) {

        boolean isRepeated = repeatCheck(checkArray, j);

        boolean isInRange = rangeCheck(lotteryMaxNumber, checkArray, j);

        return isInRange && !isRepeated;
    }


    private boolean rangeCheck(Integer lotteryMaxNumber, Integer[] checkArray, int j) {

        return checkArray[j] > 0 && checkArray[j] <= lotteryMaxNumber;
    }

    private boolean repeatCheck(Integer[] checkArray, int j) {

        boolean isRepeated = false;

        for (int k = 0; k < j; k++) {
            if (checkArray[k].equals(checkArray[j])) {
                isRepeated = true;
                break;
            }
        }
        return isRepeated;
    }
}


