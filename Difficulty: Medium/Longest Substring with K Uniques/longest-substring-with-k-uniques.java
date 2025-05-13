//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // brute approach
        
        int maxlen = -1;
        
        // for(int i = 0; i < s.length(); i++){
            
        //     HashSet<Character> st = new HashSet<>();
            
        //     for(int j = i; j < s.length(); j++){
                
        //         st.add(s.charAt(j));
                
        //         if(st.size() > k){
        //             break;
        //         } 
        //         else if(st.size() == k){
                    
        //             maxlen = Math.max(maxlen,j - i + 1);
        //         }
        //     }
        // }
        
        // return maxlen;
        
        int l = 0;
        int r = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(r < s.length()){
            
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            
            while(map.size() > k){
                int a = map.get(s.charAt(l));
                a--;
                
                if(a == 0){
                    map.remove(s.charAt(l));
                }
                else{
                    map.put(s.charAt(l), a);
                }
                l++;
            }
            
            if(map.size() == k){
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        
        return maxlen;
    }
}