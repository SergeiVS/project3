package homework.task1;

import java.util.Objects;

public class StudentL33 {
    private String name;
    private Integer age;
    private Double avgNote;

    public StudentL33(String name, Integer age, Double avgNote) {
        this.name = name;
        this.age = age;
        this.avgNote = avgNote;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAvgNote() {
        return avgNote;
    }

    public void setAvgNote(Double avgNote) {
        this.avgNote = avgNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentL33 student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(avgNote, student.avgNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, avgNote);
    }

    @Override
    public String toString() {
        return "StudentL33{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgNote=" + avgNote +
                '}';
    }
}

