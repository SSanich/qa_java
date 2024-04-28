import com.example.Cat;
import com.example.Feline;
import com.example.Names;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CatTest {
    Feline feline;
    Cat cat;

    @Before
    public void setup() {
        feline = new Feline();
        cat = new Cat(feline);
    }
    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetFood() throws Exception {
        assertEquals(Names.FOR_PREDATOR_LIST, cat.getFood());
    }

}
