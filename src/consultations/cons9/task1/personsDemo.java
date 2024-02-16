

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class personsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        List<PersonItem> persons = new ArrayList<>();
        String path = "src/consultations/cons9/task1/pesrons.txt";

        FileToList toList = new FileToList();

        toList.readFromFile(path, persons);

        for (PersonItem person : persons) {
            System.out.println("Name: " + person.getName() +"\n" + "Age: " + person.getAge());
        }
    }
}
