class Solution {
    public int climbStairs(int n) {
        
        if(n == 1){
            return 1;    //actually n=1 it will create a 1 way
        }
        
        int dp[] = new int[n+1];

        
         dp[1] = 1;
         dp[2] = 2;//without this i can't do the other process,so both have to assign first


        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-1];
        }

        return dp[n];
    }
}