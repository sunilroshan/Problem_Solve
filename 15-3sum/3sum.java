class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      /*  Arrays.sort(nums);

        int n = nums.length;

        HashSet<Integer> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if((nums[i] + nums[j] + nums[k]) == 0 ) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        s.add(temp);
                    }
                }
            }
        }
        ans.add(s);     

        return ans;*/

        //optimized approach

        Arrays.sort(nums);

        //base condition

        if(nums == null || nums.length < 3){
            return new ArrayList<>();    //new learn
        }

        Set<List<Integer>> arr = new HashSet<>();   //new learn
        int left = 0;
        int right = 0;
        int sum = 0;

        for(int i=0; i<nums.length-2; i++){
            sum = 0;
            left = i+1;
            right = nums.length-1;

            while(left < right){

                sum = nums[i]+nums[left]+nums[right];

                if(sum == 0){
                    arr.add(Arrays.asList(nums[i],nums[left],nums[right])); //new learn 
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(arr);
    }
}