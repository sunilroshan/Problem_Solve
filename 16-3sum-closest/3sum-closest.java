class Solution {
    public int threeSumClosest(int[] nums, int target) {

      /*  Arrays.sort(nums);

        int n = nums.length;
        int sum = 0;

        for(int k=n-1; k>=0; k--){
            int i = 0;
            int j = k-1;
            

            while(i < j){

                sum = nums[i] + nums[j] + nums[k];
                if(sum == target-1 ||
                   sum == target+1 || 
                   sum == target){

                
                    return sum;
                  
                   }
                   else{
                    i++;
                   }


            }
        }

        return sum;   */  

        Arrays.sort(nums);

        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the sum of the first three elements

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return closestSum; 

       
        
    }
}