/* in the classic problem of the Towers of Hanoi, you have 3 towers and N disks of
 * different sizes which can slide onto any tower. The puzzle starts with disks sorted
 * in ascending order of size from top to bottom (i.e. each disk sits on top of an even 
 * larger one). You have the following constraints:
 * (1) Only one disk can be moved at a time
 * (2) A disk is slid off the top of one tower onto the next rod
 * (3) A disk can only be placed on top of a larger disk
 * Write a program to move the disks from the first tower to the last tower using Stacks */

public class TowersOfHanoi {
	public static void main(String args[]) {
		int n = 3;
		Tower[] towers = new Tower[n];
		for(int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}

		for(int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
}

public class Tower {
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		disks = new Stack<Integer>();
		index = i;
	}

	public int index() {
		return index;
	}

	public void add(int d) {
		if(!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		}
		else {
			disks.push(d);
		}
	}

	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
	}

	public void moveDisks(int n, Tower destination, Tower buffer) {
		if(n > 0) {
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}
}
