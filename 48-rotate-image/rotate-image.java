class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < len; i++) {
        int st=0;
        int end=len-1;
            while(st < end){
                 int temp = matrix[i][st];
                 matrix[i][st] = matrix[i][end];
                 matrix[i][end] = temp;
                 st++;
                 end--;
            }
        
        }
    }
}