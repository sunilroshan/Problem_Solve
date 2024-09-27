class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

         //1 sec  = 10^7 the digital system can compute
        //here constraint is 10^4 if we solve in O(N^2) is becomes 10 ^8 so we have to solve in O(n)

        int count = 0;

        for(int i = 0; i < flowerbed.length; i++){

            if(flowerbed[i] == 0){

                int prev = (i == 0 || flowerbed[i-1] == 0)?0:1;
                int next = (i == flowerbed.length-1 || flowerbed[i+1] == 0)?0:1;


                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                    
                }
            }
        }
        
      return count >= n;
       
    }
}

    