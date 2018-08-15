//Determine whether an integer is a palindrome. Do this without extra space.

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        int num = x;
        int reversed = 0;
        
        while(num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        return x == reversed;
    }
}
