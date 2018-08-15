// Given two sparse matrices A and B, return the result of AB.

// You may assume that A's column number is equal to B's row number.

// Example:

// A = [
//   [ 1, 0, 0],
//   [-1, 0, 3]
// ]

// B = [
//   [ 7, 0, 0 ],
//   [ 0, 0, 0 ],
//   [ 0, 0, 1 ]
// ]


//      |  1 0 0 |   | 7 0 0 |   |  7 0 0 |
// AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
//                   | 0 0 1 |

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int nB = B[0].length;
        int[][] C = new int[m][nB];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(A[i][j] != 0) {
                    for(int k = 0; k < nB; k++) {
                        if(B[j][k] != 0) {
                            C[i][k] += A[i][j] * B[j][k];
                        }
                    }
                }
            }
        }
        
        return C;
    }
}
