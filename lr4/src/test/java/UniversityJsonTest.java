import controller.JsonManager;
import controller.UniversityCreator;
import model.University;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityJsonTest {

    @Test
    public void testJsonSaveLoad() throws IOException {
        // 1. Створюємо типовий університет
        UniversityCreator creator = new UniversityCreator();
        University oldUniversity = creator.createTypicalUniversity();

        // 2. Json менеджер
        JsonManager json = new JsonManager();

        // 3. Записуємо у JSON
        String filePath = "university.json";
        json.saveToJson(oldUniversity, filePath);

        // 4. Зчитуємо назад
        University newUniversity = json.loadFromJson(filePath);

        // 5. Перевіряємо, що об’єкти рівні
        assertEquals(oldUniversity, newUniversity);
    }
}

