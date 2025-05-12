import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneEditDistanceTest {
    OneEditDistance oneEditDistance = new OneEditDistance();


    @Test
    public void testIsOneEditDistance_whenInsertOneCharacterInFirstString() {
        String str1 = "ABCD";
        String str2 = "ABBD";

        assertTrue(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenDeleteOneCharactersInFirstString() {
        String str1 = "ABCD";
        String str2 = "ABD";

        assertTrue(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenAddOneCharactersInFirstString() {
        String str1 = "ABDE";
        String str2 = "ABCDE";

        assertTrue(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenTwoStringAreEquals() {
        String str1 = "ABCD";
        String str2 = "ABCD";

        assertFalse(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenInsertTwoCharactersInFirstString() {
        String str1 = "ABCD";
        String str2 = "ABEF";

        assertFalse(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenDeleteTwoCharactersInFirstString() {
        String str1 = "ABCD";
        String str2 = "AB";

        assertFalse(oneEditDistance.isOneEditDistance(str1, str2));
    }

    @Test
    public void testIsOneEditDistance_whenAddTwoCharactersInFirstString() {
        String str1 = "ABCD";
        String str2 = "ABCDEF";

        assertFalse(oneEditDistance.isOneEditDistance(str1, str2));
    }


}
