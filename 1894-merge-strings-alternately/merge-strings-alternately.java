class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();

        while(i < n1 || j < n2){

            if(i<n1){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<n2){
                sb.append(word2.charAt(j));
                j++;
            }
        }

        String ans = sb.toString();

        return ans;
        
    }
}