import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    String sex;
    boolean hasManeResult;
    public LionTest(String sex,Feline feline, boolean hasManeResult) {
        this.sex = sex;
        this.feline = feline;
        this.hasManeResult = hasManeResult;
    }
    @Parameterized.Parameters
    public static Object[][] getInformation() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline,false},
        };
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private static Feline feline;
    @Test
    public void lionTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(hasManeResult, actual);
    }
    @Test
    public void lionMaleGetFoodTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        Mockito.when(lion.getFood("Хищник")).thenReturn(Collections.singletonList("Животные, Птицы, Рыба"));
        String actualMaleGetFood = lion.getFood("Хищник").toString();
        assertEquals("[Животные, Птицы, Рыба]", actualMaleGetFood);
    }
    @Test
    public void lionMaleGetKittenTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        Mockito.when(feline.getKittens()).thenReturn(2);
        int expectedLionGetKitten = 2;
        int actualLionGetKitten = lion.getKittens();
        assertEquals(expectedLionGetKitten,actualLionGetKitten);
    }
}

