package test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.DecodeWays;

public class TestDecodeFacebook {
	@Test
	public void  testEx1() {
		
		assertEquals(1, DecodeWays.numDecodings("34"));

	}
    @Test
	public void testEx2() {
		
		assertEquals(2, DecodeWays.numDecodings("12"));

	}
    @Test
	public void testEx5() {
		
		assertEquals(1, DecodeWays.numDecodings("53"));

	}
}
