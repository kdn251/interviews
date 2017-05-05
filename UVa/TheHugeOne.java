
import java.math.BigInteger;
import java.util.Scanner;

public class TheHugeOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			BigInteger M = input.nextBigInteger();
			input.nextLine();
			String[] elementsLine = input.nextLine().split(" ");
			boolean found = false;
			for (int i = 1; i < elementsLine.length; i++) {
				BigInteger number = new BigInteger(elementsLine[i]);
				if (!M.mod(number).equals(BigInteger.ZERO)) {
					System.out.println(M + " - Simple.");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(M + " - Wonderful.");
			}
			numberOfTestCases--;
		}
	}
}
