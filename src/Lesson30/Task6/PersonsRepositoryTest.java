package Task6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonsRepositoryTest {

    @Test
    public void sortPersonList() {

        PersonsRepository personsRepository = new PersonsRepository();

        Person person1 = new Person("Ivan", 25);
        Person person2 = new Person("Petr", 21);
        Person person3 = new Person("John", 34);
        Person person4 = new Person("Tanja", 28);

        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<Person> expectedPersonList = new ArrayList<>();
        expectedPersonList.add(person2);
        expectedPersonList.add(person1);
        expectedPersonList.add(person4);
        expectedPersonList.add(person3);

        personsRepository.sortPersonList(personList);

        assertEquals(expectedPersonList, personList);
    }


}