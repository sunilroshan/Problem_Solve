class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;

        int size = 0;

        Set<Character> st = new HashSet<>();

        while(end < s.length()){

            char c = s.charAt(end);

            while(st.contains(c)){
                st.remove(s.charAt(start));
                start++;
            }

            st.add(c);
            size = Math.max(size,end - start + 1);
            end++;

            
        }

        return size;
        
    }
}