import static org.junit.Assert.*;
import org.junit.*;
public class subtractertest {
    @Test
    public void addition() {
        subtracter ex = new subtracter(20);
        assertEquals(19, ex.sub(1));
   }
}
