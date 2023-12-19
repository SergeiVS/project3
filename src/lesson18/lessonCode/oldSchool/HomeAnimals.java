package OldSchool;

public class HomeAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barbos");
        Dog dog2 = new Dog("Palkan");


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");

        Dog[] dogs = {dog1, dog2};
        Cat[] cats = {cat1, cat2};

        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Dog " + (i + 1) + " " + dogs[i].getName());
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Cat " + (i + 1) + " " + cats[i].getName());
        }



    }
}
