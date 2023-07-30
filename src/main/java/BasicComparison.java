import java.util.Arrays;

public class BasicComparison {
    public static int compare(final int a, final int b) {
        if (a > b) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static boolean isEven(final int i) {
        return i%2 == 0;
    }

    public static int[] incrementArray(int[] arr) {
        try {
            if (arr.length >0) {
                for (int i=0; i < arr.length; i++) {
                    arr[i]++;
                    //arr = new int[]{arr[i]};
                }
            }
        }
        catch (final Exception e) {
            System.out.println("Array is Empty!!!!");
        }

        return arr;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        //function call
        int compare = compare(num1, num2);
        System.out.println(compare);

        //function call to increment the array list
        int arr[] = {1,2,3,4,5};
        int[] increment = incrementArray(arr);
        System.out.println(Arrays.toString(increment));
    }
}
