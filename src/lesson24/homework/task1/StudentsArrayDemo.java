package task1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsArrayDemo {
    public static void main(String[] args) {

      StudentService studentService = new StudentService();

        ArrayList<Student> students = studentService.fillStudentsArray();
        System.out.println(students);

        ArrayList<Student> reverseStudent = (ArrayList<Student>) students.clone();

        studentService.reverseStudent(reverseStudent);

        System.out.println(reverseStudent);

        students.remove(02);
        System.out.println(students);
    }
}
