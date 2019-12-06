// Given a set of distinct integers, nums, return all possible subsets.

// Note: The solution set must not contain duplicate subsets.

// For example,
// If nums = [1,2,3], a solution is:

// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        recurse(result, nums, new Stack<>(), 0);
        
        return result;
    }
    
    private void recurse(List<List<Integer>> result, int[] nums, Stack path, int position) {
        if(position == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        path.push(nums[position]);

        recurse(result, nums, path, position + 1);
        
        path.pop();
        
        recurse(result, nums, path, position + 1);
    }
}
