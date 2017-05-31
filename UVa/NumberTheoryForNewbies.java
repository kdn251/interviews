/**
 * Given any positive integer, if we permute its digits, the difference between the number we get and the
 * given number will always be divisible by 9.
 * For example, if the given number is 123, we may rearrange the digits to get 321. The difference =
 * 321 - 123 = 198, which is a multiple of 9 (198 = 9 × 22).
 * We can prove this fact fairly easily, but since we are not having a maths contest, we instead try to
 * illustrate this fact with the help of a computer program.
 * Input
 * Each line of input gives a positive integer n (≤ 2000000000). You are to find two integers a and b
 * formed by rearranging the digits of n, such that a − b is maximum. a and b should NOT have leading
 * zeros.
 * Output
 * You should then show that a − b is a multiple of 9, by expressing it as ‘9 * k’, where k is an integer.
 * See the sample output for the correct output format.
 * Sample Input
 * 123
 * 2468
 * Sample Output
 * 321 - 123 = 198 = 9 * 22
 * 8642 - 2468 = 6174 = 9 * 686
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=2366

import java.util.Arrays;
import java.util.Scanner;

public class NumberTheoryForNewbies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLong()) {
			String inputValue = input.nextLine();
			StringBuilder minimal = new StringBuilder();
			StringBuilder maximal = new StringBuilder();
			char[] characters = inputValue.toCharArray();
			int length = characters.length;
			Arrays.sort(characters);
			int index;
			for (index = 0; index < length; index++) {
				if (characters[index] != '0') {
					break;
				}
			}
			if (index != 0) {
				characters[0] = characters[index];
				characters[index] = '0';
			}
			for (int i = 0; i < length; i++) {
				minimal.append(characters[i]);
			}
			Arrays.sort(characters);
			for (int i = length - 1; i > -1; i--) {
				maximal.append(characters[i]);
			}
			long maximalNumber = Long.valueOf(maximal.toString());
			long minimalNumber = Long.valueOf(minimal.toString());
			long difference = maximalNumber - minimalNumber;
			System.out.println(maximal + " - " + minimal + " = " + difference
					+ " = 9 * " + (difference / 9));
		}
	}
}
