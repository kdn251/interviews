
/**
 * A number with 30 decimal digits of precision can be represented by a structure type as shown in the
 * examples below. It includes a 30-element integer array (digits), a single integer (decpt) to represent
 * the position of the decimal point and an integer (or character) to represent the sign (+/-).
 * Your task is to write a program to calculate the sum of high-precision numbers.
 * Input
 * The first line contains a positive integer n (1 ≤ n ≤ 100) indicating the number of groups of highprecision
 * numbers (maximum 30 significant digits). Each group includes high-precision numbers (one
 * number in a line) and a line with only 0 indicating the end of each group. A group can contain 100
 * numbers at most.
 * Output
 * For each group, print out the sum of high-precision numbers (one value in a line). All zeros after the
 * decimal point located behind the last non-zero digit must be discarded
 * 
 * Sample Input
 * 4
 * 4.12345678900000000005
 * -0.00000000012
 * 0
 * -1300.1
 * 1300.123456789
 * 0.0000000012345678912345
 * 0
 * 1500.61345975
 * -202.004285
 * -8.60917475
 * 0
 * -218.302869584
 * 200.0000123456789
 * 0
 * 
 * Sample Output
 * 4.12345678888000000005
 * 0.0234567902345678912345
 * 1290
 * -18.3028572383211
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2921


import java.math.BigDecimal;
import java.util.Scanner;

public class HighPrecisionNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfGroups = input.nextInt();
		while (numberOfGroups != 0) {
			BigDecimal sum = BigDecimal.ZERO;
			BigDecimal number = input.nextBigDecimal();
			while (!number.equals(BigDecimal.ZERO)) {
				sum = sum.add(number);
				number = input.nextBigDecimal();
			}
			System.out.println(sum.toPlainString().replaceFirst(
					"\\.0*$|(\\.\\d*?)0+$", "$1"));
			numberOfGroups--;
		}
	}
}
