package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

//Given an input string, reverse the string word by word.

import org.junit.jupiter.api.Test;

import src.main.java.ReverseWordsInAString;

class ReverseWordsInAStringTest {
	
	ReverseWordsInAString test = new ReverseWordsInAString();

	/* test with normal strings */
	@Test
	void testNormal() {
		assertEquals("morning good", test.reverseWords("good morning"));
	}
	
	/* test strings with punctuation */
	@Test
	void testPunctuation() {
		assertEquals("morning! good", test.reverseWords("good morning!"));
	}	

}
