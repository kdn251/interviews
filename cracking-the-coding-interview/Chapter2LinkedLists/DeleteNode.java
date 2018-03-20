//Implement an algorithm to delete a node in the middle of a singly linked list, give only access to that node

public class DeleteNode {
	public static boolean deleteNode(LinkedListNode n) {
		if(n == null || n.next == null) {
			return false;
		}

		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
}