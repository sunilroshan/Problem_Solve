class Solution {
    public boolean isHappy(int n) {

        // HashSet<Integer> seen = new HashSet<>();
          
        //  while(n != 1){ 
        //     boolean found = false;

        //     int sum = 0;
            
        //     while(n != 0){
               
        //         sum+= Math.pow(n%10,2);
        //         n=n/10;
        //     }

        //     if(sum == 1){
        //         return true;
                
        //     }

        //     n=sum;

        //     if(seen.contains(sum)){
        //         return false;
                
        //     }

        //     seen.add(sum);

        //     n = sum;



        //  }

        //  return true;



        //you can solve this by cycle linked list because once visited and again it is visited

        int fast = n;
        int slow = n;

      do{
            fast = square(square(fast));
            slow = square(slow);

      }while(slow != fast);
            

            if(slow == 1){
                return true;
            }
            return false;       

    
    }

    public int square(int n){

        int ans = 0;

        while(n > 0){

            int rem = n % 10;
            ans += rem*rem;
            n = n /10;

        }

        return ans;
    }
}