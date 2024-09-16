class Solution {
    public int longestValidParentheses(String s) {

        int max = 0;

        Stack<Integer> st = new Stack<>();
        
        st.push(-1);  // base 

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            //pushing the index for finding the length of the paranthesis

            if(c == '('){
                st.push(i);
            }
            else{
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int len = i - st.peek();
                    max = Math.max(len,max);
                }
            }
        }

        return max;
        
    }
}