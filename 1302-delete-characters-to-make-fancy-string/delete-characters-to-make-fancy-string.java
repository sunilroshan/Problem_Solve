class Solution {
    public String makeFancyString(String s) {

    //    if(s.length() < 3){
    //     return s;
    //    }
    //     StringBuilder sb = new StringBuilder();

    //     for(int i = 0; i < s.length() - 2; i++){
    //         if((s.charAt(i) != s.charAt(i+1)) || (s.charAt(i) != s.charAt(i+2))){
    //              sb.append(s.charAt(i));
    //         }
    //     }

    //     // if(s.length() )

        
    //     sb.append(s.charAt(s.length() - 2));
    //     sb.append(s.charAt(s.length() - 1));

        


    //     String ans = sb.toString();
    //     return ans;

    //good approach but use this

     int n = s.length();
        StringBuilder sb = new StringBuilder();
        if(n < 3){
            return s;
        }
        
            sb.append(s.charAt(0));
            sb.append(s.charAt(1));
            for(int i=2; i<n; i++){
                if(s.charAt(i) != s.charAt(i-1) || s.charAt(i) != s.charAt(i-2)){
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        
    }
}