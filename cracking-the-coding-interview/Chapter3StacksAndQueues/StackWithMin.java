//How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop, and min should all operate in O(1) time

public class StackWithMin extends Stack<NodeWithMin> {
	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min() {
		if(this.isEmpty()) {
			return Integer.MAX_VALUE; //error value
		}
		else {
			return peek().min;
		}
	}
}

class NodeWithMin {
	public int value;
	public int min;
	public NodeWithMin(int v, int min) {
		this.value = v;
		this.min = min;
	}
}