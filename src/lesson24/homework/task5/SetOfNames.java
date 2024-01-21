package task5;

import java.util.HashSet;
import java.util.Set;

public class SetOfNames {
    public static void main(String[] args) {

    Set<String> namesSet = new HashSet<>();
    namesSet.add("John");
    namesSet.add("Peter");
    namesSet.add("Tatiana");
    namesSet.add("Ivan");
    namesSet.add("John");
    namesSet.add("Svetlana");
    namesSet.add("Ivan");
    namesSet.add("Maria");
    namesSet.add("Danil");
    namesSet.add("Pavel");

        System.out.println(namesSet);

        System.out.println(namesSet.contains("Ivan"));

}

}
