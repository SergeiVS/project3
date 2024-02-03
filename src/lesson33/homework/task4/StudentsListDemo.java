package homework.task4;

import homework.task1.StudentL33;
import homework.task2.StringsCollectionDemo;

import java.util.List;

public class StudentsListDemo {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList();
        List<StudentT4> database = studentsList.getStudentList();

        StudentT4 student1 = new StudentT4("John", 2010, 4.1);
        StudentT4 student2 = new StudentT4("Kate", 2012, 4.6);
        StudentT4 student3 = new StudentT4("Phil", 2007, 4.5);
        StudentT4 student4 = new StudentT4("Phillip", 2009, 4.9);
        StudentT4 student5 = new StudentT4("Tanja", 2022, 4.9);
        StudentT4 student6 = new StudentT4("Stevy", 2015, 4.3);
        StudentT4 student7 = new StudentT4("John", 2017, 5.0);
        StudentT4 student8 = new StudentT4("Gaby", 2004, 4.4);

        database.add(student1);
        database.add(student2);
        database.add(student3);
        database.add(student4);
        database.add(student5);
        database.add(student6);
        database.add(student7);
        database.add(student8);


        StringsCollectionDemo.printList(database);
        System.out.println();

        StringsCollectionDemo.printList(studentsList.findTopThreeNotes(database));
        System.out.println();

        StringsCollectionDemo.printList(studentsList.sortByYearOfAdmission(database));

    }
}
