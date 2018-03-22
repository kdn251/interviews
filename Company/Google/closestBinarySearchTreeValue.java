// Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

// Note:
	// Given target value is a floating point.
	// You are guaranteed to have only one unique value in the BST that is closest to the target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int value = root.val;
        TreeNode child = root.val < target ? root.right : root.left;

        if(child == null) {
            return value;
        }

        int childValue = closestValue(child, target);
        
        return Math.abs(value - target) < Math.abs(childValue - target) ? value : childValue;
    }
}
