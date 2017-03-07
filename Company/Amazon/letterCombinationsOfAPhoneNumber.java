// Given a digit string, return all possible letter combinations that the number could represent.

// A mapping of digit to letters (just like on the telephone buttons) is given below.

// 2 - abc
// 3 - def
// 4 - ghi
// 5 - jkl
// 6 - mno
// 7 - pqrs
// 8 - tuv
// 9 - wxyz

// Input:Digit string "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public class Solution {

    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> result = new LinkedList<>();
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        if(digits == null || digits.length() == 0) {
            
            return result;
            
        }
        
        result.add("");
        
        for(int i = 0; i < digits.length(); i++) {
            
            int current = Character.getNumericValue(digits.charAt(i));
            
            while(result.peek().length() == i) {
                
                String s = result.remove();
                
                for(char c : mapping[current].toCharArray()) {
                    
                    result.add(s + c);
                    
                }
                
            }
            
        }
        
        return result;
        
    }

}