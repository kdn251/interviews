/**
 * Most of the times, the students of Computer Science & Engineering of BUET deal with bogus, tough and
 * very complex formulae. That is why, sometimes, even for a easy problem they think very hard and make
 * the problem much complex to solve. But, the team members of the team “BUET PESSIMISTIC”
 * are the only exceptions. Just like the opposite manner, they treat every hard problem as easy and so
 * cannot do well in any contest. Today, they try to solve a series but fail for treating it as hard. Let
 * them help.
 * Input
 * Just try to determine the answer for the following series
 * ∑ 
 * N
 * i=1
 * iAi
 * You are given the value of integers N and A (1 ≤ N ≤ 150, 0 ≤ A ≤ 15).
 * Output
 * For each line of the input, your correct program should output the integer value of the sum in separate
 * lines for each pair of values of N and A.
 * Sample Input
 * 3 3
 * 4 4
 * Sample Output
 * 102
 * 1252
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=1464


import java.math.BigInteger;
import java.util.Scanner;

public class VeryEasy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			BigInteger sum = BigInteger.ZERO;
			int N = input.nextInt();
			int A = input.nextInt();
			BigInteger aAsBigInteger = BigInteger.valueOf(A);
			BigInteger product = BigInteger.ONE;
			for (int i = 1; i < N + 1; i++) {
				product = BigInteger.valueOf(i).multiply(aAsBigInteger.pow(i));
				sum = sum.add(product);
			}
			System.out.println(sum);
		}
	}
}
