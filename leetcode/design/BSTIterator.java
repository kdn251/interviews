/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private static Queue<Integer> queue;

    public BSTIterator(TreeNode root) {
        queue = new LinkedList<Integer>();
        inorderTraversal(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(queue.size()==0);
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }
    
    private static void inorderTraversal(TreeNode node){
        if(node==null) return;
        inorderTraversal(node.left);
        queue.add(node.val);
        inorderTraversal(node.right);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */