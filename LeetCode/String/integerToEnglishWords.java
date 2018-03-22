// Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

// For example,

// 123 -> "One Hundred Twenty Three"
// 12345 -> "Twelve Thousand Three Hundred Forty Five"
// 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

public class IntegerToEnglishWords {
    private final String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private final String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private final String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };
    
    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        
        int i = 0;
        String words = "";
        
        while(num > 0) {
            if(num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            
            num /= 1000;
            i++;
        }
        
        return words.trim();
    }
    
    private String helper(int num) {
        if(num == 0) {
            return "";
        } else if(num < 20) {
            return LESS_THAN_20[num] + " ";
        } else if(num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }
}
