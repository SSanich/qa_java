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

    public LionParamTest(String sex, boolean hasEggs) {
        this.sex = sex;
        this.hasEggs = hasEggs;
    }

    Lion lion;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };

    }

    @Test
    public void testHasMane() throws Exception {
        lion =new Lion(sex, feline);
        Assert.assertEquals(hasEggs,lion.doesHaveMane());
    }
}