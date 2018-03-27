/* implement a MyQueue class which implements a queue using two stacks */

public class MyQueue<T> {
	Stack<T> stackNewest, stackOldest;

	public MyQueue() {
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}

	public int size() {
		return stackNewest.size() + stackOldest.size();
	}

	public void add(T value) {
		/* push onto stackNewest, which always has the newest
		 * elements on top */
		stackNewest.push(value);
	}

	/* Move elements from stackNewest into stackOldest. This
	 * is usually done so that we can do operations on stackOldest */
	private void shiftStacks() {
		if(stackOldest.isEmpty()) {
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}

	public T peek() {
		shiftStacks(); //ensure stackOldest has the current elements
		return stackOldest.peek(); //retrieve the oldest item
	}

	public T remove() {
		shiftStacks(); //ensure stackOldest has the current elements
		return stackOldest.pop();
	}
}