package lessonCode.task;

import java.util.TreeSet;

public class Subjects {
    private TreeSet<String> subjects = new TreeSet<>();

    void addSubject(String subject){
    subjects.add(subject);
    }

    public TreeSet<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects=" + subjects +
                '}';
    }
}
