import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    @Test
    public void catGetSoundTest(){

        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void catEatTest() throws Exception {

        String actual = cat.getFood("Хищник").toString();
        assertEquals("[Животные, Птицы, Рыба]", actual);
    }
}
