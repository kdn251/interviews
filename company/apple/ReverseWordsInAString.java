//Given an input string, reverse the string word by word.
//For example,
//Given s = "the sky is blue",
//return "blue is sky the".

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i > 0; i--) {
            result.append(words[i]).append(" ");
        }
        
        return result.append(words[0]).toString();
    }
}

