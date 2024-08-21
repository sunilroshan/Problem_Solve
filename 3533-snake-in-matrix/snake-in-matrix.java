class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int grid[][] = new int[n][n];
       
       int i=0;
       int j=0;

        int snake = 0;
        grid[0][0] = 0;

                for(String str : commands){
                    if(str.equals("UP") && i > 0){
                        i--;
                      grid[i][j] = (i * n) + j;
                      snake =  grid[i][j];
                      
                      
                    }
                    else if(str.equals("RIGHT") && j < n-1){
                        j++;
                         grid[i][j] = (i * n) + j;
                        snake = grid[i][j];
                        
                    }
                    else if(str.equals("DOWN") && i < n-1){
                        i++;
                        grid[i][j] = (i * n) + j;
                        snake = grid[i][j];
                                           
                    }
                    else if(str.equals("LEFT") && j > 0){
                        j--;
                         grid[i][j] = (i * n) + j;
                        snake =  grid[i][j];
                        
                    }
                }
        
          return snake;
    }
}