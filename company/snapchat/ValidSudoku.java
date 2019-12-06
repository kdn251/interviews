//Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules. (http://sudoku.com.au/TheRules.aspx)
//The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//A partially filled sudoku which is valid.

//Note:
//A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> box = new HashSet<Character>();
            for (int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }
                if(board[j][i]!='.' && !columns.add(board[j][i])) {
                    return false;
                }
                int rowIndex = (i / 3) * 3;
                int columnIndex = (i % 3) * 3;
                if(board[rowIndex + j / 3][columnIndex + j % 3] != '.' && !box.add(board[rowIndex + j / 3][columnIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}

