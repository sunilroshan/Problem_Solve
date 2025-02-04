class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int n = nums.length;
        int maxlength = 1;

        for(int i = 0; i < n - 1; i++){

            int j = i;
            if(nums[j] < nums[j + 1]){

                while(j < n - 1 && nums[j] < nums[j + 1]){
                    j++;
                    maxlength = Math.max(maxlength,j - i + 1);

                }

            }
            else if(nums[j] > nums[j + 1]){

                while(j < n - 1 && nums[j] > nums[j + 1]){
                    j++;
                    maxlength = Math.max(maxlength,j - i + 1);

                }

            }

            
        }

        return maxlength;
        
    }
}