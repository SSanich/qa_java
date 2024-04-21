import com.example.Feline;
import com.example.Lion;
import com.example.Names;;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LionNegativeTest {
    @Test
    public void testConstructorException() {
        try {
            new Lion("", new Feline());
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            // Если исключение выброшено, тест пройден
            assertEquals(Names.NEGATIVE_ANSWER_STRING, e.getMessage());
        }
    }
}



