//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // Read the line of integers (prices)
            String input = br.readLine().trim();

            // Split the input line into integers and store in an array
            String[] tokens = input.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Create an instance of the Solution class
            Solution ob = new Solution();

            // Call the missingNumber method
            int res = ob.missingNumber(arr);

            // Print the result
            System.out.println(res);

            // Print the "~" symbol to match the original output
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        
        
        // int n = arr.length;
        
        // ArrayList<Integer> list = new ArrayList<>();
        
        // for(int i : arr){
        //     list.add(i);
        // }
        
        // for(int i = 1; i <= n+1; i++){   ///failing at last 10 testcases
        //     if(!list.contains(i)){
        //         return i;
        //     }
        // }
        
        // return 0;
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int num = 1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                num++;
            }
        }
        
        return num;
    }
}
