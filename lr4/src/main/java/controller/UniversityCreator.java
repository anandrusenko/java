package controller;

import model.Human;
import model.Sex;
import model.University;

public class UniversityCreator {

    private final FacultyCreator facultyCreator = new FacultyCreator();
    private final HumanCreator humanCreator = new HumanCreator();

    public University createTypicalUniversity() {
        Human rector = humanCreator.createHuman(
                "Микола", "Голуб", "Іванович", Sex.MALE);

        University university = new University(
                "Dnipro University of Technology", rector);

        university.addFaculty(
                facultyCreator.createTypicalFaculty(
                        "Факультет інформаційних технологій", rector));

        return university;
    }
}
