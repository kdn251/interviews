/**
 * The company Assistance for Critical Moments (ACM) is helping other companies to overcome the
 * current economical crisis. As experts in computing machinery, their job is to calculate the cost/benefit
 * balance of the other companies. They receive two numbers, indicating the total amount of benefits and
 * costs, and they have to compute the final balance.
 * You have to solve the complex business problem of computing balances. You are given two positive
 * integer numbers, corresponding to the benefits and the costs. You have to obtain the total balance,
 * i.e., the difference between benefits and costs.
 * Input
 * The first line of the input contains an integer indicating the number of test cases.
 * For each test case, there is a line with two positive integer numbers, A and B, corresponding to the
 * benefits and the costs, respectively. Both numbers are between 0 and a googol (10100) to the power of
 * a hundred.
 * Output
 * For each test case, the output should consist of a line indicating the balance: A − B.
 * Sample Input
 * 4
 * 10 3
 * 4 9
 * 0 8
 * 5 2
 * Sample Output
 * 7
 * -5
 * -8
 * 3
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=2443

import java.math.BigInteger;
import java.util.Scanner;

public class WhoSaidCrisis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			BigInteger first = input.nextBigInteger();
			BigInteger second = input.nextBigInteger();
			System.out.println(first.subtract(second));
			numberOfTestCases--;
		}
	}
}
