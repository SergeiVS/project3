package lesson12.students;

import java.util.Date;

public class Person {

    private String name;
    private Date dateOfBirth;
    lesson12.students.Address address;

    public Person(String name, Date dateOfBirth, lesson12.students.Address address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public lesson12.students.Address getAddress() {
        return address;
    }

    public void setAddress(lesson12.students.Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }
}
