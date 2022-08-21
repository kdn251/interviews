package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.


import org.junit.jupiter.api.Test;

import src.main.java.FirstUniqueCharacterInAString;

class FirstUniqueCharacterInAStringTest {
	
	FirstUniqueCharacterInAString testFUC = new FirstUniqueCharacterInAString();

	/* the second letter unique */
	@Test
	void testSecond() {
		assertEquals(1, testFUC.firstUniqChar("sos"));
	}
	
	/* the first and second letters are unique */
	@Test
	void testTwoUnique() {
		assertEquals(0, testFUC.firstUniqChar("so"));
	}
	
	/* no letters are unique */
	@Test
	void testNo() {
		assertEquals(-1, testFUC.firstUniqChar("soos"));
	}
	
	/* the first non-unique letter is being cased different from its duplicate*/
	@Test
	void testUpper() {
		assertEquals(1, testFUC.firstUniqChar("saS"));
		//fix code smell in order to have correct result
	}

}
