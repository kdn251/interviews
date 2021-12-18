import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;




public class JUnitTest {
    private FirstUniqueCharacterInAString firstUniqueCharacterInAString;

    @Before
    public void setUp() throws Exception {
        firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
    }

    @Test
    public void firstTest() {
        String s = "aaaaal";
        int expectResult = 5;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }

    @Test
    public void secondTest() {
        String s = "Laaaaa";
        int expectResult = 0;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }

    @Test
    public void thirdTest() {
        String s = "uuuu9uuu";
        int expectResult = 4;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }

    @Test
    public void fourthTest() {
        String s = "";
        int expectResult = -1;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }
    @Test
    public void fifthTest() {
        String s = "9999 8888";
        int expectResult = 4;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }
    @Test
    public void sixthTest() {
        String s = "----*---";
        int expectResult = 4;

        assertEquals(expectResult, firstUniqueCharacterInAString.firstUniqChar(s));
    }

}