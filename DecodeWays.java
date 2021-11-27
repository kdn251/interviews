package main;

//A message containing letters from A-Z is being encoded to numbers using the following mapping:

//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//tự viết
//Example 1
//Input: 34
//Output: 1
//Example 2
//Input: 12
//Output: 2
//Example 3
//Input: 16 
//Output: 2 
//Example 4
//Input:299 
//Output: 1
//Example 5
//Input: 53 
//Output: 1

//Given an encoded message containing digits, determine the total number of ways to decode it.

//For example,
//Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

//The number of ways decoding "12" is 2.

public class DecodeWays {
 public static int numDecodings(String s) {
     int n = s.length();

     if(n == 0) {
         return 0;
     }
     
     int[] dp = new int[n + 1];
     dp[n] = 1;
     dp[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;
     
     for(int i = n - 2; i >= 0; i--) {
         if(s.charAt(i) == '0') {
             continue;
         } else {
             dp[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26) ? dp[i + 1] + dp[i + 2] : dp[i + 1];
         }
     }
     
     return dp[0];
 }
}

