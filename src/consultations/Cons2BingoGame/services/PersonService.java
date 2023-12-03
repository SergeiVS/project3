package Cons2BingoGame.services;

import Cons2BingoGame.entitys.Person;

import java.util.Scanner;

public class PersonService {
    private Object Peson;

    public void personFill(Person newPerson){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert nickname of the player: ");
        Person person = new Person(scanner.nextLine());
    }
}
