//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str1 = read.readLine();
            String str2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(str1, str2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        
        int[] freq = new int[26];
        
        String ans = "";
        
        for(int i = 0; i < str2.length(); i++){
            freq[str2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < str1.length(); i++){
            
            if(freq[str1.charAt(i) - 'a'] == 0){
                ans += str1.charAt(i);
            }
        }
        
        return ans;
        
    }
}