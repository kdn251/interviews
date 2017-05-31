/**
 * In 1742, Christian Goldbach, a German amateur mathematician, sent a letter to Leonhard Euler in
 * which he made the following conjecture:
 * Every number greater than 2 can be written as the sum of three prime numbers.
 * Goldbach was considering 1 as a primer number, a convention that is no longer followed. Later on,
 * Euler re-expressed the conjecture as:
 * Every even number greater than or equal to 4 can be expressed as the sum of two prime
 * numbers.
 * For example:
 * • 8 = 3 + 5. Both 3 and 5 are odd prime numbers.
 * • 20 = 3 + 17 = 7 + 13.
 * • 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23.
 * Today it is still unproven whether the conjecture is right. (Oh wait, I have the proof of course, but
 * it is too long to write it on the margin of this page.)
 * Anyway, your task is now to verify Goldbach’s conjecture as expressed by Euler for all even numbers
 * less than a million.
 * Input
 * The input file will contain one or more test cases.
 * Each test case consists of one even integer n with 6 ≤ n < 1000000.
 * Input will be terminated by a value of 0 for n.
 * Output
 * For each test case, print one line of the form n = a + b, where a and b are odd primes. Numbers and
 * operators should be separated by exactly one blank like in the sample output below. If there is more
 * than one pair of odd primes adding up to n, choose the pair where the difference b − a is maximized.
 * If there is no such pair, print a line saying ‘Goldbach's conjecture is wrong.’
 * Sample Input
 * 8
 * 20
 * 42
 * 0
 * Sample Output
 * 8 = 3 + 5
 * 20 = 3 + 17
 * 42 = 5 + 37
 */
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=484

import java.util.Scanner;

public class GoldbachConjecture {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] isPrime = sieveOfEratosthenes(1000000);
		int number = input.nextInt();
		while (number != 0) {
			boolean found = false;
			for (int i = 3; i < number && !found; i++) {
				if (isPrime[i]) {
					int currentPrime = i;
					int j = number - currentPrime;
					if (isPrime[j]) {
						System.out.println(number + " = " + currentPrime
								+ " + " + j);
						found = true;
					}
				}
			}
			if (!found) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			number = input.nextInt();
		}
	}

	private static boolean[] sieveOfEratosthenes(int number) {
		boolean[] isPrime = new boolean[number + 1];
		for (int i = 2; i < number + 1; i++) {
			isPrime[i] = true;
		}

		for (int factor = 2; factor * factor <= number; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= number; j++) {
					isPrime[factor * j] = false;
				}
			}
		}
		return isPrime;
	}
}
