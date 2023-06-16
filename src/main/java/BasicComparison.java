
public class Basic {
    public static int compare(final int a, final int b) {
        if (a > b) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        //function call
        int compare = compare(num1, num2);
        System.out.println(compare);
    }
}
