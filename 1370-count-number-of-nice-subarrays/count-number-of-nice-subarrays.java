class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();

        // //initially
        // map.put(0,1);

        // int count = 0; 
        // int sum = 0;

        // for(int i=0; i<n; i++){

        //      sum += nums[i]%2;

        //     if(map.containsKey(sum-k)){

        //         count += map.get(sum-k);

        //     }
        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }

        // return count;

        return func(nums,k) - func(nums,k - 1);
        
    }

    public static int func(int nums[], int k){

        int l = 0;
        int r = 0;
        int ct = 0;
        int sum = 0;

        while(r < nums.length){

            sum += nums[r] % 2;

            while(sum > k && l <= r){
                sum -= nums[l] % 2;
                l++;
            }

            if(sum <= k){
                ct += r - l + 1;
            }
            r++;
        }

        return ct;
    }
}