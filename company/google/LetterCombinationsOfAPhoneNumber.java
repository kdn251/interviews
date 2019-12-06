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

class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        
        if(digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        letterCombinationsRecursive(result, digits, "", 0, mapping);
        
        return result;
    }
    
    public void letterCombinationsRecursive(List<String> result, String digits, String current, int index, String[] mapping) {
        if(index == digits.length()) {
            result.add(current);
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++) {
            letterCombinationsRecursive(result, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
