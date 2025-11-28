package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;
import java.util.List;

public class StudentService {

    private final StudentDao dao = new StudentDaoImpl();

    public void printStudentsByMonth(int month) {

        List<Student> list = dao.getStudentsByMonth(month);

        if (list.isEmpty()) {
            System.out.println("Немає студентів, народжених у цьому місяці.");
            return;
        }

        for (Student s : list) {
            System.out.println(
                    s.getId() + ") " +
                            s.getLastName() + " " +
                            s.getFirstName() + " " +
                            (s.getMiddleName() == null ? "" : s.getMiddleName()) +
                            " | Дата нар.: " + s.getBirthDate() +
                            " | Заліковка: " + s.getGradebookNumber()
            );
        }
    }
}
