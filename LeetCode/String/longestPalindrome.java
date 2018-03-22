public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), (int)(s.charAt(i)));
            } else {
                map.remove(s.charAt(i));
                count++;
            }
        }
        
        return map.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
