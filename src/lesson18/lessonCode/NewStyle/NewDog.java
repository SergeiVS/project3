package NewStyle;

public class NewDog extends NewPets{


    public NewDog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("GAV!!!");
    }
}
