// Given an Android 3x3 key lock screen and two integers m and n, where 1 ≤ m ≤ n ≤ 9, count the total number of unlock patterns of the Android lock screen, which consist of minimum of m keys and maximum n keys.

// Rules for a valid pattern:
    // Each pattern must connect at least m keys and at most n keys.
    // All the keys must be distinct.
    // If the line connecting two consecutive keys in the pattern passes through any other keys, the other keys must have previously selected in the pattern. No jumps through non selected key is allowed.
    // The order of keys used matters.

// Explanation:
// | 1 | 2 | 3 |
// | 4 | 5 | 6 |
// | 7 | 8 | 9 |
// Invalid move: 4 - 1 - 3 - 6 
// Line 1 - 3 passes through key 2 which had not been selected in the pattern.

// Invalid move: 4 - 1 - 9 - 2
// Line 1 - 9 passes through key 5 which had not been selected in the pattern.

// Valid move: 2 - 4 - 1 - 3 - 6
// Line 1 - 3 is valid because it passes through key 2, which had been selected in the pattern

// Valid move: 6 - 5 - 4 - 1 - 9 - 2
// Line 1 - 9 is valid because it passes through key 5, which had been selected in the pattern.

// Example:
// Given m = 1, n = 1, return 9.

public class AndroidUnlockPatterns {
    public int numberOfPatterns(int m, int n) {
        //initialize a 10x10 matrix
        int skip[][] = new int[10][10];
        
        //initialize indices of skip matrix (all other indices in matrix are 0 by default)
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = skip[2][8] = skip[8][2] = skip[3][7] = skip [7][3] = skip[6][4] = skip[4][6] = 5;
        
        //initialize visited array
        boolean visited[] = new boolean[10];
        
        //initialize total number to 0
        int totalNumber = 0;
        
        //run DFS for each length from m to n
        for(int i = m; i <= n; ++i) {
            totalNumber += DFS(visited, skip, 1, i - 1) * 4; //1, 3, 7, and 9 are symmetric so multiply this result by 4
            totalNumber += DFS(visited, skip, 2, i - 1) * 4; //2, 4, 6, and 8 are symmetric so multiply this result by 4
            totalNumber += DFS(visited, skip, 5, i - 1); //do not multiply by 4 because 5 is unique         
        }
        
        return totalNumber;
    }
    
    int DFS(boolean visited[], int[][] skip, int current, int remaining) {
        //base cases
        if(remaining < 0) {
            return 0;
        }
        
        if(remaining == 0) {
            return 1;
        }
        
        //mark the current node as visited
        visited[current] = true;
        
        //initialize total number to 0
        int totalNumber = 0;
        
        for(int i = 1; i <= 9; ++i) {
            //if the current node has not been visited and (two numbers are adjacent or skip number has already been visited)
            if(!visited[i] && (skip[current][i] == 0 || visited[skip[current][i]])) {
                totalNumber += DFS(visited, skip, i, remaining - 1);
            }
        }
        
        //mark the current node as not visited
        visited[current] = false;
        
        //return total number
        return totalNumber;
    }
}
