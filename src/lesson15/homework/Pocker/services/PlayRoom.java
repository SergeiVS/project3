package homework.Pocker.services;

import homework.Pocker.entitys.Cards;
import homework.Pocker.entitys.Player;
import homework.Pocker.services.utils.DeckService;
import homework.Pocker.services.utils.PlayerService;
import homework.Pocker.services.utils.PrintService;
import homework.Pocker.services.utils.UserInput;

public class PlayRoom {
    Cards cards = new Cards();
    DeckService deckService = new DeckService();
    UserInput ui = new UserInput();
   // private int numberOfPlayers = ui.getPlayersNumber();
    Player[] players = new Player[ui.getPlayersNumber()];
    PlayerService playerService = new PlayerService();
    PrintService printService = new PrintService();
    int numberOfCardsEachPlayer = ui.uiInt("Please insert number of cards by each player:");

    public void game(){
        deckService.fillDeck(cards.getDeck());
        printService.printDeck(cards.getDeck(), "New deck" );

        cards.setDeckShuffle(deckService.deckShuffel(cards.getDeck()));
        cards.setDeckShuffle(deckService.deckShuffel(cards.getDeckShuffle()));

        printService.printDeck(cards.getDeckShuffle(), "Shuffled deck");

        playerService.setPlayersName(players);

        playerService.dealCards(cards.getDeckShuffle(), numberOfCardsEachPlayer, players);

        printService.printPlayers(players, "Players are taking a part:");

    }
}
