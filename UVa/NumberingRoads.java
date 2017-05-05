import java.util.Scanner;

public class NumberingRoads {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		int caseNumber = 1;
		while (true) {
			int first = input.nextInt();
			int second = input.nextInt();
			if (first == 0 && second == 0) {
				break;
			}
			boolean found = false;
			for (int i = 0; i < 27 && !found; i++) {
				int sum = second + second * i;
				if (sum >= first) {
					System.out.print("Case " + caseNumber + ": " + i + "\n");
					found = true;
				}
			}
			if (!found) {
				System.out.print("Case " + caseNumber + ": impossible\n");
			}
			caseNumber = caseNumber + 1;
		}
	}
}
