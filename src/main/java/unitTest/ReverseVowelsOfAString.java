package unitTest;



//Write a function that takes a string as input and reverse only the vowels of a string.

//Example 1:
//Given s = "hello", return "holle".

//Example 2:
//Given s = "leetcode", return "leotcede".

//Note:
//The vowels does not include the letter "y".

/**
 * This is the class containing the function in the 
 * project used to apply the UnitTest technique. 
 * It's in the company's google directory
 * @author DucNA-SE00292x
 *
 */
public class ReverseVowelsOfAString {
	/**
	 * Below is the vowel inversion function.
	 * @param s - This is a String input to method.
	 * @return s - This is return.
	 */ 
	public String reverseVowels(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}

		String vowels = "aeiouAEIOU";

		char[] chars = s.toCharArray();

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			while (start < end && !vowels.
					contains(chars[start] + "")) {
				start++;
			}

			while (start < end && !vowels.
					contains(chars[end] + "")) {
				end--;
			}

			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			start++;
			end--;
		}
		return new String(chars);
	}
}