import static org.junit.Assert.assertEquals;
import org.junit.Test;


//Given an array of integers, find if the array contains any duplicates. Your function should return 
//true if any value appears at least twice in the array, and it should return false if every element is distinct.

public class ContainsDuplicateTest {

    @Test
    void Example1() {
        int[] arr = {1,1,3,4}; 
        assertTrue(containsDuplicate(arr));
    }
    @Test
    void Example2() {
        int[] arr = {1,3,4}; 
        assertFalse(containsDuplicate(arr));
    }
    @Test
    void Example3() {
        int[] arr = {1,1,2,2}; 
        assertFalse(containsDuplicate(arr));
    }

}
