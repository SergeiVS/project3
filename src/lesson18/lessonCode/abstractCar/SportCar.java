package abstractCar;

public class SportCar extends Automobile{
    public SportCar(String name, int boost) {
        super(name, boost);
    }

    @Override
    void acceletarionMessaga() {
        System.out.println(getName()+ " reaches 100 kMh in " + getBoost() + " seconds");
    }

    @Override
    void startBoost() {
        System.out.println("start from 0___50 kMh " + (getBoost() / 2 + " ___100 kMh " + getBoost()) + " seconds");
    }
}
