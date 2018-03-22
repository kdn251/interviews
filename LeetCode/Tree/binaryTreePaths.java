// Given a binary tree, return all root-to-leaf paths.

// For example, given the following binary tree:

//    1
//  /   \
// 2     3
//  \
//   5
// All root-to-leaf paths are:

// ["1->2->5", "1->3"]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();

        if(root == null) {
            return result;
        }
        
        helper(new String(), root, result);
        
        return result;
    }
    
    public void helper(String current, TreeNode root, List<String> result) {
        if(root.left == null && root.right == null) {
            result.add(current + root.val);
        }

        if(root.left != null) {
            helper(current + root.val + "->", root.left, result);
        }

        if(root.right != null) {
            helper(current + root.val + "->", root.right, result);
        }
    }
}
