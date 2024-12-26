//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {

        int n = mat.length;

        int m = mat[0].length;

 

        boolean[] rows = new boolean[n];

        boolean[] cols = new boolean[m];

 

        // First pass to record the rows and columns that need to be zeroed

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < m; col++) {

                if (mat[row][col] == 0) {

                    rows[row] = true;

                    cols[col] = true;

                }

            }

        }

 

        // Second pass to set the matrix to zero where needed

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < m; col++) {

                if (rows[row] || cols[col]) {

                    mat[row][col] = 0;

                }

            }

        }

       
    }
}