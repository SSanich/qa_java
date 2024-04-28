import com.example.Feline;
import com.example.Names;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void getKittensWithParamTest() {
        assertEquals(3,feline.getKittens(3));
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void eatMeatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(Names.FOR_PREDATOR_LIST);
        assertEquals(Names.FOR_PREDATOR_LIST,feline.eatMeat());
    }

}
