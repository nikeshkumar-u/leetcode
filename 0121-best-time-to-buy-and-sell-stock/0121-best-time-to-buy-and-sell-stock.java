class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int min_price = prices[0];
        int max_profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else {
                int current_profit = prices[i] - min_price;
                if (current_profit > max_profit) {
                    max_profit = current_profit;
                }
            }
        }
        
        return max_profit;
    }
}