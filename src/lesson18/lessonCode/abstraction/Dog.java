package abstraction;

import NewStyle.NewPets;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("GAV!!!");
    }
}
