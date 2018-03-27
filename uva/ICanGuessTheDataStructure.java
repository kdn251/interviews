// There is a bag-like data structure, supporting two operations:
// 	1 x Throw an element x into the bag.
// 	2 Take out an element from the bag.
// Given a sequence of operations with return values, you’re going to guess the data structure. It is
// a stack (Last-In, First-Out), a queue (First-In, First-Out), a priority-queue (Always take out larger
// elements first) or something else that you can hardly imagine!

// Input:
// 	There are several test cases. Each test case begins with a line containing a single integer n (1 ≤ n ≤
// 	1000). Each of the next n lines is either a type-1 command, or an integer 2 followed by an integer x.
// 	That means after executing a type-2 command, we get an element x without error. The value of x
// 	is always a positive integer not larger than 100. The input is terminated by end-of-file (EOF).

// Output:
// 	For each test case, output one of the following:
	// 	stack It’s definitely a stack.
	// 	queue It’s definitely a queue.
	// 	priority queue It’s definitely a priority queue.
	// 	impossible It can’t be a stack, a queue or a priority queue.
	// 	not sure It can be more than one of the three data structures mentioned
	// 	above.

// Sample Input
// 6
// 1 1
// 1 2
// 1 3
// 2 1
// 2 2
// 2 3
// 6
// 1 1
// 1 2
// 1 3
// 2 3
// 2 2
// 2 1
// 2
// 1 1
// 2 2
// 4
// 1 2
// 1 1
// 2 1
// 2 2
// 7
// 1 2
// 1 5
// 1 1
// 1 3
// 2 5
// 1 4
// 2 4

// Sample Output
// queue
// not sure
// impossible
// stack
// priority queue

/**
 * Created by kdn251 on 2/10/17.
 */

import java.util.*;
import java.io.*;

public class ICanGuessTheDataStructure {

    public static void main(String args[]) throws Exception {

        //initialize data structures
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        //initialize max priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        //initialize buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        //iterate through all test cases
        while ((line = br.readLine()) != null) {

            //initialize removals for each data structure
            int stackRemovals = 0;
            int queueRemovals = 0;
            int priorityQueueRemovals = 0;
            int totalRemovals = 0;

            //get number of test cases
            int numberOfCases = Integer.parseInt(line);

            //clear contents of data structures
            queue.clear();
            priorityQueue.clear();
            stack.clear();

            //iterate over all test cases
            for (int i = 0; i < numberOfCases; i++) {

                String[] currentLineSplit = br.readLine().split(" ");
                int command = Integer.parseInt(currentLineSplit[0]);
                int number = Integer.parseInt(currentLineSplit[1]);

                //if command is 1, push number into all data structures
                if (command == 1) {

                    stack.push(number);
                    queue.add(number);
                    priorityQueue.add(number);

                } else {

                    //check which data structure to remove from and increment its removal count
                    if (!stack.isEmpty() && stack.peek() == number && stackRemovals == totalRemovals) {

                        stackRemovals++;
                        stack.pop();

                    }

                    if (!queue.isEmpty() && queue.peek() == number && queueRemovals == totalRemovals) {

                        queueRemovals++;
                        queue.remove();

                    }

                    if (!priorityQueue.isEmpty() && priorityQueue.peek() == number && priorityQueueRemovals == totalRemovals) {

                        priorityQueueRemovals++;
                        priorityQueue.remove();

                    }

                    totalRemovals++;


                }

            }

            //check all removal counts for each data structure vs. total removal count and print the appropriate data structure
            if ((stackRemovals == totalRemovals && queueRemovals == totalRemovals) || (stackRemovals == totalRemovals && stackRemovals == priorityQueueRemovals) || (queueRemovals == totalRemovals && priorityQueueRemovals == totalRemovals)) {

                System.out.println("not sure");

            } else if (stackRemovals == totalRemovals) {

                System.out.println("stack");

            } else if (queueRemovals == totalRemovals) {

                System.out.println("queue");

            } else if (priorityQueueRemovals == totalRemovals) {

                System.out.println("priority queue");

            } else {

                System.out.println("impossible");

            }

        }


    }

}
