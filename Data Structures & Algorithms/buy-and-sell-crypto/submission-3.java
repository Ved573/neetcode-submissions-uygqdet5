class Solution {
    public int maxProfit(int[] prices) {
        int r=1;
        int buy=prices[0];
        int maxP=0;
        while(r<prices.length){
          if(buy>prices[r]){
            buy=prices[r];
          }
          else{

          int profit=prices[r]-buy;
          maxP=Math.max(maxP,profit);
          }
          r++;
        }
        return maxP;
    }
}
