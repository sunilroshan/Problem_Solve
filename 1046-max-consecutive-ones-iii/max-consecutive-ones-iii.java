class Solution {
    public int longestOnes(int[] nums, int k) {

       // int max = Integer.MIN_VALUE;

        int n = nums.length;

        /*int count = 0;

        for(int i=0; i<n; i++){

            count = 0;
            int l = i;
            int cop = k;

            while(l<n){

                if(nums[l] == 1){
                count++;
                l++;
                }
                else{
                     if(cop != 0){
                    cop--;
                    count++;
                    l++;
                    }
                    else{
                        break;
                    }
                }

            
            }

            max = Math.max(max,count);         
            
        }

        return max;*/

        // this the optimized version

        // int i=0;
        // int zero = 0;
        // int res = 0;

        // for(int j=0; j<n; j++){
        //     if(nums[j] == 0){
        //         zero++;
        //     }
        //     while(zero > k){
        //         if(nums[i] == 0){
        //             zero--;
        //         }
        //         i++;
        //     }
        //     res = Math.max(res,j-i+1);
        // }

        
        // return res;

        int l = 0;
        int r = 0;
        int ct = 0;
        int max = Integer.MIN_VALUE;

        while(r < nums.length){

            if(nums[r] == 0){
                ct++;
            }

            while(ct > k){
                if(nums[l] == 0){
                    ct--;
                }
                l++;
            }

            max = Math.max(max,r - l + 1);
            r++;
        }

        return max;


    }
}