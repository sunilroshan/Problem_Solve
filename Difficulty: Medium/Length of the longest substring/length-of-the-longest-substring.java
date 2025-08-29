// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        
        int l = 0;
        int r = 0;
        
        int max = Integer.MIN_VALUE;
        
        HashSet<Character> st = new HashSet<>();
        
        
        while(r < s.length()){
            
            char c = s.charAt(r);
            
            while(st.contains(c)){
                st.remove(s.charAt(l));
                l++;
            }
            
            st.add(c);
            max = Math.max(max,r - l + 1);
            r++;
        }
        
        return max;
        
    }
}