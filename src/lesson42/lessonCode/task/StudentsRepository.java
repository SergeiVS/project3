package lessonCode.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentsRepository {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }
    public void  addStudent(Student student){
        students.add(student);
    }
    public Optional<Student> findById(Integer id){
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }

    @Override
    public String toString() {
        return "StudentsRepository{" +
                "students=" + students +
                '}';
    }
}
