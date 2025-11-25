package controller;

import model.Department;
import model.Group;
import model.Human;

public class DepartmentCreator {

    private final GroupCreator groupCreator = new GroupCreator();

    public Department createTypicalDepartment(String name, Human head) {
        Department department = new Department(name, head);

        Group group1 = groupCreator.createTypicalGroup("SA-31", head);
        Group group2 = groupCreator.createTypicalGroup("SA-32", head);

        department.addGroup(group1);
        department.addGroup(group2);

        return department;
    }
}

