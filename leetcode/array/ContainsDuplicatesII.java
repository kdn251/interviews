//Given an array of integers and an integer k, find out whether there are two distinct indices i and 
//j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

import java.util.Map;
import java.util.HashMap;

class ContainsDuplicatesII {
    /**
     * Check if there are duplicates within a given distance k.
     *
     * @param nums the array of integers
     * @param k    the maximum distance
     * @return true if duplicates exist within distance k, false otherwise
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Return false if nums is null or has fewer than 2 elements
        if (nums == null || nums.length < 2 || k < 0) {
            return false;
        }

        // Use a Map to store the most recent index of each value
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];

            // Check if the current value has been seen before and within the allowed distance
            if (indexMap.containsKey(currentValue) && (i - indexMap.get(currentValue) <= k)) {
                return true;  // Found a nearby duplicate
            }

            // Update the index of the current value
            indexMap.put(currentValue, i);
        }

        return false;  // No nearby duplicates found
    }
}
