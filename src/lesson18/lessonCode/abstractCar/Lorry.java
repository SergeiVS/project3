package abstractCar;

public class Lorry extends Automobile{
    public Lorry(String name, int boost) {
        super(name, boost);
    }

    @Override
    void acceletarionMessaga() {
        System.out.println(getName() + " needs " + getBoost() + " seconds to reach 100 kMh.");
    }

    @Override
    void startBoost() {
        System.out.println("start from 0____________________________50kMh " + (getBoost() / 2 + " seconds_________________________100 kMh " + getBoost()) + " seconds");
    }
}
