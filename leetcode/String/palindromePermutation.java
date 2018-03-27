public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        char[] characters = new char[256];
        
        for(int i = 0; i < s.length(); i++) {
            characters[s.charAt(i)]++;
        }
        
        int oddCount = 0;
        
        for(int i = 0; i < characters.length; i++) {
            if(!(characters[i] % 2 == 0)) {
                oddCount++;
                
                if(oddCount > 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
