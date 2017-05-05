//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=642

import java.io.IOException;
import java.util.Scanner;

public class ArchaeologistsDilemma {

	public static final boolean DEBUG = true;
	public static final boolean DEBUG_INPUT = true;

	final static double LOG2 = Math.log(2.0);
	final static double LOG2_10 = Math.log(10) / LOG2;

	public static void solve() throws IOException {
		Scanner input = new Scanner(System.in);
		while (true) {
			long N = input.nextLong();
			int k = (N + "").length() + 1;

			long lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
			long upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);

			while (lowerBound == upperBound) {
				k++;
				lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
				upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);
			}

			System.out.println(upperBound);
		}
	}
}
