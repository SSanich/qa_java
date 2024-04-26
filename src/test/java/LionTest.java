import com.example.Feline;
import com.example.Lion;
import com.example.Names;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline = new Feline();
    Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(Names.FOR_PREDATOR_LIST, lion.getFood());
    }
}

