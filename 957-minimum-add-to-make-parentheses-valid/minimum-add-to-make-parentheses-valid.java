class Solution {
    public int minAddToMakeValid(String s) {

       Stack<Character> st = new Stack<>();

       int close = 0;

       for(char c : s.toCharArray()){
          
          if(c == '('){
            st.push(')');
          }
          else if(c == ')'){
            if(!st.isEmpty() && st.peek() == ')'){
                st.pop();
            }
            else{
                close++;
            }
          }
       }

       int ans = close + st.size();
       return ans;
        
    }
}