// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        
        TreeNode root = helper(nums, 0, nums.length - 1);
        
        return root;
    }
    
    private TreeNode helper(int[] nums, int start, int end) {
        if(start <= end) {
            int mid = (start + end) / 2;
            
            TreeNode current = new TreeNode(nums[mid]);
            
            current.left = helper(nums, start, mid - 1);
            current.right = helper(nums, mid + 1, end);
            
            return current;
        }
        
        return null;
    }
}
