class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> ans = new ArrayList<> ();

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;

        while(top <= bottom && left <= right){

            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

              if(top <= bottom){// for array index out of bound you have to remember the duplicate zeros

              // Check if there is still a bottom row to traverse
              

            for(int i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            }

            if(left <= right){
                  // Check if there is still a left column to traverse
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
          
         return ans;
        
    }
}