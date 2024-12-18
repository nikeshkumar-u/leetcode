class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit and update maxProfit
            else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}