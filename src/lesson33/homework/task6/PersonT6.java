package homework.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonT6 {
    // Дана коллекция Person - Имя, возраст, список навыков (например языки программирования) Нужно найти все
    // уникальные навыки которыми обладают люди старше 25 лет и отсортировать их

    private String name;
    private Integer age;
    private List<String> skilsList;

    public PersonT6(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.skilsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getSkilsList() {
        return skilsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonT6 personT6)) return false;
        return Objects.equals(getName(), personT6.getName()) && Objects.equals(getAge(), personT6.getAge()) && Objects.equals(getSkilsList(), personT6.getSkilsList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSkilsList());
    }

    @Override
    public String toString() {
        return "PersonT6{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skilsList=" + skilsList +
                '}';
    }
}
