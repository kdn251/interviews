/**
 * A particle has initial velocity and acceleration. If its velocity after certain time is v then what will its
 * displacement be in twice of that time?
 * Input
 * The input will contain two integers in each line. Each line makes one set of input. These two integers
 * denote the value of v (−100 ≤ v ≤ 100) and t (0 ≤ t ≤ 200) (t means at the time the particle gains
 * that velocity)
 * Output
 * For each line of input print a single integer in one line denoting the displacement in double of that time.
 * Sample Input
 * 0 0
 * 5 12
 * Sample Output
 * 0
 * 120
 */

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
