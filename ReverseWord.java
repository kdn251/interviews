package main;
//Given an input string, reverse the string word by word.
//For example,
//Given s = "the sky is blue",
//return "blue is sky the".
//tự viết
//Example 1
//Input: String a = "Hello I am Nhi"
//Output: String a1 = "Nhi am I Hello"
//Example 2
//Input: String b = "I Love You"
//Output: String b1 = "You Love I"
//Example 3
//Input: String c = "Sorry"
//Output: String c1 = "Sorry"
//Example 4
//Input: String d = "Thank You"
//Output: String d1 = "You Thank"

public class ReverseWord {
  public static String reverseWords(String s) {
      String[] words = s.trim().split("\\s+");
      String result = "";
      for(int i = words.length - 1; i > 0; i--) {
          result += words[i] + " ";
      }
      
      return result + words[0];
  }
}

