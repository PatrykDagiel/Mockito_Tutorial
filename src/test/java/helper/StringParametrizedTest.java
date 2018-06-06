package helper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class StringParametrizedTest {

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringParametrizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String[][] expectedOutputs = {{"AACD", "CD"}, {"ACD", "CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions_2positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testTruncateAInFirst2Positions_1position() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("AB"));
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
}