/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class MinStack {
    class Node {
        int data;
        int min;
        Node next;
        
        public Node(int data, int min) {
            this.data = data;
            this.min = min;
            this.next = null;
        }
    }
    Node head;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(head == null) {
            head = new Node(x, x);
        } else {
            Node newNode = new Node(x, Math.min(x, head.min));
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}
