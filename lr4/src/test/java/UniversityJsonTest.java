import controller.JsonManager;
import controller.UniversityCreator;
import model.University;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityJsonTest {

    @Test
    public void testJsonSaveLoad() throws IOException {
        
        UniversityCreator creator = new UniversityCreator();
        University oldUniversity = creator.createTypicalUniversity();

        
        JsonManager json = new JsonManager();

        
        String filePath = "university.json";
        json.saveToJson(oldUniversity, filePath);

        
        University newUniversity = json.loadFromJson(filePath);

        
        assertEquals(oldUniversity, newUniversity);
    }
}

