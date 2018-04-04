package helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_2positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
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