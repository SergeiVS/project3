package task6;

import homework.task2.StringsCollectionDemo;

import java.util.List;

public class PersonListDemo {
    public static void main(String[] args) {

        PersonT6List database = new PersonT6List();

        PersonT6 person1 = new PersonT6("John", 22);
        person1.getSkilsList().addAll(List.of("Java", "English", "Exel"));

        PersonT6 person2 = new PersonT6("Jane", 25);
        person2.getSkilsList().addAll(List.of("C#", "German", "English", "Exel"));

        PersonT6 person3 = new PersonT6("Kate", 27);
        person3.getSkilsList().addAll(List.of("Java", "English", "Word"));

        PersonT6 person4 = new PersonT6("Ivan", 24);
        person1.getSkilsList().addAll(List.of("C++", "Spanish", "Word"));

        PersonT6 person5 = new PersonT6("Sam", 28);
        person1.getSkilsList().addAll(List.of("Java", "English", "Exel"));

        PersonT6 person6 = new PersonT6("Johnie", 22);
        person6.getSkilsList().addAll(List.of("Java", "C++", "English", "Exel"));

        database.getPersons().add(person1);
        database.getPersons().add(person2);
        database.getPersons().add(person3);
        database.getPersons().add(person4);
        database.getPersons().add(person5);
        database.getPersons().add(person6);

        StringsCollectionDemo.printList(database.getPersons());
        System.out.println();

        List<PersonT6> personsByAge = database.findPersonsByAge(database.getPersons(),25);

        StringsCollectionDemo.printList(personsByAge);
        System.out.println();

        StringsCollectionDemo.printList(database.findUniqueSkils(personsByAge));

    }
}
