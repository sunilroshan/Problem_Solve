class Solution {
    public int maxAscendingSum(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int sum = nums[0];

        for(int i = 1; i < n; i++){

            if(nums[i] > nums[i - 1]){
                sum += nums[i];
            }
            else{
                max = Math.max(sum,max);
                sum = 0;
                sum += nums[i];        

            }

        }
            return Math.max(sum,max);

        
    }
}