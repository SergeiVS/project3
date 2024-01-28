package Task6;

public class Person {

    private final String Name;
    private final int age;

    public Person(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
