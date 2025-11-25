package controller;

import model.Group;
import model.Human;
import model.Sex;
import model.Student;

import java.util.Arrays;
import java.util.List;

public class GroupCreator {

    private final StudentCreator studentCreator = new StudentCreator();

    public Group createTypicalGroup(String groupName, Human head) {
        Group group = new Group(groupName, head);

        List<Student> students = Arrays.asList(
                studentCreator.createStudent(
                        "Іван", "Іванов", "Іванович", Sex.MALE, groupName + "-01"),
                studentCreator.createStudent(
                        "Петро", "Петренко", "Петрович", Sex.MALE, groupName + "-02"),
                studentCreator.createStudent(
                        "Олена", "Шевченко", "Олегівна", Sex.FEMALE, groupName + "-03")
        );

        for (Student s : students) {
            group.addStudent(s);
        }

        return group;
    }
}

