package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Power;

public class MainTest {

	@Test
	void testExample1() {

		assertEquals(true, Power.isPowerOfTwo(1));

	}
@Test
	void testExample4() {

        assertEquals(true, Power.isPowerOfTwo(0));

	}
@Test
	void testExample5() {

		assertEquals(true, Power.isPowerOfTwo(100));

	}

}
