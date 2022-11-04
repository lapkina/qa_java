import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void felineGetFamilyTest(){
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void felineEatMeatTest() throws Exception {
        String actual = feline.eatMeat().toString();
        assertEquals("[Животные, Птицы, Рыба]", actual);
    }
    @Test
    public void felineGetKittensTest(){
        int actual = feline.getKittens();
        assertEquals(1,actual);
    }
}
