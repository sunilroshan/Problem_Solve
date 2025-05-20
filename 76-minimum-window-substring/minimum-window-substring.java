class Solution {
    public String minWindow(String s, String t) {

        // int minlen = Integer.MAX_VALUE;
        // int stindex = -1;

        // for(int i = 0; i < s.length(); i++){
        //         int ct = 0;
        // int hash[] = new int[256]; //256 for both uppercase & lowercase letter
        // for (int k = 0; k < t.length(); k++) {
        //     hash[t.charAt(k)]++; //
        // }

        //     for(int j = i; j < s.length(); j++){

        //         if(hash[s.charAt(j)] > 0){
        //             ct++;
        //         }

        //         hash[s.charAt(j)]--;

        //         if(ct == t.length()){
        //             minlen = Math.min(minlen,j - i + 1);
        //             stindex = i;
        //             break;

        //         }

        //     }
        // }

        // return stindex == -1 ? "" : s.substring(stindex, stindex + minlen);

        int l = 0, r = 0, ct = 0;
        int minlen = Integer.MAX_VALUE;
        int stindex = -1;

        int[] hash = new int[256];
        for (int k = 0; k < t.length(); k++) {
            hash[t.charAt(k)]++;
        }

        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0) {
                ct++;
            }

            hash[s.charAt(r)]--;

            while (ct == t.length()) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    stindex = l;
                }

                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    ct--;
                }

                l++;
            }

            r++;
        }

        return stindex == -1 ? "" : s.substring(stindex, stindex + minlen);

    

    }
}