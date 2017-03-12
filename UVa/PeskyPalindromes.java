// A palindrome is a sequence of one or more characters that reads the same from the left as it does from
// the right. For example, Z, TOT and MADAM are palindromes, but ADAM is not.
// Your job, should you choose to accept it, is to write a program that reads a sequence of strings and
// for each string determines the number of UNIQUE palindromes that are substrings.

// Input
//     The input file consists of a number of strings (one per line), of at most 80 characters each, starting in
//     column 1.

// Output
//     For each non-empty input line, the output consists of one line containing the message:
//     The string 'input string' contains nnnn palindromes.
//     where input string is replaced by the actual input string and nnnn is replaced by the number of
//     UNIQUE palindromes that are substrings.

// Note:
//     See below the explanation of the sample below
//     • The 3 unique palindromes in ‘boy’ are ‘b’, ‘o’ and ‘y’.
//     • The 4 unique palindromes in ‘adam’ are ‘a’, ‘d’, ‘m’, and ‘ada’.
//     • The 5 unique palindromes in ‘madam’ are ‘m’, ‘a’, ‘d’, ‘ada’, and ‘madam’.
//     • The 3 unique palindromes in ‘tot’ are ‘t’, ‘o’ and ‘tot’.

// Sample input
// boy
// adam
// madam
// tot
// Sample output
// The string 'boy' contains 3 palindromes.
// The string 'adam' contains 4 palindromes.
// The string 'madam' contains 5 palindromes.
// The string 'tot' contains 3 palindromes.

import java.util.*;

public class PeskyPalindromes {

    public static void main(String args[]) {

        int x;

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

            String currentString = sc.next();

            List<String> allSubstrings = generateSubstrings(currentString);

            int uniquePalindromes = findUniquePalindromes(allSubstrings);

            System.out.println("The string " + "'" + currentString + "'" + " contains " + uniquePalindromes + " palindromes.");

        }

    }

    public static List<String> generateSubstrings(String s) {

        List<String> allSubstrings = new ArrayList<String>();

        for(int i = 0; i < s.length(); i++) {

            for(int j = i + 1; j <= s.length(); j++) {

                String currentSubstring = s.substring(i, j);

                if(!allSubstrings.contains(currentSubstring)) {

                    allSubstrings.add(currentSubstring);

                }

            }

        }

        return allSubstrings;

    }

    public static int findUniquePalindromes(List<String> allSubstrings) {

        int totalUniquePalindromes = 0;

        for(String s : allSubstrings) {

            int left = 0;
            int right = s.length() - 1;

            boolean isPalindrome = true;

            while(left < right) {

                if(s.charAt(left) != s.charAt(right)) {

                    isPalindrome = false;
                    break;

                }

                left++;
                right--;

            }

            if(isPalindrome) {

                totalUniquePalindromes++;

            }

        }

        return totalUniquePalindromes;

    }





}

