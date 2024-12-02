//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");
        
        int n1 = s1.length();
        int n2 = s2.length();
        
        int i = n1 - 1;
        int j = n2 - 1;
        
        int carry = 0;
        
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >=0 || carry == 1){
            
            sum = carry;
            
            if(i >= 0){
                sum += s1.charAt(i) - '0';
                i--;
            }
            
            if(j >= 0){
                sum += s2.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 2);
            carry = (sum / 2);
            
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}