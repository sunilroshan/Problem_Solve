class Solution {
    public String toLowerCase(String s) {

        // String ans = s.toLowerCase();

        // return ans;

        int n = s.length();
        String result = "";

        for(int i=0; i<n; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){

                result += (char)(s.charAt(i)+32);

            }
            else{
                result+= s.charAt(i);
            }
        }

        return result;
        
    }
}