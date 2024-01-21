package apartments;

import apartments.Flat;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {


    Set<Flat> flats = new TreeSet<>(Flat::compareTo);

    flats.add(new Flat(2, 28));
    flats.add(new Flat(3,65));
    flats.add(new Flat(1,32));
    flats.add(new Flat(4,110));
    flats.add(new Flat(2,65));

        System.out.println(flats);
}
}
