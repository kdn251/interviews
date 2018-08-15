// The count-and-say sequence is the sequence of integers beginning as follows:
// 1, 11, 21, 1211, 111221, ...

// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n, generate the nth sequence.

// Note: The sequence of integers will be represented as a string.

public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";

        for(int i = 1; i < n; i++) {
            s = helper(s);
        }
        
        return s;
    }
    
    public String helper(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        
        sb.append(count);
        sb.append(c);

        return sb.toString();
    }
}
