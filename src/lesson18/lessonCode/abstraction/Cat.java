package abstraction;

import NewStyle.NewPets;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
            System.out.println("Meow!!!");
    }

    public void greeting(){
        System.out.println("Cat name " + getName());
    }
}
