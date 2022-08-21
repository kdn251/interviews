package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

//Given a roman numeral, convert it to an integer.

//Input is guaranteed to be within the range from 1 to 3999


import org.junit.jupiter.api.Test;

import src.main.java.RomanToInteger;

class RomanToIntegerTest {

	/* test uppercase roman numerals */
	@Test
	void testUppercase() {
		RomanToInteger testRTI = new RomanToInteger();
		assertEquals(34, testRTI.romanToInt("XXXIV"));
	}
	
	/* test lowercase roman numerals */
	@Test
	void testLowercase() {
		RomanToInteger testRTI = new RomanToInteger();
		assertEquals(34, testRTI.romanToInt("xxxiv"));
		
		//code smell: always convert the roman numerals into uppercase letters.
    	//to avoid unexpected errors as roman numerals are accepted input as lowercased too
	}

}
