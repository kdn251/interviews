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
            for(int j = s.length()-1; j >= 0; j--) {
                if(isPalindrome(s.substring(i, j))) {
                    longestPalindromicSubstring = s.substring(i, j);
                    return longestPalindromicSubstring;
                }
            }
        }
        
        return longestPalindromicSubstring;
    }
    
    public boolean isPalindrome(String s) {
      StringBuffer  sb = new StringBuffer(s);

      if(s.equals(sb.reverse().toString())) return true;         
      return false;
    }
}

