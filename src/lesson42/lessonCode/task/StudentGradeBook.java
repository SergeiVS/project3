package lessonCode.task;

import com.sun.jdi.Value;

import java.util.*;

public class StudentGradeBook {

    private final StudentsRepository students;
    private final Subjects subjects;

    private Map<Integer, Map<String, List<Integer>>> grades = new HashMap<>();

    public StudentGradeBook(StudentsRepository students, Subjects subjects) {
        this.students = students;
        this.subjects = subjects;
    }

    public void addStudent(Student student) {
        students.addStudent(student);
        grades.put(student.getId(), new HashMap<>());
    }

    public void removeStudent(Integer studentId) {
        students.getStudents().removeIf(student -> student.getId() == studentId);
        grades.remove(studentId);
    }


    public void addGrade(int studentId, String subject, int grade) {

        if (!subjects.getSubjects().contains(subject)) {

            System.out.println("Предмета " + subject + " нет в списке предметов для оценок");
            return;
        }

        grades.get(studentId).
                computeIfAbsent(subject, k -> new ArrayList<>())
                .add(grade);

        //   Map<String,List<Integer>> mapSubjectGrades = grades.get(studentId);

        //  if (mapSubjectGrades.get(subject) == null) {
        //       List<Integer> gradesForCurrentSubject = new ArrayList<>();
        //      mapSubjectGrades.put(subject, gradesForCurrentSubject);
        //  }

        //List<Integer> gradesForCurrentSubject = mapSubjectGrades.get(subject);

        // gradesForCurrentSubject.add(grade);

    }

    public double getAverageGrade(int studentId, String subject) {

        List<Integer> studentGrades = grades.get(studentId).get(subject);

        if (studentGrades == null || studentGrades.isEmpty()) {
            return 0.0;
        }

        return studentGrades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public Student getTopStudent() {

        TreeMap<Integer, Double> studentsAvgs = new TreeMap<Integer, Double>((a, b)-> (int) (a.doubleValue() - b.doubleValue()));

        for (Map.Entry<Integer, Map<String, List<Integer>>> entry : grades.entrySet()) {

            Double sAvg = entry.getValue().values().stream()
                    .mapToInt(a -> a.stream().mapToInt(i -> i).sum())
                    .average()
                    .orElse(0.0);
                studentsAvgs.put(entry.getKey(), sAvg);
        }
        int topId = studentsAvgs.firstKey();


//        double highestAvgGrade = 0;
//        Student topStudent = null;
//
//        for (Student student : students) {
//            double totalGrade = 0;
//            int countGrades = 0;
//
//            Map<String, List<Integer>> studentGrades = grades.get(student.getId());
//            for (List<Integer> gradeList : studentGrades.values()) {
//                for (int grade : gradeList) {
//                    totalGrade += grade;
//                    countGrades++;
//                }
//            }
//
//            double averageGrade = totalGrade / countGrades;
//
//            if (averageGrade > highestAvgGrade) {
//                highestAvgGrade = averageGrade;
//                topStudent = student;
//            }
//        }
        return students.getStudents().get(topId);
    }
}
