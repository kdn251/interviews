/**
 * The most relevant definition for this problem is 2a: An integer g > 1 is said to be prime if and only
 * if its only positive divisors are itself and one (otherwise it is said to be composite). For example, the
 * number 21 is composite; the number 23 is prime. Note that the decompositon of a positive number g
 * into its prime factors, i.e.,
 * g = f1 × f2 × · · · × fn
 * is unique if we assert that fi > 1 for all i and fi ≤ fj for i < j.
 * One interesting class of prime numbers are the so-called Mersenne primes which are of the form
 * 2
 * p − 1. Euler proved that 2
 * 31 − 1 is prime in 1772 — all without the aid of a computer.
 * Input
 * The input will consist of a sequence of numbers. Each line of input will contain one number g in the
 * range −2
 * 31 < g < 2
 * 31, but different of -1 and 1. The end of input will be indicated by an input line
 * having a value of zero.
 * Output
 * For each line of input, your program should print a line of output consisting of the input number and
 * its prime factors. For an input number g > 0, g = f1 × f2 × · · · × fn, where each fi
 * is a prime number
 * greater than unity (with fi ≤ fj for i < j), the format of the output line should be
 * g = f1 x f2 x . . . x fn
 * When g < 0, if | g |= f1 × f2 × · · · × fn, the format of the output line should be
 * g = -1 x f1 x f2 x . . . x fn
 * Sample Input
 * -190
 * -191
 * -192
 * -193
 * -194
 * 195
 * 196
 * 197
 * 198
 * 199
 * 200
 * 0
 * Sample Output
 * -190 = -1 x 2 x 5 x 19
 * -191 = -1 x 191
 * -192 = -1 x 2 x 2 x 2 x 2 x 2 x 2 x 3
 * -193 = -1 x 193
 * -194 = -1 x 2 x 97
 * 195 = 3 x 5 x 13
 * 196 = 2 x 2 x 7 x 7
 * 197 = 197
 * 198 = 2 x 3 x 3 x 11
 * 199 = 199
 * 200 = 2 x 2 x 2 x 5 x 5
 */  

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=524

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean[] isPrime = generatePrimeNumbers();
		while (number != 0) {
			boolean isNegative = false;
			if (number < 0) {
				isNegative = true;
				number = Math.abs(number);
			}
			int originalNumber = number;
			formatOutput(originalNumber, sieveOfEratosthenes(isPrime, originalNumber), isNegative);
			number = input.nextInt();
		}
	}

	public static List<Integer> sieveOfEratosthenes(boolean[] isPrime, int number) {
		List<Integer> primeFactors = new ArrayList<Integer>();
		int squareRootOfOriginalNumber = (int) Math.sqrt(number);
		for (int i = 2; i <= squareRootOfOriginalNumber; i++) {
			if (isPrime[i]) {
				while (number % i == 0) {
					primeFactors.add(i);
					number = number / i;
				}
			}
		}
		if (number != 1) {
			primeFactors.add(number);
		}
		return primeFactors;
	}

	static void formatOutput(int number, List<Integer> primeFactors, boolean isNegative) {
		if (isNegative) {
			number *= -1;
		}
		StringBuilder output = new StringBuilder(number + " = ");
		int numberOfPrimeFactors = primeFactors.size();
		if (numberOfPrimeFactors == 1) {
			if (isNegative) {
				output.append("-1 x " + (number * (-1)));
			} else {
				output.append(number);
			}
		} else {
			Collections.sort(primeFactors);
			if (isNegative) {
				output.append("-1 x ");
			}
			for (int i = 0; i < numberOfPrimeFactors - 1; i++) {
				output.append(primeFactors.get(i) + " x ");
			}
			output.append(primeFactors.get(numberOfPrimeFactors - 1));
		}
		System.out.println(output);
	}

	static boolean[] generatePrimeNumbers() {
		int number = (int) Math.sqrt(Integer.MAX_VALUE);
		boolean[] isPrime = new boolean[number + 1];
		for (int i = 2; i < number + 1; i++) {
			isPrime[i] = true;
		}
		for (int factor = 2; factor * factor < number + 1; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; j * factor < number + 1; j++) {
					isPrime[j * factor] = false;
				}
			}
		}
		return isPrime;
	}

}