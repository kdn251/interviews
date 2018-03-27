/**
 * Fermat’s theorem states that for any
 * prime number p and for any integer a > 1,
 * a
 * p == a (mod p). That is, if we raise a to
 * the pth power and divide by p, the remainder
 * is a. Some (but not very many) nonprime
 * values of p, known as base-a pseudoprimes,
 * have this property for some a.
 * (And some, known as Carmichael Numbers,
 * are base-a pseudoprimes for all a.)
 * Given 2 < p ≤ 1, 000, 000, 000 and 1 <
 * a < p, determine whether or not p is a
 * base-a pseudoprime.
 * Input
 * Input contains several test cases followed by a line containing ‘0 0’. Each test case consists of a line
 * containing p and a.
 * Output
 * For each test case, output ‘yes’ if p is a base-a pseudoprime; otherwise output ‘no’.
 * Sample Input
 * 3 2
 * 10 3
 * 341 2
 * 341 3
 * 1105 2
 * 1105 3
 * 0 0
 * Sample Output
 * no
 * no
 * yes
 * no
 * yes
 * yes
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2262
 
import java.math.BigInteger;
import java.util.Scanner;

public class PseudoPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int p = input.nextInt();
			int a = input.nextInt();
			if (a == 0 && p == 0) {
				break;
			}
			BigInteger pAsBigInteger = new BigInteger(p + "");
			BigInteger aAsBigInteger = new BigInteger(a + "");
			String answer = "";
			if (!pAsBigInteger.isProbablePrime(10)) {
				BigInteger result = aAsBigInteger.modPow(pAsBigInteger,
						pAsBigInteger);
				if (result.equals(aAsBigInteger)) {
					answer = "yes";
				} else {
					answer = "no";
				}
			} else {
				answer = "no";
			}
			System.out.println(answer);
		}
	}
}
