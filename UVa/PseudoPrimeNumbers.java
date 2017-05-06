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
