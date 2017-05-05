import java.util.Scanner;

public class LightMoreLight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		while (number != 0) {
			if (isAPerfectSquare(number)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			number = input.nextLong();
		}
	}

	private static boolean isAPerfectSquare(long number) {
		long squareRoot = (long) Math.sqrt(number);
		return squareRoot * squareRoot == number;
	}

}
