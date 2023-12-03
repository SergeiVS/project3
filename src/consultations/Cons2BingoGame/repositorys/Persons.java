package Cons2BingoGame.repositorys;

import Cons2BingoGame.entitys.Cart;
import Cons2BingoGame.entitys.Person;

public class Persons {
    Person[] persons;

    public Persons(int numberOfPersons) {this.persons = new Person[numberOfPersons];}

    public Person[] getPersons() {return persons;}

    public void setPersons(Person[] persons) {this.persons = persons;}
}
