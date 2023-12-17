package services;

import Cons2BingoGame.entitys.Card;
import Cons2BingoGame.entitys.Player;
import Cons2BingoGame.repositorys.Cards;
import Cons2BingoGame.services.CardService;
import Cons2BingoGame.services.PlayersService;

public class GameService {
    CardService cardService = new CardService();
    PlayersService playersService = new PlayersService();
    Card card;
    Player player;
    private repositorys.Players playersInTheGame;

    private Cards cardsinTheGame;



    private void dealPlayerCards(int i, Card[] workingPlayerCardsArray, int counter) {
        for (int j = i * workingPlayerCardsArray.length; j < cardsinTheGame.getCards().length; j++) {
            workingPlayerCardsArray[counter] = cardsinTheGame.getCards()[j];
            counter++;
        }
    }

    public void gameDrumm


}
