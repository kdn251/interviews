/**
 * Trung is bored with his mathematics homeworks. He takes a piece of chalk and starts writing a sequence
 * of consecutive integers starting with 1 to N (1 < N < 10000). After that, he counts the number of
 * times each digit (0 to 9) appears in the sequence. For example, with N = 13, the sequence is:
 * 12345678910111213
 * In this sequence, 0 appears once, 1 appears 6 times, 2 appears 2 times, 3 appears 3 times, and each
 * digit from 4 to 9 appears once. After playing for a while, Trung gets bored again. He now wants to
 * write a program to do this for him. Your task is to help him with writing this program.
 * Input
 * The input file consists of several data sets. The first line of the input file contains the number of data
 * sets which is a positive integer and is not bigger than 20. The following lines describe the data sets.
 * For each test case, there is one single line containing the number N.
 * Output
 * For each test case, write sequentially in one line the number of digit 0, 1, . . . 9 separated by a space.
 * Sample Input
 * 2
 * 3
 * 13
 * Sample Output
 * 0 1 1 1 0 0 0 0 0 0
 * 1 6 2 2 1 1 1 1 1 1
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3666

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DigitCounting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			int[] numbers = new int[10];
			int number = input.nextInt();
			for (int i = number; i > 0; i--) {
				int j = i;
				while (j != 0) {
					numbers[j % 10]++;
					j = j / 10;
				}
			}
			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(numbers[i]);
			}
			System.out.println();
			numberOfTestCases--;
		}
	}
}
