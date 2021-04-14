package Test;

import Ziraelle.Scram;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScramTest {

    @Test
    public void scramming() {
        String inputText = "Ziraelle";
        long inputKey = 256;
        String expectText = "ŚũŲšťŬŬť";

        Scram scram = new Scram();
        String actual = scram.scramming(inputText, inputKey);
        assertEquals("Test1. The output did not match what was expected", expectText,actual);
    }
}