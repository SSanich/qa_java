import com.example.Cat;
import com.example.Feline;
import com.example.Names;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    Cat cat ;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Names.FOR_PREDATOR_LIST);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

}
