package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicateUnitTest {
	
	ContainsDuplicate cd = new ContainsDuplicate();
	
	@Test
	public void testNextDuplicate() {
		int[] nums = {2,2,4,4};
		
		assertTrue(cd.containsDuplicate(nums));
	}
	
	@Test
	public void testDuplicate() {
		int[] nums = {2,4,2,5,8,9};
		
		assertTrue(cd.containsDuplicate(nums));
	}
	
	@Test
	public void testNotDuplicate() {
		int[] nums = {3,4,7,8,9};
		
		assertFalse(cd.containsDuplicate(nums));
	}

}