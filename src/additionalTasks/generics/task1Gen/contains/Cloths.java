package generics.task1Gen.contains;

public class Cloths implements BoxContain{
    String name;

    public Cloths(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cloths{" +
                "name='" + name + '\'' +
                '}';
    }
}
