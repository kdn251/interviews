
/** 
 * A sequence of n > 0 integers is called a jolly jumper if the absolute values of the difference between
 * successive elements take on all the values 1 through n − 1. For instance,
 * 1 4 2 3
 * is a jolly jumper, because the absolutes differences are 3, 2, and 1 respectively. The definition implies
 * that any sequence of a single integer is a jolly jumper. You are to write a program to determine whether
 * or not each of a number of sequences is a jolly jumper.
 * Input
 * Each line of input contains an integer n ≤ 3000 followed by n integers representing the sequence.
 * Output
 * For each line of input, generate a line of output saying ‘Jolly’ or ‘Not jolly’.
 * Sample Input
 * 4 1 4 2 3
 * 5 1 4 2 -1 6
 * Sample Output
 * Jolly
 * Not jolly
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=979

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class JollyJumpers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			Set<Integer> numbersAlreadyAdded = new HashSet<Integer>();
			int numberOfElements = input.nextInt();
			int[] numbers = new int[numberOfElements];
			for (int i = 0; i < numberOfElements; i++) {
				numbers[i] = input.nextInt();
			}
			for (int i = 0; i < numberOfElements - 1; i++) {
				int difference = Math.abs(numbers[i] - numbers[i + 1]);
				if (difference > 0 && difference < numberOfElements) {
					numbersAlreadyAdded.add(difference);
				}
			}
			if (numbersAlreadyAdded.size() == (numberOfElements - 1)) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
		}
	}

}