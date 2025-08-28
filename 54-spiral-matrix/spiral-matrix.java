class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> ans = new ArrayList<> ();

         int rowst = 0, rowend = n - 1;
        int colst = 0, colend = m - 1;

       while (rowst <= rowend && colst <= colend) {
            // Traverse Right
            for (int i = colst; i <= colend; i++) {
                ans.add(matrix[rowst][i]);
            }
            rowst++;

            // Traverse Down
            for (int i = rowst; i <= rowend; i++) {
                ans.add(matrix[i][colend]);
            }
            colend--;

            // Traverse Left (Check if row still exists)
            if (rowst <= rowend) {  //for edge case
                for (int i = colend; i >= colst; i--) {
                    ans.add(matrix[rowend][i]);
                }
                rowend--;
            }

            // Traverse Up (Check if column still exists)
            if (colst <= colend) {//for edge case
                for (int i = rowend; i >= rowst; i--) {
                    ans.add(matrix[i][colst]);
                }
                colst++;
            }
        }

          
         return ans;

        //   while(rowst <= rowend && colst <= colend){
            
        //     for(int i = colst; i < colend; i++){
        //         System.out.print(arr[rowst][i]+" ");
        //     }
        //     rowst++;
            
        //     for(int i = rowst; i < rowend; i++){
        //         System.out.print(arr[i][colend - 1]+" ");
        //     }
        //     colend--;
            
        //     for(int i = colend - 1; i >= colst; i--){
        //         System.out.print(arr[rowend - 1][i]+" ");
        //     }
        //     rowend--;
            
        //     for(int i = rowend - 1; i >= rowst; i--){
        //         System.out.print(arr[i][colst]+" ");
        //     }
        //     colst++;
        
    }
        
    
}