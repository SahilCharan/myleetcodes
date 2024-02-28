class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                // If the price is higher than the previous day, we can make a profit by buying and selling on the same day
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}