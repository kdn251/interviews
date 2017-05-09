
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
		input.close();
	}
}
