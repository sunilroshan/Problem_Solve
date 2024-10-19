class Solution {
    public String longestPalindrome(String s) {

        if(s.length() <= 1){
            return s;
        }
        String LPS = "";

        for(int i = 1; i < s.length(); i++){

            //for odd;
            int low = i;
            int high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
                
            }

            String palin = s.substring(low+1,high);

            if(LPS.length() < palin.length()){
                LPS = palin;
            }


            //for even;
             low = i - 1;
              high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
                
            }

            palin = s.substring(low+1,high);

            if(LPS.length() < palin.length()){
                LPS = palin;
            }
        }

        return LPS;        
        
    }
}