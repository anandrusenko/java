package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends AbstractUnit {

    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        super(name, head);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departments);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Faculty{");
        sb.append(super.toString()).append('\n');
        for (Department d : departments) {
            sb.append("    ").append(d).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
