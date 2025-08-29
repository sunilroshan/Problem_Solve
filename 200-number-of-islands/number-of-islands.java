class Solution {
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int ct = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(grid[i][j] == '1'){

                    ct++;
                    solve(grid,i,j);

                }
            }
        }

        return ct;
        
    }

    public static void solve(char[][] grid, int i , int j){

        int n = grid.length;
        int m = grid[0].length;

        if(i < 0 || i >= n){ //row
            return;
        }
        if(j < 0 || j >= m){ //column
            return;
        }

        if(grid[i][j] == '0'){ //if '0'
            return;
        }

        grid[i][j] = '0'; //visited

        solve(grid,i - 1,j);
        solve(grid,i + 1,j);
        solve(grid,i,j - 1);
        solve(grid,i,j + 1);

    }
}