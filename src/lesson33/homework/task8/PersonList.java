package homework.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {

    // Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
    //   Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.

    List<PersonT8> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public List<PersonT8> getPersonList() {
        return personList;
    }
    public List<PersonT8> personsBySex(List<PersonT8> personList, String sex){
       return personList.stream()
               .filter(p -> p.getSex().equals(sex))
               .toList();
    }

    public List<PersonT8> personsByAgeCriteria(List<PersonT8> personList, Integer minAge, Integer maxAge){
        return personList.stream()
                .filter(p -> p.getAge() >= minAge && p.getAge() <= maxAge)
                .toList();
    }

public Double avgSalary(List<PersonT8> personList){
        personList.stream()
                .mapToInt(p -> p.getSalary())
                .average()
                .getAsDouble();

}
}
