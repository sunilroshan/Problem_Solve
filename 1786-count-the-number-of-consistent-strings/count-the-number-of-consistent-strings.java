class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean found = false;

        int count = 0;

        for(int i=0; i<words.length; i++){

            found = false;

            String s = words[i];

            for(char c : s.toCharArray()){

                if(allowed.contains(String.valueOf(c))){
                    found = true;                    
                }
                else{
                    found = false;
                    break;
                }
            }

            if(found == true){
                count++;
            }

        }

        return count;
        
    }
}