import java.math.BigInteger;
import java.util.Scanner;

public class AddingReversedNumbers {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			BigInteger first = input.nextBigInteger();
			BigInteger second = input.nextBigInteger();
			StringBuilder firstString = new StringBuilder(first + "");
			StringBuilder secondString = new StringBuilder(second + "");
			BigInteger firstReversed = new BigInteger(firstString.reverse()
					.toString());
			BigInteger secondReversed = new BigInteger(secondString.reverse()
					.toString());
			BigInteger result = firstReversed.add(secondReversed);
			String resultReversed = new StringBuilder(result + "").reverse()
					.toString();
			System.out.println(resultReversed.replaceFirst("^0*", ""));
			numberOfTestCases--;
		}
		input.close();
	}
}
