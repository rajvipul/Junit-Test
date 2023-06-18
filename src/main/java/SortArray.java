import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

    //Code to sort an array
    //Brute force algorithm
    public static int[] sortArrayList(int[] array) {
        int len = array.length;
        final List<String> wordList = new ArrayList<>();
        for(int i =0; i<len; i++) {
            for(int j=0; j<len-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        //Driver code
        int[] array = {5,27,3,87,34,21};
        int[] sortedArray = sortArrayList(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
