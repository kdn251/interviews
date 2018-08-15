// Given a string that contains only digits 0-9 and a target value, return all possibilities to add binary operators (not unary) +, -, or * between the digits so they evaluate to the target value.

// Examples: 
// "123", 6 -> ["1+2+3", "1*2*3"] 
// "232", 8 -> ["2*3+2", "2+3*2"]
// "105", 5 -> ["1*0+5","10-5"]
// "00", 0 -> ["0+0", "0-0", "0*0"]
// "3456237490", 9191 -> []

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<String>();

        if(num == null || num.length() == 0) {
            return result;
        }

        helper(result, "", num, target, 0, 0, 0);
        return result;
    }
    
    public void helper(List<String> result, String path, String num, int target, int pos, long eval, long multed) {
        if(pos == num.length()) {
            if(eval == target) {
                result.add(path);
            }
            
            return;
        }
        
        for(int i = pos; i < num.length(); i++) {
            if(i != pos && num.charAt(pos) == '0') {
                break;
            }

            long cur = Long.parseLong(num.substring(pos, i + 1));

            if(pos == 0) {
                helper(result, path + cur, num, target, i + 1, cur, cur);
            } else {
                helper(result, path + "+" + cur, num, target, i + 1, eval + cur, cur);
                helper(result, path + "-" + cur, num, target, i + 1, eval - cur, -cur);
                helper(result, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur);
            }
        }
    }
}
