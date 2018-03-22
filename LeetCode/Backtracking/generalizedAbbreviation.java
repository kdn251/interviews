// Write a function to generate the generalized abbreviations of a word.

// Example:
// Given word = "word", return the following list (order does not matter):
// ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]

public class GeneralizedAbbreviation {
    public List<String> generateAbbreviations(String word) {
        List<String> result = new ArrayList<String>();
        
        backtrack(result, word, 0, "", 0);
        
        return result;
    }
    
    void backtrack(List result, String word, int position, String current, int count) {
        if(position == word.length()) {
            if(count > 0) {
                current += count;   
            }
            
            result.add(current);
        } else {
            backtrack(result, word, position + 1, current, count + 1);
            backtrack(result, word, position + 1, current + (count > 0 ? count : "") + word.charAt(position), 0);
        }
    }
}
