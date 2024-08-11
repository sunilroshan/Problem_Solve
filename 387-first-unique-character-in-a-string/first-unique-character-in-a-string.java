class Solution {
    public int firstUniqChar(String s) {

        // int n = s.length();

        // for(char i:s.toCharArray()){
        //    int count = 0;
        //     for(int j=0; j<n; j++){
        //         if(i == s.charAt(j)){
        //             count++;
        //         }

        //     }
        //     if(count == 1){
        //         return s.indexOf(i);
        //     }
            
        // }
        // return -1;
        

        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
      
for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}