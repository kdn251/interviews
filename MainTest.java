package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Power;

public class MainTest {

	@Test
	void Example1TestPower() {

		assertEquals(true, Power.isPowerOfTwo(1));

	}

	void Example4TestPower() {

        assertEquals(true, Power.isPowerOfTwo(0));

	}

	void Example5TestPower() {

		assertEquals(true, Power.isPowerOfTwo(100));

	}

}
