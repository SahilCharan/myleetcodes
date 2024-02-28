class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];
        for(int price:prices)
        {
            profit = Math.max(profit, price-min);
            min = Math.min(min, price);
        }
        return profit;
    }
}