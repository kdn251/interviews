/**
 * An archeologist seeking proof of the presence of extraterrestrials in the Earth’s past, stumbles upon a
 * partially destroyed wall containing strange chains of numbers. The left-hand part of these lines of digits
 * is always intact, but unfortunately the right-hand one is often lost by erosion of the stone. However,
 * she notices that all the numbers with all its digits intact are powers of 2, so that the hypothesis that
 * all of them are powers of 2 is obvious. To reinforce her belief, she selects a list of numbers on which it
 * is apparent that the number of legible digits is strictly smaller than the number of lost ones, and asks
 * you to find the smallest power of 2 (if any) whose first digits coincide with those of the list.
 * Thus you must write a program such that given an integer, it determines (if it exists) the smallest
 * exponent E such that the first digits of 2
 * E coincide with the integer (remember that more than half of
 * the digits are missing).
 * Input
 * It is a set of lines with a positive integer N not bigger than 2147483648 in each of them.
 * Output
 * For every one of these integers a line containing the smallest positive integer E such that the first digits
 * of 2
 * E are precisely the digits of N, or, if there is no one, the sentence ‘no power of 2’.
 * Sample Input
 * 1
 * 2
 * 10
 * Sample Output
 * 7
 * 8
 * 20
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=642

import java.io.IOException;
import java.util.Scanner;

public class ArchaeologistsDilemma {

	public static final boolean DEBUG = true;
	public static final boolean DEBUG_INPUT = true;

	final static double LOG2 = Math.log(2.0);
	final static double LOG2_10 = Math.log(10) / LOG2;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			long N = input.nextLong();
			int k = (N + "").length() + 1;

			long lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
			long upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);

			while (lowerBound == upperBound) {
				k++;
				lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
				upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);
			}

			System.out.println(upperBound);
		}
	}
}
