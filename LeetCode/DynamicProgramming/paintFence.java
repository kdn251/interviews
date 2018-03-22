// There is a fence with n posts, each post can be painted with one of the k colors.

// You have to paint all the posts such that no more than two adjacent fence posts have the same color.

// Return the total number of ways you can paint the fence.

// Note:
// n and k are non-negative integers.

public class PaintFence {
    public int numWays(int n, int k) {
        if(n <= 0) {
            return 0;
        }
        
        int sameColorCounts = 0;
        int differentColorCounts = k;
        
        for(int i = 2; i <= n; i++) {
            int temp = differentColorCounts;
            differentColorCounts = (sameColorCounts + differentColorCounts) * (k - 1);
            sameColorCounts = temp;
        }
        
        return sameColorCounts + differentColorCounts;
    }
}
