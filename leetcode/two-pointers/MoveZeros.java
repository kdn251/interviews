// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

// Note:
    // You must do this in-place without making a copy of the array.
    // Minimize the total number of operations.

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        
        int index = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[index] = num;
                index++;
            }
        }
        
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
