// You want to build a house on an empty land which reaches all buildings in the shortest amount of distance. You can only move up, down, left and right. You are given a 2D grid of values 0, 1 or 2, where:

// Each 0 marks an empty land which you can pass by freely.
// Each 1 marks a building which you cannot pass through.
// Each 2 marks an obstacle which you cannot pass through.
// For example, given three buildings at (0,0), (0,4), (2,2), and an obstacle at (0,2):

// 1 - 0 - 2 - 0 - 1
// |   |   |   |   |
// 0 - 0 - 0 - 0 - 0
// |   |   |   |   |
// 0 - 0 - 1 - 0 - 0
// The point (1,2) is an ideal empty land to build a house, as the total travel distance of 3+3+1=7 is minimal. So return 7.

// Note:
// There will be at least one building. If it is not possible to build such house according to the above rules, return -1.

public class Shortest {
    public int shortestDistance(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        
        final int[] shift = {0, 1, 0, -1, 0};
        
        int rows = grid.length;
        int columns = grid[0].length;
        
        int[][] distance = new int[rows][columns];
        int[][] reach = new int[rows][columns];
        
        int numberOfBuildings = 0;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == 1) {
                    numberOfBuildings++;
                    Queue<int[]> queue = new LinkedList<int[]>();
                    queue.offer(new int[] {i, j});
                    
                    boolean[][] visited = new boolean[rows][columns];
                    
                    int relativeDistance = 1;
                    
                    while(!queue.isEmpty()) {
                        int qSize = queue.size();
                        
                        for(int q = 0; q < qSize; q++) {
                            int[] current = queue.poll();
                            
                            for(int k = 0; k < 4; k++) {
                                int nextRow = current[0] + shift[k];
                                int nextColumn = current[1] + shift[k + 1];
                            
                                if(nextRow >= 0 && nextRow < rows && nextColumn >= 0 && nextColumn < columns && grid[nextRow][nextColumn] == 0 && !visited[nextRow][nextColumn]) {
                                    distance[nextRow][nextColumn] += relativeDistance;
                                    reach[nextRow][nextColumn]++;
                                
                                    visited[nextRow][nextColumn] = true;
                                    queue.offer(new int[] {nextRow, nextColumn});
                                }   
                            }
                        }
                        
                        relativeDistance++;
                    }
                }
            }
        }
    
        int shortest = Integer.MAX_VALUE;
    
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == 0 && reach[i][j] == numberOfBuildings) {
                    shortest = Math.min(shortest, distance[i][j]);
                }
            }
        }
    
        return shortest == Integer.MAX_VALUE ? -1 : shortest;
    }
}
