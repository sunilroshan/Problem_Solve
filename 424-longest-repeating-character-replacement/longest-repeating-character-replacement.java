class Solution {
    public int characterReplacement(String s, int k) {

        //the ubarray which has smaller conversion...we need to first find that
        // int arr[] = new int[26];
        // int maxlen = 0;

        // for (int i = 0; i < s.length(); i++) {

        //     int maxfreq = 0;

        //     for (int j = i; j < s.length(); j++) {

        //         arr[s.charAt(j) - 'A']++;
                
        //         maxfreq = Math.max(maxfreq,arr[s.charAt(j) - 'A']);

        //         int conversion = (j - i + 1) - maxfreq;

        //         //here the above lines are the important steps in this problem

        //         if(conversion <= k){
        //             maxlen = Math.max(maxlen,j - i  + 1);
        //         }
        //         else{
        //             break;
        //         }               

        //     }
        // }


        // return maxlen;

        int r = 0;
        int l = 0;

        int maxlen = 0;
        int maxfreq = 0;

        int hash[] = new int[26];

        while(r < s.length()){

            hash[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq,hash[s.charAt(r) - 'A']);

            while((r - l + 1) - maxfreq > k){
                hash[s.charAt(l) - 'A']--;
                // maxfreq = 0;
                // for(int i = 0; i < 26; i++){
                //     maxfreq = Math.max(maxfreq,hash[i]);  //if remove this step ..we will improve complexity
                // }
                l++;

            }

            if((r - l + 1) - maxfreq <= k){
                maxlen = Math.max(maxlen,r - l + 1);
            }
            r++;

        }

        return maxlen;

    }
}