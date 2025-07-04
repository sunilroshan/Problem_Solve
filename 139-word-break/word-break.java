class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        // // StringBuilder sb = new StringBuilder();
        // String st = "";
        // boolean found = false;
     


        // for(int i = 0; i < s.length(); i++){
        //      found = false;
        //     st += s.charAt(i);

        //     if(wordDict.contains(st)){
        //         found = true;                               
        //         st = "";
        //     }
          
           
        // }

        // return found?true:false;


        //optimal approach using dynamic program

        //covert to hashset for o(1)

        HashSet<String> set = new HashSet<>();
        for(String st : wordDict){
            set.add(s);
        }

        //finding the maximum length of the string in the wordDict for checking in the s in the DP
        int maxlen = 0;
        for(String st : set){
            maxlen = Math.max(maxlen,st.length());
        }

        //creating boolean dp array
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for(int i = 1; i <= n; i++){

            for(int j = i - 1; j >= Math.max(0,(i - maxlen)); j--){

                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];       
        
    }
}