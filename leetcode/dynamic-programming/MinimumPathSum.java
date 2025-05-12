//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right 
//which minimizes the sum of all numbers along its path.
//Note: You can only move either down or right at any point in time.
//Example 1:
//[[1,3,1],
 //[1,5,1],
 //[4,2,1]]
//Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.

class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        for(int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for(int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        
        for(int i = 1; i < grid.length; i++) {
            for(int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        
        return grid[grid.length - 1][grid[0].length - 1];
    }
}

