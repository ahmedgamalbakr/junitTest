import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void testAddition() {
        int result = 1 + 1;
        Assertions.assertEquals(2, result);
    }
}
