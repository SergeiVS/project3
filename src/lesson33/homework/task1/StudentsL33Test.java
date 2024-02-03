package homework.task1;

import java.util.List;
import java.util.function.Consumer;

public class StudentsL33Test {
    public static void main(String[] args) {

        StudentsDatabase sD = new StudentsDatabase();
        List<StudentL33> database = sD.getDatabase();
        Consumer<List<StudentL33>> printList = new Consumer<List<StudentL33>>() {
            @Override
            public void accept(List<StudentL33> students) {
                students.forEach(System.out::println);
            }
        };


        StudentL33 student1 = new StudentL33("John", 21, 4.1);
        StudentL33 student2 = new StudentL33("Kate", 25, 4.6);
        StudentL33 student3 = new StudentL33("Phil", 33, 4.5);
        StudentL33 student4 = new StudentL33("Ivan", 26, 4.8);
        StudentL33 student5 = new StudentL33("Tanja", 22, 4.9);
        StudentL33 student6 = new StudentL33("Stevy", 28, 4.3);
        StudentL33 student7 = new StudentL33("John", 24, 5.0);
        StudentL33 student8 = new StudentL33("Gaby", 27, 4.4);

        database.add(student1);
        database.add(student2);
        database.add(student3);
        database.add(student4);
        database.add(student5);
        database.add(student6);
        database.add(student7);
        database.add(student8);

        printList.accept(database);
        System.out.println();

        List<StudentL33> studentsByAge = sD.filterByAge(database, 23, 28);

        printList.accept(studentsByAge);
        System.out.println();

        List<StudentL33> studentsByNote = sD.filterBetterAvgNote(database, 4.5, 5.0);

        printList.accept(studentsByNote);


    }
}
