/**
 * Adam’s parents put up a sign that says “CONGRATULATIONS”. The sign is so big that exactly one
 * letter fits on each panel. Some of Adam’s younger cousins got bored during the reception and decided
 * to rearrange the panels. How many unique ways can the panels be arranged (counting the original
 * arrangement)?
 * Input
 * The first line of input is a single non-negative integer. It indicates the number of data sets to follow.
 * Its value will be less than 30001.
 * Each data set consists of a single word, in all capital letters.
 * Each word will have at most 20 letters. There will be no spaces or other punctuation.
 * The number of arrangements will always be able to fit into an unsigned long int. Note that 12!
 * is the largest factorial that can fit into an unsigned long int.
 * Output
 * For each word, output the number of unique ways that the letters can be rearranged (counting the
 * original arrangement). Use the format shown in Sample Output, below.
 * Sample Input
 * 3
 * HAPPY
 * WEDDING
 * ADAM
 * Sample Output
 * Data set 1: 60
 * Data set 2: 2520
 * Data set 3: 12
 */


//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=1279

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
