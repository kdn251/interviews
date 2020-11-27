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
        for(int i = s.length()-1; i >=0; i--) {
            for(int j = 0; j < s.length()-i; j++) {
                if(isPalindrome(s.substring(j, j+i))) {
                    longestPalindromicSubstring = s.substring(j, j+i);
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

