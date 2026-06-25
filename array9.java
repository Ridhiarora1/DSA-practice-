class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0]; // previous Price
        int profit = 0; // profit 

        for(int i =1; i< prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice =  prices[i]; // low price pe buy karna hai 
                profit = Math.max(profit , prices[i] - buyPrice); 
        }
        } 

        return profit; 
        
    }
} 


