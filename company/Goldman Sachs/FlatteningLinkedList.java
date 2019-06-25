class LinkedList 
{ 
	Node head; // head of list 
	class Node 
	{ 
		int data; 
		Node right, down; 
		Node(int data) 
		{ 
			this.data = data; 
			right = null; 
			down = null; 
		} 
	} 
	Node merge(Node a, Node b) 
	{ 
		if (a == null)	 
        return b; 
		if (b == null)
        return a; 

		Node result; 
		if (a.data < b.data) 
		{ 
			result = a; 
			result.down = merge(a.down, b); 
		} 

		else
		{ 
			result = b; 
			result.down = merge(a, b.down); 
		} 

		return result; 
	} 

	Node flatten(Node root) 
	{ 
		// Base Cases 
		if (root == null || root.right == null) 
			return root; 
		// recur for list on right 
		root.right = flatten(root.right); 
		// now merge 
		root = merge(root, root.right); 
		return root; 
	} 
	Node push(Node head_ref, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.down = head_ref; 
		head_ref = new_node; 
		return head_ref; 
	} 

	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.data + " "); 
			temp = temp.down; 
		} 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
		LinkedList L = new LinkedList(); 
    	L.head = L.push(L.head, 30); 
		L.head = L.push(L.head, 8); 
		L.head = L.push(L.head, 7); 
		L.head = L.push(L.head, 5); 
		L.head.right = L.push(L.head.right, 20); 
		L.head.right = L.push(L.head.right, 10); 
		L.head.right.right = L.push(L.head.right.right, 50); 
		L.head.right.right = L.push(L.head.right.right, 22); 
		L.head.right.right = L.push(L.head.right.right, 19); 
		L.head.right.right.right = L.push(L.head.right.right.right, 45); 
		L.head.right.right.right = L.push(L.head.right.right.right, 40); 
		L.head.right.right.right = L.push(L.head.right.right.right, 35); 
		L.head.right.right.right = L.push(L.head.right.right.right, 20); 
		L.head = L.flatten(L.head); 
		L.printList(); 
	} 
}
