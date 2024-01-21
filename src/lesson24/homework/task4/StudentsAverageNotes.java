package task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentsAverageNotes {
    public static void main(String[] args) {

        HashMap<String, Double> studentsAverageNote = new HashMap<>();
        StudentsService studentsService = new StudentsService();

        studentsAverageNote.put("John Smith", 4.5);
        studentsAverageNote.put("Jenifer Dow", 4.8);
        studentsAverageNote.put("Sam Brown", 4.4);
        studentsAverageNote.put("Ivan Pomidorov", 4.4);
        studentsAverageNote.put("Johnnie Walker", 3.7);

        System.out.println(studentsAverageNote);

 String bestStudent = studentsService.maxAverageNote(studentsAverageNote);
    System.out.println("The best student is " + bestStudent + " with average note " + studentsAverageNote.get(bestStudent));

    studentsAverageNote.replace("Johnnie Walker", 4.0);

        System.out.println(studentsAverageNote);

    }
}
