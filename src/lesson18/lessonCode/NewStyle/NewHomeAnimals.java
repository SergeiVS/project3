package NewStyle;

public class NewHomeAnimals {
    public static void main(String[] args) {
        NewDog dog1 = new NewDog("Barbos");
        NewDog dog2 = new NewDog("Palkan");


        NewCat cat1 = new NewCat("Murzik");
        NewCat cat2 = new NewCat("Barsik");

        NewPets[] pets = {dog1, dog2, cat1, cat2};


        for (int i = 0; i < pets.length; i++) {
            System.out.println("pet  " + (i + 1)+ " from " + pets[i].getClass() + " "  + pets[i].getName());
           pets[i].voice();
        }
        cat1.greeting();




    }
}
