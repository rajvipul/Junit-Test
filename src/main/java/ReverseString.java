import java.util.Arrays;

public class ReverseString {

    public static String reverse(final String input) {
        byte[] inputvalue = input.getBytes();
        byte[] outputvalue = new byte[inputvalue.length];

        for (int i=0; i<inputvalue.length; i++) {
            outputvalue[i] = inputvalue[inputvalue.length - i-1];
        }
        return new String(outputvalue);
    }

    public static void main(String[] args) {
        //Driver code
        final String inputString = "This is a tutorial to write unit test";
        final String outputString = reverse(inputString);
        System.out.println(outputString.toString());

    }
}
