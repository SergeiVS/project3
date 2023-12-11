package homework.Pocker.services.utils;

import homework.Pocker.entitys.Card;
import homework.Pocker.entitys.Player;

public class PlayerService {
    UserInput ui = new UserInput();
    public void setPlayersName(Player[] players){

        for (int i = 0; i < players.length; i++) {

            String name = ui.uiText("Please insert name of the player: ");
            players[i] = new Player(name);
        }
    }

    public void dealCards(Card[] deckShuffle, int numberOfCardsEachPlayer,  Player[] players) {
        int counter = 0;
        for (int i = 0; i < numberOfCardsEachPlayer; i++) {
            for (int j = 0; j < players.length; j++) {
                players[j].getPlayerCards()[i] = deckShuffle[counter];
                counter++;
            }
        }
    }

   // public Player[] getPlayers() {
     //   return players;
    //}
}
