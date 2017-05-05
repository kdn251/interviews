import java.util.Arrays;
import java.util.Scanner;

public class NumberTheoryForNewbies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLong()) {
			String inputValue = input.nextLine();
			StringBuilder minimal = new StringBuilder();
			StringBuilder maximal = new StringBuilder();
			char[] characters = inputValue.toCharArray();
			int length = characters.length;
			Arrays.sort(characters);
			int index;
			for (index = 0; index < length; index++) {
				if (characters[index] != '0') {
					break;
				}
			}
			if (index != 0) {
				characters[0] = characters[index];
				characters[index] = '0';
			}
			for (int i = 0; i < length; i++) {
				minimal.append(characters[i]);
			}
			Arrays.sort(characters);
			for (int i = length - 1; i > -1; i--) {
				maximal.append(characters[i]);
			}
			long maximalNumber = Long.valueOf(maximal.toString());
			long minimalNumber = Long.valueOf(minimal.toString());
			long difference = maximalNumber - minimalNumber;
			System.out.println(maximal + " - " + minimal + " = " + difference
					+ " = 9 * " + (difference / 9));
		}
	}
}
