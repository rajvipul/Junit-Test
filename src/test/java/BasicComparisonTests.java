import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicComparisonTests {

    @Test
    public void compare() {
        int value1 = BasicComparison.compare(2,1);
        int value2 = BasicComparison.compare(2,3);
        int value3 = BasicComparison.compare(3,3);
        Assertions.assertEquals(1, value1);
        Assertions.assertEquals(-1,value2);
        Assertions.assertEquals(-1, value3);
    }
}
