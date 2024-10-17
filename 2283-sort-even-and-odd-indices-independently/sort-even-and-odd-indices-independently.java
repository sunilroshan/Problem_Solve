class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 2; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (nums[i] > nums[j]) {
                    
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        
        for (int i = 1; i < n - 2; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
