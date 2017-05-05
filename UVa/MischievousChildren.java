import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MischievousChildren {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfCases = input.nextInt();
		int currentCase = 1;
		while (numberOfCases != 0) {
			String line = input.next();
			int numberOfLetters = line.length();
			Map<Character, Integer> letterCounter = new HashMap<Character, Integer>();

			for (int i = 0; i < numberOfLetters; i++) {
				char c = line.charAt(i);
				if (letterCounter.containsKey(c)) {
					int previousOccurrences = letterCounter.get(c);
					letterCounter.replace(c, previousOccurrences + 1);
				} else {
					letterCounter.put(c, 1);
				}
			}
			String lineWithoutDuplicates = "";
			for (int i = 0; i < numberOfLetters; i++) {
				char c = line.charAt(i);
				if (!lineWithoutDuplicates.contains(c + "")) {
					lineWithoutDuplicates = lineWithoutDuplicates + c;
				}
			}
			long nFactorial = computeFactorial(numberOfLetters);
			for (int i = 0; i < letterCounter.size(); i++) {
				char c = lineWithoutDuplicates.charAt(i);
				int numberOfOccurrences = letterCounter.get(c);
				if (numberOfOccurrences != 1) {
					long currentProduct = computeFactorial(numberOfOccurrences);
					nFactorial = nFactorial / currentProduct;
				}
			}
			System.out.println("Data set " + currentCase + ": " + nFactorial);
			currentCase++;
			numberOfCases--;
		}
	}

	private static long computeFactorial(int number) {
		long product = 1;
		for (int i = 2; i < number + 1; i++) {
			product = product * i;
		}
		return product;
	}

}
