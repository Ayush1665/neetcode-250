class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > min){
                profit = prices[i] - min; 
            }
            if(prices[i] < min) {
                min = prices[i];
            } 
            maxProfit = Math.max(maxProfit, profit);   
        }

        return maxProfit;
    }
}
