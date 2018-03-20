/* implement a function to check if a binary tree is balanced. For the purpose of this
 * question, a balanced tree is defined to be a tree such that the heights of the two
 * subtrees of any node never differ by more than one */

public class BinaryTreeIsBalanaced {
	public static int getHeight(TreeNode root) {
		if(root == null) {
			return 0; //base case
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public static boolean isBalanced(TreeNode root) {
		if(root == null) { //base case
			return true;
		}

		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff) > 1) {
			return false;
		}
		else { //recurse
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
}