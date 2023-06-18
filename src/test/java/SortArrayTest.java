import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test
    public void sortArrayList() {
        SortArray sortArray = new SortArray();
        int[] array = {76,34,1,56,93,45};
        sortArray.sortArrayList(array);
        Assertions.assertArrayEquals(new int[]{1,34,45,56,76,93}, array);
    }
}
