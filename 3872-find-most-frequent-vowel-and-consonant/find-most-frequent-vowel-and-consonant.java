class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')){
                vow.put(s.charAt(i),vow.getOrDefault(s.charAt(i), 0) + 1);
            }
            else{

                con.put(s.charAt(i),con.getOrDefault(s.charAt(i), 0) + 1);
            }
        } 


        int maxv = 0;

        for(int i : vow.values()){

            maxv = Math.max(maxv,i);
        }

        int maxc = 0;

        for(int i : con.values()){

            maxc = Math.max(maxc,i);
        }

        return maxv + maxc;
        
    }
}