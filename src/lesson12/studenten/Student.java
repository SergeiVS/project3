package studenten;

public class Student {
    private int id;
    private String group;
    private boolean isStudent;
    lesson12.students.Person person;

    public Student(int id, String group, boolean isStudent, lesson12.students.Person person) {
        this.id = id;
        this.group = group;
        this.isStudent = isStudent;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", isStudent=" + isStudent +
                ", person=" + person +
                '}';
    }
}
