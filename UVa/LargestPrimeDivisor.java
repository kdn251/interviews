import java.util.Scanner;

public class LargestPrimeDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		while (number != 0) {
			number = (long) (Math.abs(number));
			long largestPrimeDivisor = -1;
			int numberOfPrimeDivisors = 0;
			int sqrtOfNumber = (int) (Math.sqrt(number));
			for (int i = 2; i <= sqrtOfNumber; i++) {
				if (number % i == 0) {
					numberOfPrimeDivisors++;
					largestPrimeDivisor = i;
					while (number % i == 0) {
						number = number / i;
					}
				}
			}
			if (largestPrimeDivisor != -1 && number != 1) {
				System.out.println(number);
			} else if (numberOfPrimeDivisors <= 1) {
				System.out.println(-1);
			} else {
				System.out.println(largestPrimeDivisor);
			}
			number = input.nextLong();
		}
	}
}
