//TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl 
//and it returns a short URL such as http://tinyurl.com/4e9iAk.
//
//Design the encode and decode methods for the TinyURL service. There is no restriction on how your 
//encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL 
//and the tiny URL can be decoded to the original URL.

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(search(board, i, j, w, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public boolean search(char[][] board, int i, int j, char[] w, int index) {
        if(index == w.length) {
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        if(board[i][j] != w[index]) {
            return false;
        }
        
        board[i][j] ^= 256;

        boolean exist = search(board, i + 1, j, w, index + 1) ||
                        search(board, i - 1, j, w, index + 1) ||
                        search(board, i, j + 1, w, index + 1) ||
                        search(board, i, j - 1, w, index + 1);
        board[i][j] ^= 256;

        return exist;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
