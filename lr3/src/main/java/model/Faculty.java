package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends AbstractUnit {

    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        super(name, head);
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

