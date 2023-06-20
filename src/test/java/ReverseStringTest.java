import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    @DisplayName("Reversal Of String")
    public void reverse() {
        ReverseString reverseString = new ReverseString();
        String actualString = "Hello";
        String actualString2 = "This is a tutorial to write unit test";
        Assertions.assertEquals("olleH", reverseString.reverse(actualString));
        Assertions.assertEquals("tset tinu etirw ot lairotut a si sihT", reverseString.reverse(actualString2));
    }
}
