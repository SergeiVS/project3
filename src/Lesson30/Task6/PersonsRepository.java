package Task6;

import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {

List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Person> sortPersonList(List<Person> personList){

        personList.sort((Person p1, Person p2) ->  {
            return p1.getAge() - p2.getAge();
        });

        return new ArrayList<>(personList);
    }
}
