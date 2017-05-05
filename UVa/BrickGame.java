import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BrickGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		int caseNum = 1;
		while (numberOfTestCases != 0) {
			String[] numbersString = input.nextLine().split(" ");
			int numberOfMembers = parseInt(numbersString[0]);
			List<Integer> numbers = new ArrayList<Integer>();
			for (int i = 0; i < numberOfMembers + 1; i++) {
				numbers.add(parseInt(numbersString[i]));
			}
			Collections.sort(numbers);
			System.out.print("Case "
					+ caseNum
					+ ": "
					+ numbers.subList(1, numbers.size()).get(
							numberOfMembers / 2) + "\n");
			numberOfTestCases--;
			caseNum++;
		}
	}
}
