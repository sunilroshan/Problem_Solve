//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();

            System.out.println(obj.findSum(s));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
         
         int sum = 0;
         
         int num = 0;
         
         int j = 0;
         
         for(int i = 0; i < s.length(); i++){
            
            if(Character.isDigit(s.charAt(i))){
                num = s.charAt(i) - '0';
                 j = i + 1;
                while(j < s.length() && Character.isDigit(s.charAt(j))){
                    
                        num = num * 10 + (s.charAt(j) - '0');
                        j++;
                    
                   
                }
            sum += num;
            i = j - 1;
            }
            else{
                continue;
            }
            
        }
        return sum;
    }
}