package Cons2BingoGame.repositorys;

public class Persons {
    Cons2BingoGame.entitys.Player[] persons;

    public Persons(int numberOfPersons) {this.persons = new Cons2BingoGame.entitys.Player[numberOfPersons];}

    public Cons2BingoGame.entitys.Player[] getPersons() {return persons;}

    public void setPersons(Cons2BingoGame.entitys.Player[] players) {this.persons = players;}
}
