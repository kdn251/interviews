// Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

// Example 1:
// Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
// Return 16
// The two words can be "abcw", "xtfn".

// Example 2:
// Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
// Return 4
// The two words can be "ab", "cd".

// Example 3:
// Given ["a", "aa", "aaa", "aaaa"]
// Return 0
// No such pair of words.

public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        if(words.length == 0 || words == null) {
            return 0;
        }
        
        int length = words.length;
        int[] value = new int[length];
        int max = 0;
        
        for(int i = 0; i < length; i++) {
            String temp = words[i];
            
            value[i] = 0;
            
            for(int j = 0; j < temp.length(); j++) {
                value[i] |= 1 << (temp.charAt(j) - 'a');
            }
        }
        
        
        for(int i = 0; i < length; i++) {
            for(int j = 1; j < length; j++) {
                if((value[i] & value[j]) == 0 && (words[i].length() * words[j].length()) > max) {
                    max = words[i].length() * words[j].length();
                }
            }
        }
        
        return max;
    }
}
