class Solution {
    public boolean isValid(String s) {
        
  /* char c[] = new char[s.length()];
   int top = -1;

   for(int i=0; i<s.length(); i++){
       if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
           c[++top] = s.charAt(i);
       }
       else{

           if(top >= 0 && ((s.charAt(i) == ')' && c[top] == '(')
            || (s.charAt(i) == '}' && c[top] == '{')
             || (s.charAt(i) == ']' && c[top] == '['))){

                 top--;
             }
             else{
                 return false;  // here it is false
             }
       }
   }
       return top == -1; //here it is true  / it takes as a conditional statement/
   
    }
}*/

   Stack<Character> st = new Stack<>();

   for(int i : s.toCharArray()){

    if(i == '('){
        st.push(')');
    }
    else if(i == '{'){
        st.push('}');
    }
    else if(i == '['){
        st.push(']');
    }
    else if(st.isEmpty() || st.pop() != i){ //initially no opening bracket is pushed yet  st.isEmpty() 
        return false;
    }

   }
   return st.isEmpty();
    }
}


/*// You are using Java
import java.util.*;

class Main{
    public static void main(String[] args){
        
        String s = "((()";
        
        int count = 0;
        
        for(char c : s.toCharArray()){
            
            if(c == '(' || c == '{' || c == '['){
                count++;
            }
            else{
                count--;
            }
        }
        
        if(count == 0){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}*/
