//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
    
       int n = arr.length;
       
       int c0 = 0, c1 = 0, c2 = 0;
       
       for(int i = 0; i < n; i++){
           if(arr[i] == 0){
               c0++;
           }
           else if(arr[i] == 1){
               c1++;
           }
           else{
               c2++;
           }
           
       }
       
       int in = 0;
       
       for(int i = 1; i <= c0; i++){
           arr[in] = 0;
           in++;
       }
       for(int i = 1; i <= c1; i++){
           arr[in] = 1;
           in++;
       }
       for(int i = 1; i <= c2; i++){
           arr[in] = 2;
           in++;
       }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends