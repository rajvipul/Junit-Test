import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReplaceUnicodeInJsonTest {

    String inputFile = "/Users/vipulraj/IdeaProjects/Junit-testing/src/test/TestInputFiles/sample4.json";
    String outputFile = "/Users/vipulraj/IdeaProjects/Junit-testing/src/test/TestInputFiles/output.json";

    @Test
    public void modifyInvalidJsonValues() throws IOException {
        final String validJson = new String(Files.readAllBytes(Paths.get(outputFile)), StandardCharsets.UTF_8);
        final String unicodeJson = new String(Files.readAllBytes(Paths.get(inputFile)), StandardCharsets.UTF_8);
        final String correctedJson = ReplaceUnicodeInJson.modifyInvalidJsonValues(unicodeJson);
        Assertions.assertEquals(validJson,correctedJson);
    }

    @Test
    public void testRemoveUnicode_NullInput() throws IOException {
        String nullInputJson = null;
        String modifiedJson = ReplaceUnicodeInJson.modifyInvalidJsonValues(inputFile);
        Assertions.assertNull(nullInputJson, modifiedJson);
    }
}
