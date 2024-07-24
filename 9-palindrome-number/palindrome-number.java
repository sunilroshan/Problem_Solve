class Solution {
    public boolean isPalindrome(int x) {
       /* int y = x;
        int rev = 0;
         
         while(x > 0){
             int digit = x%10;
             rev = rev*10+digit;
             x = x/10;
         }
         if(y == rev) 
         return true;
         else 
         return false;*/

        String s = String.valueOf(x);
         int n = s.length();

         for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
         }
         return true;
    }
}