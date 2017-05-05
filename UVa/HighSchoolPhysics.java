//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1012

import java.util.Scanner;

public class HighSchoolPhysics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		while (!"".equals(line)) {
			String[] numbers = line.split(" ");
			int v = Integer.valueOf(numbers[0]);
			int t = Integer.valueOf(numbers[1]) * 2;
			System.out.println(v * t);
			line = input.nextLine();
		}
	}
}
