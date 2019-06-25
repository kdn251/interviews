
class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 


	int detectAndRemoveLoop(Node node) { 
		Node slow = node, fast = node; 
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 
			if (slow == fast) { 
				removeLoop(slow, node); 
				return 1; 
			} 
		} 
		return 0; 
	} 

	void removeLoop(Node loop, Node curr) { 
		Node ptr1 = null, ptr2 = null; 
		ptr1 = curr; 
		while (1 == 1) { 
			ptr2 = loop; 
			while (ptr2.next != loop && ptr2.next != ptr1) { 
				ptr2 = ptr2.next; 
			} 
			if (ptr2.next == ptr1) { 
				break; 
			} 
			ptr1 = ptr1.next; 
		} 
		ptr2.next = null; 
	} 

	void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		LinkedList list = new LinkedList(); 
		list.head = new Node(50); 
		list.head.next = new Node(20); 
		list.head.next.next = new Node(10); 
		list.head.next.next.next = new Node(30); 
		list.head.next.next.next.next = new Node(70); 


		head.next.next.next.next.next = head.next.next; 
		list.detectAndRemoveLoop(head); 
		System.out.println("Linked List after removing loop : "); 
		list.printList(head); 
	} 
} 
