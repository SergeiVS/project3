package abstractCar;

abstract class Automobile {
    private String name;
    private int boost;

    public Automobile(String name, int boost) {
        this.name = name;
        this.boost = boost;
    }

    public String getName() {
        return name;
    }

    public int getBoost() {
        return boost;
    }

    abstract void acceletarionMessaga();
    abstract void startBoost();
}

