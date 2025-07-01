class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp,1000000000);

        dp[0] = 0;
        dp[1] = 1;

        //dp[2]

        for(int i = 2; i <= n; i++){

            for(int j = 1; j*j <= i; j++){

                int ps = j * j;
                int ans = i - ps;
                int op = 1 + dp[ans];

                dp[i] = Math.min(dp[i],op);



            }
        }

        return dp[n];
        
    }
}