
/**
 * In this problem you will be given two decimal integer number N, M. You will have to find the last
 * non-zero digit of the P
 * N
 * M . This means no of permutations of N things taking M at a time.
 * Input
 * The input file contains several lines of input. Each line of the input file contains two integers N
 * (0 ≤ N ≤ 20000000), M (0 ≤ M ≤ N). Input is terminated by end-of-file.
 * Output
 * For each line of the input file you should output a single digit, which is the last non-zero digit of P
 * N
 * M .
 * For example, if P
 * N
 * M is 720 then the last non-zero digit is 2. So in this case your output should be 2.
 * Sample Input
 * 10 10
 * 10 5
 * 25 6
 * Sample Output
 * 8
 * 4
 * 2
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1153

import java.util.Scanner;

public class TheLastNonZeroDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			long n = input.nextInt();
			long m = input.nextInt();
			long product = 1;
			for (long i = (n - m + 1); i < n + 1; i++) {
				product = product * i;
				while (product % 10 == 0) {
					product = product / 10;
				}
				product = product % (long) (Math.pow(10, 11));
			}
			String number = product + "";
			for (int i = number.length() - 1; i > -1; i--) {
				char c = number.charAt(i);
				if (c != '0') {
					System.out.println(c);
					break;
				}
			}
		}
	}

}