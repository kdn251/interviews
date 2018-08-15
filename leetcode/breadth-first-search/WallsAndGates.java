// You are given a m x n 2D grid initialized with these three possible values.

// -1 - A wall or an obstacle.
// 0 - A gate.
// INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
// Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

// For example, given the 2D grid:
// INF  -1  0  INF
// INF INF INF  -1
// INF  -1 INF  -1
//   0  -1 INF INF
// After running your function, the 2D grid should be:
//   3  -1   0   1
//   2   2   1  -1
//   1  -1   2  -1
//   0  -1   3   4

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        //iterate through the matrix calling dfs on all indices that contain a zero
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }
    
    void dfs(int[][] rooms, int i, int j, int distance) {
        //if you have gone out of the bounds of the array or you have run into a wall/obstacle, return
        // room[i][j] < distance also ensure that we do not overwrite any previously determined distance if it is shorter than our current distance
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < distance) {
            return;
        }
        
        //set current index's distance to distance
        rooms[i][j] = distance;
        
        //recurse on all adjacent neighbors of rooms[i][j]
        dfs(rooms, i + 1, j, distance + 1);
        dfs(rooms, i - 1, j, distance + 1);
        dfs(rooms, i, j + 1, distance + 1);
        dfs(rooms, i, j - 1, distance + 1);
    }
}
