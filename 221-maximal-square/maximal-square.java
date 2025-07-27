class Solution {
    public int maximalSquare(char[][] matrix) {

        int dp[][] = new int[matrix.length][matrix[0].length];


        for(int i = 0; i < matrix.length; i++){
            
            if(matrix[i][0] == '1'){
                
                dp[i][0] = 1;
            }
            else{

                dp[i][0] = 0;
            }
        }

        for(int j = 0; j < matrix[0].length; j++){

            if(matrix[0][j] == '1'){
                
                dp[0][j] = 1;
            }
            else{

                dp[0][j] = 0;
            }
        }


        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){

                if(matrix[i][j] == '1'){



                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j],dp[i][j - 1]),dp[i - 1][j - 1]);
                }
            }
        }

        int ct = Integer.MIN_VALUE;

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                
                if(dp[i][j] > ct){
                    ct = dp[i][j];
                }
            }
        }



        return ct * ct;
        
    }
}