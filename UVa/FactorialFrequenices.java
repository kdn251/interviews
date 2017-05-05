/**
 * In an attempt to bolster her sagging palm-reading business, Madam Phoenix has decided to offer
 * several numerological treats to her customers. She has been able to convince them that the frequency
 * of occurrence of the digits in the decimal representation of factorials bear witness to their futures.
 * Unlike palm-reading, however, she can’t just conjure up these frequencies, so she has employed you to
 * determine these values.
 * (Recall that the definition of n! (that is, n factorial) is just 1 × 2 × 3 × · · · × n. As she expects to use
 * either the day of the week, the day of the month, or the day of the year as the value of n, you must be
 * able to determine the number of occurrences of each decimal digit in numbers as large as 366 factorial
 * (366!), which has 781 digits.
 * Madam Phoenix will be forever (or longer) in your debt; she might even give you a trip if you do
 * your job well!
 * Input
 * The input data for the program is simply a list of integers for which the digit counts are desired. All
 * of these input values will be less than or equal to 366 and greater than 0, except for the last integer,
 * which will be zero. Don’t bother to process this zero value; just stop your program at that point.
 * Output
 * The output format isn’t too critical, but you should make your program produce results that look
 * similar to those shown below.
 * Sample Input
 * 3
 * 8
 * 100
 * 0
 * Sample Output
 * 3! --
 * (0) 0 (1) 0 (2) 0 (3) 0 (4) 0
 * (5) 0 (6) 1 (7) 0 (8) 0 (9) 0
 * 8! --
 * (0) 2 (1) 0 (2) 1 (3) 1 (4) 1
 * (5) 0 (6) 0 (7) 0 (8) 0 (9) 0
 * 100! --
 * (0) 30 (1) 15 (2) 19 (3) 10 (4) 10
 * (5) 14 (6) 19 (7) 7 (8) 14 (9) 20
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=260

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialFrequenices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while (number != 0) {
			BigInteger product = BigInteger.ONE;
			for (int i = 2; i < number + 1; i++) {
				product = product.multiply(BigInteger.valueOf(i));
			}
			int[] digitCounter = new int[10];
			BigInteger productValue = product;
			while (!productValue.equals(BigInteger.ZERO)) {

				digitCounter[Integer.valueOf(productValue.mod(BigInteger.TEN)
						.toString())]++;
				productValue = productValue.divide(BigInteger.TEN);
			}
			formatOutput(number, digitCounter);
			number = input.nextInt();
		}
	}

	private static void formatOutput(int number, int[] digits) {
		System.out.println(number + "! --");
		for (int i = 0; i < 10; i++) {
			if (i != 0 || i != 9 || i != 4)
				System.out.printf("   ");
			System.out.printf("(%d)%5d", i, digits[i]);
			if (i == 4 || i == 9)
				System.out.printf("\n");
		}
	}

}
