import org.junit.platform.commons.util.Preconditions;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceUnicodeInJson {

    private static final String regex = "\\\\u[0-9a-fA-F]{4}";

    private static String inputFile = "/Users/vipulraj/IdeaProjects/Junit-testing/src/main/inputFiles/sample4.json";   // Specify the input JSON file path
    private static String outputFile = "/Users/vipulraj/IdeaProjects/Junit-testing/src/main/inputFiles/output.json";

    private static void replaceUnicodeWithJson(String inputFile, String outputFile) {
        try {
            // Read the input JSON file
            String jsonContent = new String(Files.readAllBytes(Paths.get(inputFile)), StandardCharsets.UTF_8);

            // Define the regular expression pattern for Unicode replacement


            // Compile the pattern
            Pattern pattern = Pattern.compile(regex);

            // Create a matcher for the JSON content
            Matcher matcher = pattern.matcher(jsonContent);

            // Replace all Unicode values with regex
            String modifiedJsonContent = matcher.replaceAll("");

            // Write the modified JSON to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(modifiedJsonContent);
            writer.close();

            System.out.println("Unicode values replaced successfully. Output file: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //Driver function
    public static void main(String[] args) throws IOException {

        replaceUnicodeWithJson(inputFile, outputFile);
    }

    public static String modifyInvalidJsonValues(final String inputFile) throws IOException {
        String jsonContent = new String(Files.readAllBytes(Paths.get(inputFile)), StandardCharsets.UTF_8);


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jsonContent);

        jsonContent = matcher.replaceAll("");
        // Write the modified JSON to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(jsonContent);
        writer.close();

        System.out.println("Unicode values replaced successfully. Output file: " + outputFile);

        return jsonContent;
    }
}
