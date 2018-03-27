/* given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists) */

public class CreateLinkedListForEachLevel {
	ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		/* "visit" the root */
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if(root != null) {
			current.add(root);
		}

		while(current.size() > 0) {
			result.add(current); //add previous level
			LinkedList<TreeNode> parents = current; //go to next level
			current = new LinkedList<TreeNode>();
			for(TreeNode parent : parents) {
				/* visit the children */
				if(parent.left != null) {
					current.add(parrent.left);
				}
				if(parent.right != null) {
					current.add(parent.right);
				}
			}
		}
		return result;
	}
}