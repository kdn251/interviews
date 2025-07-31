package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseVowelsOfAStringUnitTest {

	ReverseVowelsOfAString rs = new ReverseVowelsOfAString();
	
	//True test case of the inverse function-1
	@Test
	public void testTrueReverseVowels1() {
		String startString = "learn funix";
		
		String actualRs = rs.reverseVowels(startString);
		assertEquals(actualRs, rs.reverseVowels(startString));
	}
	
	//False test case of the inverse function-1
	@Test
	public void testNotEqualsReverseVowels1() {
		String startString = "learn FU";
		String expectResults = "fu learn";
		
		assertNotEquals(expectResults, rs.reverseVowels(startString));
	}
	
	//true test case of the inverse function-2
	@Test
	public void testTrueReverseVowels2() {
		String startString = "lUarn Fe";
		String expectResults = "learn FU";
		
		assertEquals(expectResults, rs.reverseVowels(startString));
	}
	
	//False test case of the inverse function-2
	@Test
	public void testNotEqualsReverseWords2() {
		String starString = "learn funix";
		String expectResults = "learn funix";
		
		assertNotEquals(expectResults, rs.reverseVowels(starString));
	}

}
