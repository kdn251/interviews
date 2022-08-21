package src.main.java.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.main.java.DecodeWays;


//A message containing letters from A-Z is being encoded to numbers using the following mapping:

//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26

//Given an encoded message containing digits, determine the total number of ways to decode it.

//For example,
//Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

//The number of ways decoding "12" is 2.

class DecodeWaysTest {
	
	DecodeWays testDW = new DecodeWays();

	/* ways of decoding message match the function's result */
	@Test
	void testMatch() {
		assertEquals(3, testDW.numDecodings("123"));
		//123 = A,B,C | AB,C | A,BC
	}


	/* ways of decoding message don't match the function's result */
	@Test
	void testNoMatch() {
		assertEquals(12, testDW.numDecodings("123"));
		//123 = A,B,C | AB,C | A,BC
	}
}
