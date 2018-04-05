//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

//Example:
//Input: "babad"
//Output: "bab"

//Note: "aba" is also a valid answer.

//Example:
//Input: "cbbd"
//Output: "bb"

class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        
        String longestPalindromicSubstring = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                if(j - i > longestPalindromicSubstring.length() && isPalindrome(s.substring(i, j))) {
                    longestPalindromicSubstring = s.substring(i, j);
                }
            }
        }
        
        return longestPalindromicSubstring;
    }
    
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        
        return true;
    }
}
