
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class YelpUnitTest {
	private ReverseWordsInAString reverseString;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		reverseString = new ReverseWordsInAString();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void trueTest() {
		String s = "Today is Monday";
		String expectResult = "Monday is Today";
		
		assertEquals(expectResult, reverseString.reverseWords(s));
	}
	
	@Test
	public void trueTest2() {
		String s = "One plus One equals Two";
		String expectResult = "Two equals One plus One";
		
		assertEquals(expectResult, reverseString.reverseWords(s));
	}
	
	@Test
	public void trueTest3() {
		String s = "Saturday Night Live";
		String expectResult = "Live Night Saturday";
		
		assertEquals(expectResult, reverseString.reverseWords(s));
	}
	
	@Test
	public void emptyTest() {
		String s = "";
		String expectResult = "";
		
		assertEquals(expectResult, reverseString.reverseWords(s));
	}
	
	
}
