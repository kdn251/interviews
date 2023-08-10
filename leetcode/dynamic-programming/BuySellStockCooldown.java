/* There's an array of stocks and you have to maximize profit selling a stock with cooldown:
  where cooldown is defined as after you sell your stock, you cannot buy stock on the next day 
  Can buy/sell multiple times, but must rest a day after selling. No simultaneous transactions is allowed */

class BuySellStockCooldown {
  
    // recursive solution giving TLE
    public static int maxProfit(int[] prices) {
        return solve(prices, 0, 1);
    }
    public static int solve(int[] p, int i, int buy){
        if(i>=p.length) return 0;
        if(buy==1){
            return Math.max(-p[i]+solve(p,i+1,0),solve(p,i+1,1));
        }
        return Math.max(p[i]+solve(p,i+2,1),solve(p,i+1,0));/* we will simply leave one day after selling the stock i.e. instead calling solve(p,i+1,1) 
                                                      we will call solve(p,i+2,1)*/
    }
  
    /* recursive + memoization solution 
      defining dp array outside so that we have not to pass it in function calls*/
    Integer[][] dp;
    public static int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2];
        return solve(prices, 0, 1);
    }
    public static int solve(int[] p, int i, int buy){
        if(i>=p.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        if(buy==1){
            return dp[i][buy] = Math.max(-p[i]+solve(p,i+1,0),solve(p,i+1,1));
        }
        return  dp[i][buy] = Math.max(p[i]+solve(p,i+2,1),solve(p,i+1,0));
    }

  
    public static void main(String[] args){
        int[] prices = {1,3,2,0,4}; /*this will give the profit as 6 as buying on day 1 and selling on day 2 will profit (3-1=2) 
                                        and the next day is cooldown and then buying on day 4 and selling on day 5 will profit (4-0=4) 
                                            hence total profit is 2+4=6 */
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
