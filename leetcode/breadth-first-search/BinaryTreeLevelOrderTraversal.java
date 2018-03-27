// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinarySearchTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        List<Integer> tempList = new ArrayList<Integer>();
        tempList.add(root.val);
        result.add(tempList);
        
        while(!queue.isEmpty()) {
            Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
            
            List<Integer> list = new ArrayList<Integer>();
            
            while(!queue.isEmpty()) {
                TreeNode current = queue.remove();
                
                if(current.left != null) {
                    currentLevel.add(current.left);
                    list.add(current.left.val);
                }
                
                if(current.right != null) {
                    currentLevel.add(current.right);
                    list.add(current.right.val);
                }
            }
            
            if(list.size() > 0) {
                result.add(list);
            }

            queue = currentLevel;
        }
        
        return result;
    }
}
