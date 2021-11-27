package test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.DecodeWays;

public class TestDecodeFacebook {
	@Test
	public void  test1() {
		
		assertEquals(1, DecodeWays.numDecodings("34"));

	}
    @Test
	public void Example4TestDecode() {
		
		assertEquals(2, DecodeWays.numDecodings("12"));

	}
    @Test
	public void Example5TestDecode() {
		
		assertEquals(1, DecodeWays.numDecodings("53"));

	}
}
