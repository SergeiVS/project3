package NewStyle;

public class NewCat extends NewPets{
    public NewCat(String name) {
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
