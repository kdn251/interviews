// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

// Example:

// [[0,1,0,0],
//  [1,1,1,0],
//  [0,1,0,0],
//  [1,1,0,0]]

// Answer: 16

class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        if(grid == null || grid.length == 0) {
            return perimeter;
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    perimeter += numNeighbors(grid, i, j);
                    return perimeter;
                }
            }
        }

        return perimeter;
    }

    public int numNeighbors(int[][] grid, int x, int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == 0) {
            return 1;
        }

        if(grid[x][y] == -1) {
            return 0;
        }

        grid[x][y] = -1;
        return numNeighbors(grid, x + 1, y) + 
            numNeighbors(grid, x - 1, y) + 
            numNeighbors(grid, x, y + 1) + 
            numNeighbors(grid, x, y - 1);
    }
}
