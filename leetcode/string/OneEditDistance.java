// Given two strings S and T, determine if they are both one edit distance apart.

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        //iterate through the length of the smaller string
        for(int i = 0; i < Math.min(s.length(), t.length()); i++) {
            //if the current characters of the two strings are not equal
            if(s.charAt(i) != t.charAt(i)) {
                //return true if the remainder of the two strings are equal, false otherwise
                if(s.length() == t.length()) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else if(s.length() < t.length()) {
                    //return true if the strings would be the same if you deleted a character from string t
                    return s.substring(i).equals(t.substring(i + 1));
                    
                } else {
                    //return true if the strings would be the same if you deleted a character from string s
                    return t.substring(i).equals(s.substring(i + 1));
                }
            }
        }
        
        //if all characters match for the length of the two strings check if the two strings' lengths do not differ by more than 1
        return Math.abs(s.length() - t.length()) == 1;
    }
}
