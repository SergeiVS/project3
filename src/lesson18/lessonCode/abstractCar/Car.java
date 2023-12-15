package abstractCar;

public class Car extends Automobile{
    public Car(String name, int boost) {
        super(name, boost);
    }

    @Override
    void acceletarionMessaga() {
        System.out.println(getName() + " boosts from 0 to 100 in " + getBoost() + " seconds.");
    }

    @Override
    void startBoost() {
        System.out.println("start from 0________50kMh " + (getBoost() / 3 + " seconds_______100 kMh " + getBoost()) + " seconds");
    }
}
