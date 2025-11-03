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
public class Solution {
    private final TreeNodeBuilder builder;

    public Solution() {
        this(new TreeNodeBuilder());
    }

    public Solution(TreeNodeBuilder builder) {
        this.builder = builder;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        TreeNode root = helper(nums, 0, nums.length - 1);

        return root;
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            TreeNode current = builder.createNode(nums[mid]);

            TreeNode leftChild = helper(nums, start, mid - 1);
            TreeNode rightChild = helper(nums, mid + 1, end);
            builder.setLeft(current, leftChild);
            builder.setRight(current, rightChild);

            return current;
        }

        return null;
    }

    private static class TreeNodeBuilder {
        public TreeNode createNode(int value) {
            return new TreeNode(value);
        }

        public void setLeft(TreeNode parent, TreeNode left) {
            parent.left = left;
        }

        public void setRight(TreeNode parent, TreeNode right) {
            parent.right = right;
        }
    }
}
