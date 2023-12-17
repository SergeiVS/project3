package Cons2BingoGame.services;

import Cons2BingoGame.entitys.Player;
import repositorys.Players;

import java.util.Scanner;

public class PlayersService {
    UserInputBingo ui = new UserInputBingo();
    repositorys.Players players;
    private final Integer numberOfPlaiers = ui.uiInt("Please insert number of players");;

    public Integer getNumberOfPlaiers() {
        return numberOfPlaiers;
    }

    public repositorys.Players fillPlayersList(){

        players = new Players(numberOfPlaiers);
        for (int i = 0; i < numberOfPlaiers; i++) {
            players.getPlayers()[i] = new Player(ui.uiString("Please insert player´s # " + (i+1) + " nickname: "));
        }
       return players;
    }


}
