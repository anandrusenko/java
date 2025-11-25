package controller;

import model.Department;
import model.Faculty;
import model.Human;

public class FacultyCreator {

    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty createTypicalFaculty(String name, Human head) {
        Faculty faculty = new Faculty(name, head);

        Department dep1 = departmentCreator.createTypicalDepartment(
                "Кафедра системного аналізу", head);
        Department dep2 = departmentCreator.createTypicalDepartment(
                "Кафедра комп'ютерних наук", head);

        faculty.addDepartment(dep1);
        faculty.addDepartment(dep2);

        return faculty;
    }
}
