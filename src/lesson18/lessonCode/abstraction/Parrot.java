package abstraction;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Kesha!!!");
    }
}
