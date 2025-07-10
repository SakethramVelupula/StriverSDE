class Solution {
    public int maxProfit(int[] prices) {
       int min=Integer.MAX_VALUE,maxprofit=0;
       for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            maxprofit=Math.max(maxprofit,prices[i]-min);
       } 
       return maxprofit;
    }
}