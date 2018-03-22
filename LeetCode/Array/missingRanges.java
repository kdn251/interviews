// Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

// For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i <= nums.length; i++) {
            long start = i == 0 ? lower : (long)nums[i - 1] + 1;
            long end = i == nums.length ? upper : (long)nums[i] - 1;
            addMissing(result, start, end);
        }
        
        return result;
    }
    
    void addMissing(ArrayList<String> result, long start, long end) {
        if(start > end) {
            return;
        } else if(start == end) {
            result.add(start + "");
        } else {
            result.add(start + "->" + end);
        }
    }
}
