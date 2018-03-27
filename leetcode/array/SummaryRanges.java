// Given a sorted integer array without duplicates, return the summary of its ranges.

// For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        
        if(nums.length == 1) {
            result.add(nums[0] + "");
            return result;
        }
        
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            
            while(i + 1 < nums.length && (nums[i + 1] - nums[i] == 1)) {
                i++;
            }
            
            if(current != nums[i]) {
                result.add(current + "->" + nums[i]);
            } else {
                result.add(current + "");
            }
        }
        
        return result;
    }
}
