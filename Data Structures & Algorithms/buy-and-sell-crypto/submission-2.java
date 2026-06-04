class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int buy=prices[l];
        int maxP=0;
        while(r<prices.length){
          if(buy>prices[r]){
            buy=prices[r];
            l=r;
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
