// Given a 2D board and a word, find if the word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

// For example,
// Given board =

// [
//   ['A','B','C','E'],
//   ['S','F','C','S'],
//   ['A','D','E','E']
// ]
// word = "ABCCED", -> returns true,
// word = "SEE", -> returns true,
// word = "ABCB", -> returns false.

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
