class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int max = 0;
        
        int min = prices[0];

        for(int i=0; i<n; i++){  //if the input is given
             
             if(min < prices[i]){
                 max = Math.max(max,prices[i] - min);
             }
             else{

                 min = prices[i];
             }
        }

        return max;
    }
}