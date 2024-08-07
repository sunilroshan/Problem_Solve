class Solution {
    public int countAsterisks(String s) {

        int n = s.length();
        // int astcount = 0;
        // int orcount = 0;

        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == '|'){
        //         orcount++;
        //     }
        //     else{

        //         if(orcount == 0){
        //             if(s.charAt(i) == '*'){
        //                 astcount++;
        //             }                    
        //         }
        //         if(orcount == 2){
        //             orcount = 0;
        //         }
        //     }
            


        // } 
        //it looks like somewhat static 

        int bar = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '|'){
                bar++;
            }
            if(s.charAt(i) == '*' && bar%2 == 0){
                count++;
            }
        }
        

        return count;
        
    }
}