package homework.task8;

import java.util.Objects;

public class PersonT8 {
    //Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
    //   Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
    private String name;
    private Integer age;
    private String sex;
    private Integer salary;

    public PersonT8(String name, Integer age, String sex, Integer salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonT8 personT8)) return false;
        return Objects.equals(getName(), personT8.getName()) && Objects.equals(getAge(), personT8.getAge()) && Objects.equals(getSex(), personT8.getSex()) && Objects.equals(getSalary(), personT8.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSex(), getSalary());
    }

    @Override
    public String toString() {
        return "PersonT8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }
}
