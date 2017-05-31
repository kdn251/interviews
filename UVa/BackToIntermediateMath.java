/**
 * Umm! So, you claim yourself as an intelligent one? Let me check. As, computer science students always
 * insist on optimization whenever possible, I give you an elementary problem of math to optimize.
 * You are trying to cross a river of width d meters. You are given that, the river flows at v ms−1 and
 * you know that you can speed up the boat in u ms−1
 * . There may be two goals how to cross the river:
 * One goal (called fastest path) is to cross it in fastest time, and it does not matter how far the flow of
 * the river takes the boat. The other goal (called shortest path) is to steer the boat in a direction so that
 * the flow of the river doesn’t take the boat away, and the boat passes the river in a line perpendicular to
 * the boarder of the river. Is it always possible to have two different paths, one to pass at shortest time
 * and the other at shortest path? If possible then, what is the difference (Let P s) between the times
 * needed to cross the river in the different ways?
 * Input
 * The first line in the input file is an integer representing the number of test cases. Each of the test cases
 * follows below. Each case consists three real numbers (all are nonnegative, d is positive) denoting the
 * value of d, v and u respectively.
 * Output
 * For each test case, first print the serial number of the case, a colon, an space and then print ‘can’t
 * determine’ (without the quotes) if it is not possible to find different paths as stated above, else print
 * the value of P corrected to three digits after decimal point. Check the sample input & output.
 * Sample Input
 * 3
 * 8 5 6
 * 1 2 3
 * 1 5 6
 * Sample Output
 * Case 1: 1.079
 * Case 2: 0.114
 * Case 3: 0.135
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=1714

import java.text.DecimalFormat;
import java.util.Scanner;

public class BackToIntermediateMath {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		DecimalFormat formatter = new DecimalFormat("#0.000");
		for (int i = 0; i < numberOfTestCases; i++) {
			double distance = input.nextDouble();
			double riverSpeed = input.nextDouble();
			double boatSpeed = input.nextDouble();
			if (riverSpeed == 0 || boatSpeed == 0 || boatSpeed <= riverSpeed) {
				System.out.println("Case " + (i + 1) + ": can't determine");
			} else {
				double P1 = distance / boatSpeed;
				double P2 = distance
						/ Math.sqrt(boatSpeed * boatSpeed - riverSpeed
								* riverSpeed);
				System.out.print("Case " + (i + 1) + ": "
						+ formatter.format(Math.abs(P1 - P2)) + "\n");
			}
		}
	}
}
