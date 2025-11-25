package controller;

import model.University;
import controller.JsonManager;

public class Run {

    public static void main(String[] args) {
        try {
            // 1. Створюємо університет
            University university = createTypycalUniversity();

            // 2. Створюємо JsonManager
            JsonManager jsonManager = new JsonManager();

            // 3. Записуємо у JSON-файл
            jsonManager.saveToJson(university, "university.json");

            System.out.println("JSON файл успішно створено!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static University createTypycalUniversity() {
        UniversityCreator creator = new UniversityCreator();
        return creator.createTypicalUniversity();
    }
}

