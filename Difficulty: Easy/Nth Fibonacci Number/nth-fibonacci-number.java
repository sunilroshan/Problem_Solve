// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int[] dp = new int[n + 1];
        
        return fibo(n,dp);
        
    }
    public static int  fibo(int n,int dp[]){
        
        if(n == 0 || n == 1){
            dp[n] = n;
            return n;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        
        int num1 = fibo(n - 1,dp);
        int num2 = fibo(n - 2,dp);
        
        int sum = num1 + num2;
        
        dp[n] = sum;
        return sum;
    }
}