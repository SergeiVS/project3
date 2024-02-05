package homework.task4_5;

import java.util.Objects;

public class StudentT4 {
    //В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления
    private String name;
    private Integer yearOfAdmission;
    private Double avgNote;

    public StudentT4(String name, Integer yearOfAdmission, Double avgNote) {
        this.name = name;
        this.yearOfAdmission = yearOfAdmission;
        this.avgNote = avgNote;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfAdmission() {
        return yearOfAdmission;
    }

    public Double getAvgNote() {
        return avgNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentT4 studentT4)) return false;
        return Objects.equals(name, studentT4.name) && Objects.equals(yearOfAdmission, studentT4.yearOfAdmission) && Objects.equals(avgNote, studentT4.avgNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfAdmission, avgNote);
    }

    @Override
    public String toString() {
        return "StudentT4{" +
                "name='" + name + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", avgNote=" + avgNote +
                '}';
    }
}
