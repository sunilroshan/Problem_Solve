class Solution {
    public boolean rotateString(String s, String goal) {

        int n1 = s.length();
        int n2 = goal.length();

        if(n1 != n2){
            return false;
        }

        // char a = goal.charAt(0);

        // for(int i = 0; i < n1; i++){
            
        //     if(s.charAt(i) == a){
                 
        //          int j = i;
        //          int k = 0;

        //          while(j < n1 && k < n2){

        //             if(s.charAt(j) == goal.charAt(k)){
        //                 j++;
        //                 k++;
        //             }
        //             else{
        //                 return false;
        //             }
        //          }
        //     }
        // }

        // return true;

      String newString = s + s;

      return newString.contains(goal);
        
    }
}