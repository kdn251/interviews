import java.math.BigInteger;
import java.util.Scanner;

public class SkewBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			BigInteger number = input.nextBigInteger();
			if (number.equals(BigInteger.ZERO)) {
				break;
			}
			int length = (number + "").length();
			BigInteger sum = BigInteger.ZERO;
			for (int i = 0; i < length; i++) {
				BigInteger mod10 = number.mod(BigInteger.TEN);
				BigInteger insideBrackets = BigInteger.valueOf((long) (Math
						.pow(2, i + 1) - 1));
				sum = sum.add((mod10).multiply(insideBrackets));
				number = number.divide(BigInteger.TEN);
			}
			System.out.println(sum);
		}
		input.close();
	}
}
