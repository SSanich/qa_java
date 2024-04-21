import com.example.Cat;
import com.example.Feline;
import com.example.Names;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetFood() throws Exception {
        assertEquals(Names.FOR_PREDATOR_LIST, cat.getFood());
    }

}
