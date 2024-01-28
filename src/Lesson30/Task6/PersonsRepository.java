package Task6;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {
ComparatorByAge comparator = new ComparatorByAge();
List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Person> sortPersonList(List<Person> personList){

        personList.sort(comparator);

        return personList;
    }
}
