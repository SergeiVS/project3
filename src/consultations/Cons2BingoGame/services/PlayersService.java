package Cons2BingoGame.services;

import java.util.Scanner;

public class PlayersService {
    private Cons2BingoGame.entitys.Player player;

    public void personFill(Cons2BingoGame.entitys.Player newPlayer){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert nickname of the player: ");
        Cons2BingoGame.entitys.Player player = new Cons2BingoGame.entitys.Player(scanner.nextLine());
    }
    public void dealCards()

}
