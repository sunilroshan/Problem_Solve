class Solution {
    public int minPathSum(int[][] grid) {

    //     ArrayList<Integer> l = new ArrayList<>();

    //     func(grid,l,0,0,0);

    //     return Collections.min(l);
        
    // }

    // public static void func(int[][] grid, ArrayList<Integer> l, int r,int c,int sum){

    //     if(r < 0 || r == grid.length || c < 0 || c == grid[0].length){
    //         return;
    //     }

    //     if(r == grid.length - 1 && c == grid[0].length - 1){
    //         sum += grid[r][c];
    //         l.add(sum);
    //         return;
    //     }

    //     func(grid,l,r,c + 1,sum + grid[r][c]);
    //     func(grid,l,r + 1,c,sum + grid[r][c]);


          int dp[][] = new int[grid.length][grid[0].length];

            dp[0][0] = grid[0][0]; //Right now, your first row/column fills correctly, but since dp[0][0] is initialized to 0 by default, the sums will be wrong.


          for(int i = 1; i < grid.length; i++){ //row
             
             dp[i][0] = dp[i - 1][0] + grid[i][0];
          }
          for(int j = 1; j < grid[0].length; j++){ //col
             
             dp[0][j] = dp[0][j - 1] + grid[0][j];
          }


          for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j],dp[i][j - 1]);
            }
          }


          return dp[grid.length - 1][grid[0].length - 1];
    }
}