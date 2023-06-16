import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTests {

    @Test
    public void compare() {
        int value1 = Basic.compare(2,1);
        int value2 = Basic.compare(2,3);
        Assertions.assertEquals(1, value1);
        Assertions.assertEquals(-1,value2);
    }
}
