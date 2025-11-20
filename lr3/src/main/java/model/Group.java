package model;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractUnit {

    private List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        super(name, head);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Group{");
        sb.append(super.toString()).append('\n');
        for (Student s : students) {
            sb.append("        ").append(s).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
