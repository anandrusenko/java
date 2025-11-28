package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseConnection {

    private static final String DB_PATH = "src/main/resources/students.db";
    private static final String DB_URL = "jdbc:sqlite:" + DB_PATH;

    // Створення підключення
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (Exception e) {
            System.out.println("DB connection error: " + e.getMessage());
            return null;
        }
    }

    // Ініціалізація бази: створення таблиці + вставка студентів
    public static void initializeDatabase() {
        try (Connection conn = getConnection();
             Statement st = conn.createStatement()) {

            // Створюємо таблицю
            st.execute("""
                CREATE TABLE IF NOT EXISTS students (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    last_name TEXT NOT NULL,
                    first_name TEXT NOT NULL,
                    middle_name TEXT,
                    birth_date TEXT NOT NULL,
                    gradebook_number TEXT NOT NULL
                );
            """);

            // Перевіряємо чи таблиця порожня
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS cnt FROM students");
            if (rs.next() && rs.getInt("cnt") == 0) {

                // Заповнюємо студентами
                st.execute("""
                    INSERT INTO students(last_name, first_name, middle_name, birth_date, gradebook_number) VALUES
                    ('Петренко','Андрій','Олегович','2003-01-12','KB001'),
                    ('Іваненко','Марія','Петрівна','2002-01-25','KB002'),
                    ('Сидоренко','Юлія','Ігорівна','2002-02-05','KB003'),
                    ('Ткаченко','Олег','Сергійович','2002-02-28','KB004'),
                    ('Коваль','Ірина','Андріївна','2003-03-22','KB005'),
                    ('Шевченко','Назар','Іванович','2003-03-06','KB006'),
                    ('Мельник','Катерина','Володимирівна','2003-04-10','KB007'),
                    ('Романюк','Олексій','Павлович','2003-04-15','KB008'),
                    ('Демчук','Олена','Романівна','2002-05-07','KB009'),
                    ('Гордієнко','Оксана','Михайлівна','2003-05-26','KB010'),
                    ('Литвин','Сергій','Олегович','2003-07-03','KB011'),
                    ('Марченко','Анна','Артемівна','2002-07-27','KB012'),
                    ('Захарченко','Тарас','Юрійович','2003-08-30','KB013'),
                    ('Бондар','Роман','Віталійович','2003-09-30','KB014'),
                    ('Саюк','Ілона','Петрівна','2002-09-13','KB015'),
                    ('Нагнишин','Юрій','Олександрович','2003-09-18','KB016'),
                    ('Пилипенко','Арсен','Олегович','2003-10-05','KB017'),
                    ('Левченко','Юлія','Миколаївна','2002-10-23','KB018'),
                    ('Мазур','Богдан','Петрович','2002-11-11','KB019'),
                    ('Онищенко','Аліна','Олександрівна','2003-12-22','KB020');
                """);

                System.out.println("Базу даних ініціалізовано!");
            }

        } catch (Exception e) {
            System.out.println("Init error: " + e.getMessage());
        }
    }
}

