/**
 * The Really Neato Calculator Company, Inc. has recently hired your team to help design their Super
 * Neato Model I calculator. As a computer scientist you suggested to the company that it would be neato
 * if this new calculator could convert among number bases. The company thought this was a stupendous
 * idea and has asked your team to come up with the prototype program for doing base conversion. The
 * project manager of the Super Neato Model I calculator has informed you that the calculator will have
 * the following neato features:
 * • It will have a 7-digit display.
 * • Its buttons will include the capital letters A through F in addition to the digits 0 through 9.
 * • It will support bases 2 through 16.
 * Input
 * The input for your prototype program will consist of one base conversion per line. There will be three
 * numbers per line. The first number will be the number in the base you are converting from. It may have
 * leading ‘0’s. The second number is the base you are converting from. The third number is the base you
 * are converting to. There will be one or more blanks surrounding (on either side of) the numbers. There
 * are several lines of input and your program should continue to read until the end of file is reached.
 * Output
 * The output will only be the converted number as it would appear on the display of the calculator.
 * The number should be right justified in the 7-digit display. If the number is to large to appear on the
 * display, then print ‘ERROR’ (without the quotes) right justified in the display.
 * Sample Input
 * 1111000 2 10
 * 1111000 2 16
 * 2102101 3 10
 * 2102101 3 15
 * 12312 4 2
 * 1A 15 2
 * ABCD 16 15
 * 03 13 10
 * Sample Output
 * 120
 * 78
 * 1765
 * 7CA
 * ERROR
 * 11001
 * D071
 * 3
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=&problem=325

import java.math.BigInteger;
import java.util.Scanner;

public class BasicallySpeaking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String numberAsString = input.next();
			int fromBase = input.nextInt();
			int toBase = input.nextInt();
			BigInteger number = new BigInteger(numberAsString, fromBase);
			String numberThatIsPrinted = number.toString(toBase);
			String answer = numberThatIsPrinted.toUpperCase();
			if (numberThatIsPrinted.length() > 7) {
				answer = "ERROR";
			}
			System.out.printf("%7s\n", answer);
		}
	}
}
