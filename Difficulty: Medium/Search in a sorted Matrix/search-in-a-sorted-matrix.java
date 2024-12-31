//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        
          int n = mat.length;
        int m = mat[0].length;
        
        /* think the sorted matrix as a complete sorted array. the first value is always 0th 
           and last value would be total number of values in sorted matrix. As array has zero 
           based indexing so the last element will be 'total values of matrix(n*m)' - 1.
           Then apply simpe binary search with a start value , end value and a sorted array.
           */
        int l = 0 , r = n*m-1; 
        while(l<=r){
            
            int mid = l + (r-l)/2;
            
            int row = mid / m; // for finding the coordinates in the matrix.
            int col = mid % m;// because it is actually a matrix but we treat it as array.
            
            if(mat[row][col] == x) return true;
            
            if(mat[row][col] < x) l = mid+1;
            else r = mid-1;
            
        }  // Time Complexity : O(log(n*m)).
        
        return false;
    }
}
