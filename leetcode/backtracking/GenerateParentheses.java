//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//[
  //"((()))",
  //"(()())",
  //"(())()",
  //"()(())",
  //"()()()"
//]

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generateParenthesisRecursive(result, "", 0, 0, n);
        
        return result;
    }
    
    public void generateParenthesisRecursive(List<String> result, String current, int open, int close, int n) {
        if(current.length() == n * 2) {
            result.add(current);
            return;
        }
        
        if(open < n) {
            generateParenthesisRecursive(result, current + "(", open + 1, close, n);
        }
        
        if(close < open) {
            generateParenthesisRecursive(result, current + ")", open, close + 1, n);
        }
    }
}
