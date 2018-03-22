    // Given a collection of integers that might contain duplicates, nums, return all possible subsets.

// Note: The solution set must not contain duplicate subsets.

// For example,
// If nums = [1,2,2], a solution is:

// [
//   [2],
//   [1],
//   [1,2,2],
//   [2,2],
//   [1,2],
//   []
// ]

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums.length == 0 || nums == null) {
            return result;
        }
        
        helper(nums, new ArrayList<Integer>(), 0, result);
        
        return result;
    }
    
    
    public void helper(int[] nums, ArrayList<Integer> current, int index, List<List<Integer>> result) {
        result.add(current);
        
        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            
            ArrayList<Integer> newCurrent = new ArrayList<Integer>(current);
            newCurrent.add(nums[i]);
            helper(nums, newCurrent, i + 1, result);
        }
    }
}
