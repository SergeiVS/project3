package abstraction;

import NewStyle.NewPets;

public class HomeAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barbos");
        Dog dog2 = new Dog("Palkan");


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");

        Parrot parrot = new Parrot("Kesha");

        Animal[] animals = {dog1, dog2, cat1, cat2, parrot};


        for (int i = 0; i < animals.length; i++) {
            System.out.println("animal  " + (i + 1)+ " from "  + animals[i].getName());
           animals[i].voice();
        }
        cat1.greeting();




    }
}
