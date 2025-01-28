class Solution {
    public int strStr(String haystack, String needle) {

       // return haystack.indexOf(needle); 

           
     int n1 = haystack.length();
     int n2 = needle.length();

     for(int i = 0; i < n1; i++){

        if(needle.charAt(0) == haystack.charAt(i)){

            int k = i;
            int j = 0;
            
           while(k < n1 && j < n2){

            if(needle.charAt(j) == haystack.charAt(k)){
                j++;
                k++;
            }
            else{
                break;
            }
           }

           if(j == n2){
            return i;
           }
        }
     } 

     return -1;
        
    }
}