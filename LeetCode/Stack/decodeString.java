// Given an encoded string, return it's decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

// Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

public class DecodeString {
    public String decodeString(String s) {
        //declare empty string
        String decoded = "";
        
        //initialize stack to hold counts
        Stack<Integer> countStack = new Stack<Integer>();
        
        //initalize stack to hold decoded string
        Stack<String> decodedStack = new Stack<String>();
        
        //initialize index to zero
        int index = 0;
        
        //iterate through entire string
        while(index < s.length()) {
            //if the current character is numeric...
            if(Character.isDigit(s.charAt(index))) {
                int count = 0;
                
                //determine the number
                while(Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                
                //push the number onto the count stack
                countStack.push(count);
            } else if(s.charAt(index) == '[') {
                //if the current character is an opening bracket
                decodedStack.push(decoded);
                decoded = "";
                index++;
            } else if(s.charAt(index) == ']') {
                //if the current character is a closing bracket
                StringBuilder temp = new StringBuilder(decodedStack.pop());
                int repeatTimes = countStack.pop();
                
                for(int i = 0; i < repeatTimes; i++) {
                    temp.append(decoded);
                }
                
                decoded = temp.toString();
                index++;
            } else {
                //otherwise, append the current character to the decoded string
                decoded += s.charAt(index);
                index++;
            }
        }
        
        //return the decoded string
        return decoded;
    }
}
