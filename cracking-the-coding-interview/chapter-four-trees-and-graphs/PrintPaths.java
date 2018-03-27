/* you are given a binary tree in which each ndoe contains an integer value (which might be positive
 * or negative). Design an algorithm to print all paths which sum to a given value. The path does not need
 * to start or end at the root or a leaf, but it must go in a straight line */

public class PrintPaths {
	void findSum(TreeNode node, int sum, int[] path, int level) {
		if(node == null) {
			return;
		}

		/* insert current node into path */
		path[level] = node.data;

		/* look for paths with a sum that ends at this node */
		int t = 0;
		for(int i = level; i >= 0; i--) {
			t += path[i];
			if(t == sum) {
				print(path, i, level);
			}
		}

		/* search nodes beneath this one */
		findSum(node.left, sum, path, level + 1);
		findSum(node.right, sum, path, level + 1);

		/* remove current node from path. Not strictly necessary, since
		 * we would ignore this value, but it's good practice */
		path[level] = Integer.MIN_VALUE;
	}

	void findSum(TreeNode node, int sum) {
		int depth = depth(node);
		int[] path = new int[depth];
		findSum(node, sum, path, 0);
	}

	void print(int[] path, int start, int end) {
		for(int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

	int depth(TreeNode node) {
		if(node == null) {
			return 0;
		}
		else {
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}
}