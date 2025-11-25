package controller;

import model.University;

public class Run {

    public static void main(String[] args) {
        University university = createTypycalUniversity();
        System.out.println(university);
    }

    public static University createTypycalUniversity() {
        UniversityCreator creator = new UniversityCreator();
        return creator.createTypicalUniversity();
    }
}
