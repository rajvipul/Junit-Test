import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void isEven() {
        boolean actualEven = BasicComparison.isEven(6738);
        boolean actualOdd = BasicComparison.isEven(73641);
        assertTrue(actualEven);
        assertFalse(actualOdd);
    }
    @Test
    public void incrementArray() {
        int[] expectedArray =  new int[] {2,3,4,5,6};
        int [] actualArray = BasicComparison.incrementArray(new int[]{1, 2, 3, 4, 5});
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
}
