// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

// You are given a target value to search. If found in the array return its index, otherwise return -1.

// You may assume no duplicate exists in the array.

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            
            if(nums[left] <= nums[mid]) {
                if(target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            if(nums[mid] <= nums[right]) {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}

@Test 
public void test1() {
    int [] nums= {1,2,3,4,5,6,7};
    int target = 8;
    Calculator instance = new Calculator();
    int expResult = 0;
    int result = instance.search(nums, target);
      assertEquals(expResult ,result);
}



@Test 
public void test2() {
    int [] nums= {1,2,3,4,5,6,7};
    int target = 0;
    Calculator instance = new Calculator();
    int expResult = 0;
    int result = instance.search(nums, target);
      assertEquals(expResult ,result);
}

@Test 
public void test3() {
    int [] nums= {1,2,3,4,5,6,7};
    int target = 4;
    Calculator instance = new Calculator();
    int expResult = 0;
    int result = instance.search(nums, target);
      assertEquals(expResult ,result);
}
@Test 
public void test3() {
    int [] nums= {1,2,3,4,5,6,7};
    int target = 2;
    Calculator instance = new Calculator();
    int expResult = 0;
    int result = instance.search(nums, target);
      assertEquals(expResult ,result);
}