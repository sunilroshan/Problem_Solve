class Solution {
    public String decodeString(String s) {

        Stack<Integer> no = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();

        int num = 0;  //for number
        StringBuilder sb = new StringBuilder(); //usage is it will modify the same string

        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){

                num = num * 10 + (c - '0');

            }
            else if(c == '['){
                no.push(num);
                num = 0;
                st.push(sb);
                sb = new StringBuilder();

            }
            else if(c == ']'){
                String str = sb.toString();
                sb = new StringBuilder(str.repeat(no.pop()));
                sb = st.pop().append(sb);

            }
            else{

                sb.append(c);
            }
        }

        return sb.toString();        
    }
}