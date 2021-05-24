package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseVowelsOfAStringUnitTest {

	ReverseVowelsOfAString rs = new ReverseVowelsOfAString();
	
	@Test
	public void testTrueReverseWords() {
		String startString = "learn funix";
		String expectResults = "funix learn";
		
		String actualRs = rs.reverseVowels(startString);
		assertEquals(actualRs, rs.reverseVowels(startString));
	}
	
	@Test
	public void testReverseWords() {
		String startString = "learn FU";
		String expectResults = "fu learn";
		
		assertNotEquals(expectResults, rs.reverseVowels(startString));
	}
	
	
	@Test
	public void testReverseWordsCase() {
		String startString = "learn FU";
		String expectResults = "FU hghjkhg";
		
		assertNotEquals(expectResults, rs.reverseVowels(startString));
	}
	
	@Test
	public void testFalseReverseWords() {
		String starString = "learn funix";
		String expectResults = "learn funix";
		
		assertNotEquals(expectResults, rs.reverseVowels(starString));
	}

}
