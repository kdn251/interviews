package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ReverseWord;


public class TestReverseWord {
	@Test
	public void Example1TestReverse() {
		
			System.out.println(ReverseWord.reverseWords("Hello I am Nhi"));
			assertEquals("Nhi am I Hello", ReverseWord.reverseWords("Hello I am Nhi"));
			
		
	}
@Test
	public void Example3TestReverse() {
		System.out.println(ReverseWord.reverseWords("Sorry"));
        assertEquals("Sorry", ReverseWord.reverseWords("Sorry"));

	}
@Test
	public void Example4TestReverse() {
		System.out.println(ReverseWord.reverseWords("Thank You"));
		assertEquals("You Thank", ReverseWord.reverseWords("Thank You"));

	}
}
