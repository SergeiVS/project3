package homework.task8;

import homework.task2.StringsCollectionDemo;

import java.util.List;

public class PersonListDemo {
    public static void main(String[] args) {
        PersonList personList = new PersonList();

        List<PersonT8> persons = personList.getPersonList();

        persons.add(new PersonT8("Person1", 21,"Male", 2000));
        persons.add(new PersonT8("Person2", 33,"Female", 2500));
        persons.add(new PersonT8("Person3", 26,"Female", 2100));
        persons.add(new PersonT8("Person4", 26,"Male", 1800));
        persons.add(new PersonT8("Person5", 28,"Female", 2000));
        persons.add(new PersonT8("Person6", 20,"Male", 1300));
        persons.add(new PersonT8("Person7", 29,"Female", 1500));
        persons.add(new PersonT8("Person8", 45,"Male", 2900));

        StringsCollectionDemo.printList(persons);
        System.out.println();

        List<PersonT8> personsByAge = personList.personsByAgeCriteria(persons,25, 100);
        StringsCollectionDemo.printList(personsByAge);
        System.out.println();

        List<PersonT8> personsBySex = personList.personsBySex(personsByAge, "Male");
        StringsCollectionDemo.printList(personsBySex);
        System.out.println();

        Double avgSalary = personList.avgSalary(personsBySex);
        System.out.println("Average salary of male persons over 25 years is: " + avgSalary);

    }
}
