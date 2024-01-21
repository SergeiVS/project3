package task1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentService {

    public ArrayList<Student> fillStudentsArray(){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            students.add(new Student("John" + i + 1,"Dow" + i +1));
        }
        return students;
    }
    public void reverseStudent(ArrayList<Student> students){

        Collections.reverse(students);
    }


}
