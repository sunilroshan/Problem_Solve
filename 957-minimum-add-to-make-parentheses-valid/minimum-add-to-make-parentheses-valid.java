class Solution {
    public int minAddToMakeValid(String s) {

       Stack<Character> st = new Stack<>();

       String cl = "";

       for(char c : s.toCharArray()){
          
          if(c == '('){
            st.push(')');
          }
          else if(c == ')'){
            if(!st.isEmpty() && st.peek() == ')'){
                st.pop();
            }
            else{
                cl += c;
            }
          }
       }

       int ans = cl.length() + st.size();
       return ans;
        
    }
}