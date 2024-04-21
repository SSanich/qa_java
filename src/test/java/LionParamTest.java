import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    public String sex;
    public boolean hasEggs;
    public Feline feline;

    public LionParamTest(String sex, Feline feline, boolean hasEggs) throws Exception {
        this.sex = sex;
        this.hasEggs = hasEggs;
        this.feline = feline;
    }

    Lion lion;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец",new Feline(), true},
                {"Самка", new Feline(), false},
        };

    }

    @Test
    public void testHasMane() throws Exception {
        lion =new Lion(sex, feline);
        Assert.assertEquals(hasEggs,lion.doesHaveMane());
    }
}