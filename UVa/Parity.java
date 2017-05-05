import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parity {

	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			if (number == 0) {
				break;
			}
			String binaryInString = convertToBinary(number);
			int count = 0;
			for (int i = 0; i < binaryInString.length(); i++) {
				if ("1".equals(binaryInString.charAt(i) + "")) {
					count++;
				}
			}
			System.out.println("The parity of " + binaryInString + " is "
					+ count + " (mod 2).");

		}
	}

	private static String convertToBinary(int number) {
		StringBuilder s = new StringBuilder("");
		while (number != 0) {
			s = s.append(number % 2);
			number = number / 2;
		}
		return s.reverse().toString();
	}
}
