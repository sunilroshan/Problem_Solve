class Solution {
    public int jump(int[] nums) {

        int n = nums.length;

        int dp[] = new int[n];

        Arrays.fill(dp,100000000);

         dp[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--){

            int num = nums[i];

            for(int j = 1; j <= num && i + j < n; j++){
                
                dp[i] = Math.min(dp[i],1 + dp[i + j]);
            }
        }

        return dp[0];
        
    }
}