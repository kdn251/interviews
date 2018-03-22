// Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible results.

// Note: The input string may contain letters other than the parentheses ( and ).

// Examples:
// "()())()" -> ["()()()", "(())()"]
// "(a)())()" -> ["(a)()()", "(a())()"]
// ")(" -> [""]

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        remove(s, result, 0, 0, new char[]{'(', ')'});
        return result;
    }

    public void remove(String s, List<String> result, int last_i, int last_j,  char[] par) {
        for (int stack = 0, i = last_i; i < s.length(); i++) {
            if (s.charAt(i) == par[0]) {
                stack++;
            }

            if (s.charAt(i) == par[1]) {
                stack--;
            }

            if (stack >= 0) {
                continue;
            }
            
            for (int j = last_j; j <= i; j++) {
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])) {
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), result, i, j, par);
                }
            }

            return;
        }
        
        String reversed = new StringBuilder(s).reverse().toString();
        
        if (par[0] == '(')  {
            // finished left to right
            remove(reversed, result, 0, 0, new char[]{')', '('});
        } else {
            // finished right to left
            result.add(reversed);
        }
    }
}
