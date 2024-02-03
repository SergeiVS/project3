package homework.task1;



import java.util.ArrayList;
import java.util.List;

public class StudentsDatabase {

    //Фильтрация списка студентов по возрасту и со средним баллом больше 4.5 StudentL33
    // { String name; int age; double avgGrade; }
   private final List<StudentL33> database = new ArrayList<>();

    public List<StudentL33> getDatabase() {
        return database;
    }

    public List<StudentL33> filterByAge(List<StudentL33> database, Integer minAge, Integer maxAge) {


        return database.stream()
                .filter(StudentL33 -> StudentL33.getAge() >= minAge && StudentL33.getAge() <= maxAge)
                .toList();
    }

    public List<StudentL33> filterBetterAvgNote(List<StudentL33> database, Double minAvgNote, Double maxAvgNote) {

        return database.stream()
                .filter(StudentL33 -> StudentL33.getAvgNote() >= minAvgNote && StudentL33.getAvgNote() <= maxAvgNote)
                .toList();
    }
}
