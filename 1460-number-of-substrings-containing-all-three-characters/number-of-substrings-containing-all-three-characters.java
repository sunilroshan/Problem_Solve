class Solution {
    public int numberOfSubstrings(String s) {

        //brute approach

        int n = s.length();
        // int ct = 0;

        // for(int i = 0; i < n; i++){

        //     HashSet<Character> st = new HashSet<>();

        //     for(int j = i; j < n; j++){
        //         st.add(s.charAt(j));

        //         if(st.size() == 3){   //can be optimized in one step forward ie( ct = ct + n - j)
        //             ct++;
        //         }
        //     } 
        // }
        
        // return ct;


        //optimized approach

        //reversing of inner loop

        int lastseen[] = new int[3];
        Arrays.fill(lastseen,-1);
        int ct = 0;

        for(int i = 0; i < n; i++){

            lastseen[s.charAt(i) - 'a'] = i;

            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1){
                ct += 1 + Math.min(lastseen[0],(Math.min(lastseen[1],lastseen[2])));
            }
        }

        return ct;
    }
}