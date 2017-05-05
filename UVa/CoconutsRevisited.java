import java.util.Scanner;

public class CoconutsRevisited {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		int i, rez, j;
		boolean isValid;
		while (true) {
			isValid = false;
			int num = input.nextInt();
			if (num == -1) {
				break;
			}
			for (i = (int) (Math.sqrt(num) + 1); i > 1; i--) {
				rez = num;
				for (j = 0; j < i && rez % i == 1; j++) {
					rez = rez - rez / i - 1;
				}
				if (rez % i == 0 && i == j) {
					isValid = true;
					break;
				}
			}
			if (isValid) {
				System.out.println(num + " coconuts, " + i
						+ " people and 1 monkey");
			} else {
				System.out.println(num + " coconuts, no solution");
			}
		}

	}
}
