//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//How many possible unique paths are there?

class UniquePaths {
    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        
        //only 1 way to get to ith row, 0th column (move down)
        for(int i = 0; i < m; i++){
            map[i][0] = 1;
        }
        
        //only 1 way to get to ith column, 0th row (move right)
        for(int j= 0; j < n; j++){
            map[0][j]=1;
        }
        
        //x ways to get to ith row, jth column (# of ways to get to
        //ith - 1 row, jth column + # of ways to get to jth - 1 column
        //ith column
        for(int i = 1;i < m; i++){
            for(int j = 1; j < n; j++){
                map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }

        return map[m - 1][n - 1];
    }
}
