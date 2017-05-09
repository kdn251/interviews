
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
		input.close();
	}
}
