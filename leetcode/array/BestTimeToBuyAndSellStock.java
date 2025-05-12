public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        // Return 0 if there are no prices or only one price (no transaction possible)
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minPrice = prices[0];  // Initialize with the first price
        int maxProfit = 0;  // No profit made at the start

        // Iterate over the prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // Calculate potential profit by selling at the current price and buying at the minimum price
            int potentialProfit = prices[i] - minPrice;
            
            // Update the maximum profit if the potential profit is higher
            maxProfit = Math.max(maxProfit, potentialProfit);
            
            // Update the minimum price if the current price is lower
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return maxProfit;  // Return the maximum profit found
    }
}
