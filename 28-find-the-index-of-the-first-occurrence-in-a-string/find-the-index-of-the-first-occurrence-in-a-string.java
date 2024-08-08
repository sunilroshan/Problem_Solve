class Solution {
    public int strStr(String haystack, String needle) {

       // return haystack.indexOf(needle); 

           

       for(int i=0; i<haystack.length(); i++){
        if(haystack.charAt(i) == needle.charAt(0)){

            int k = i;//haystack
            int j = 0;//needle

            while(k<haystack.length() && j<needle.length()
           && haystack.charAt(k) == needle.charAt(j)){
           {

           
                k++;
                j++;
            }
            

            if(needle.length() == j){  //here break statement because we are using the "&&" operator
                return i;
            }
    
            }

        }
       }
       
       return -1;  
        
    }
}