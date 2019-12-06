// Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

// For example,
// Given n = 3,

// You should return the following matrix:
// [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
// ]

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        
        if(n == 0) {
            return spiral;
        }
        
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = n -1;
        int number = 1;
        
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart; i <= colEnd; i++) {
                spiral[rowStart][i] = number++;
            }
            
            rowStart++;
            
            for(int i = rowStart; i <= rowEnd; i++) {
                spiral[i][colEnd] = number++;
            }
            
            colEnd--;
            
            for(int i = colEnd; i >= colStart; i--) {
                if(rowStart <= rowEnd) {
                    spiral[rowEnd][i] = number++;
                }
            }
            
            rowEnd--;
            
            for(int i = rowEnd; i >= rowStart; i--) {
                if(colStart <= colEnd) {
                    spiral[i][colStart] = number++;
                }
            }
            
            colStart++;
        }
        
        return spiral;
    }
}
