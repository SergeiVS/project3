package homework.task4;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {

    //В списке студентов - выбрать тех трех кто имеет самые высокие оценки и отсортировать по году поступления

    private final List<StudentT4> studentList;

    public StudentsList() {
        this.studentList = new ArrayList<>();
    }

    public List<StudentT4> getStudentList() {
        return studentList;
    }

    public List<StudentT4> findTopThreeNotes(List<StudentT4> database) {

        return database.stream()
                .sorted((s1, s2) -> s2.getAvgNote().compareTo(s1.getAvgNote()))
                .limit(3)
                .toList();
    }

    public List<StudentT4> sortByYearOfAdmission(List<StudentT4> database) {

       return database.stream()
                .sorted((s1, s2) -> s1.getYearOfAdmission().compareTo(s2.getYearOfAdmission()))
               .toList();
    }

}
