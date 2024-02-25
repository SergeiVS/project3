package lessonCode.task;

public class Task {
    public static void main(String[] args) {

        StudentsRepository students = new StudentsRepository();
        Subjects subjects = new Subjects();
        StudentGradeBook system = new StudentGradeBook(students, subjects);

        // Пример использования
        Student student1 = new Student(1, "Olga", "Olga");
        Student student2 = new Student(2, "Ruslan", "Ruslan");

        system.addStudent(student1);
        system.addStudent(student2);

        subjects.addSubject("Математика");
        subjects.addSubject("История");

        system.addGrade(1, "Математика", 10);
        system.addGrade(1, "Математика", 9);
        system.addGrade(2, "Математика", 9);
        system.addGrade(1, "Математика", 10);
        system.addGrade(1, "История", 12);
        system.addGrade(2, "Математика", 12);

        System.out.println("Average grade for Olga in Mathematics: " + system.getAverageGrade(1, "Математика"));
        System.out.println("Top student: " + system.getTopStudent());
    }
}
