package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

//Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. 
// (each operation - add, delete, replace is counted as 1 step.)

import org.junit.jupiter.api.Test;

import src.main.java.EditDistance;

class EditDistanceTest {
	
	EditDistance test = new EditDistance();

	/* only requires add 1 letter */
	@Test
	void testOneChar() {
		assertEquals(1, test.minDistance("a", "ab"));
	}
	
	/* requires add 2 letters */
	@Test
	void testTwoChar() {
		assertEquals(2, test.minDistance("a", "abc"));
		//each character is counted as 1 operation.
	}
	
	/* requires add 2 letters and delete 1 letter */
	@Test
	void testAddReplace() {
		assertEquals(2, test.minDistance("a", "bc"));
		//b is not a, so a is replaced by b, therefore, there are only 2 steps: replace and add.
	}
	
	/* requires add 2 letters and delete 2 letters */
	@Test
	void testAddDelete() {
		assertEquals(2, test.minDistance("de", "bc"));
		//can also be understood as replace 2 characters
	}

}