// Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

// Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

// Note:
    // You are not suppose to use the library's sort function for this problem.

public class SortColors {
    public void sortColors(int[] nums) {
        int wall = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 1) {
                int temp = nums[i];
                nums[i] = nums[wall];
                nums[wall] = temp;
                wall++;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[wall];
                nums[wall] = temp;
                wall++;
            }
        }
    }
}
