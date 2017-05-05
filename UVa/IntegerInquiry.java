import java.math.BigInteger;
import java.util.Scanner;

public class IntegerInquiry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger sum = BigInteger.ZERO;
		while (true) {
			BigInteger number = input.nextBigInteger();
			if (number.equals(BigInteger.ZERO)) {
				break;
			}
			sum = sum.add(number);
		}
		System.out.println(sum);
		input.close();
	}
}
