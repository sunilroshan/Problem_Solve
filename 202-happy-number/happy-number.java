class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();
          
         while(n != 1){ 
            boolean found = false;

            int sum = 0;
            
            while(n != 0){
               
                sum+= Math.pow(n%10,2);
                n=n/10;
            }

            if(sum == 1){
                return true;
                
            }

            n=sum;

            if(seen.contains(sum)){
                return false;
                
            }

            seen.add(sum);

            n = sum;



         }

         return true;

    
    }
}