package task4;

import task2.MinMax;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class StudentsService {

    class StudentEntry {
        String name;
        double value;

        public StudentEntry(String name, double value) {
            this.name = name;
            this.value = value;
        }
    }


    private StudentEntry studentEntry = new StudentEntry("", 0);

    public String maxAverageNote(HashMap<String, Double> studentsAverageNotes) {

        studentEntry = new StudentEntry("", 0);

        studentsAverageNotes.forEach((key, value) -> {
            if (value > studentEntry.value) {
                studentEntry = new StudentEntry(key, value);
            }
        });

        return studentEntry.name;
    }

}
