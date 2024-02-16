package generics.task1Gen.contains;

public class BookT1G implements BoxContain{
    String name;

    public BookT1G(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BookT1G{" +
                "name='" + name + '\'' +
                '}';
    }
}
