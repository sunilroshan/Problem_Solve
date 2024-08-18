class Solution {
    public int subarraysDivByK(int[] nums, int k) {

       int n = nums.length;

        /* int count = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];

            if(sum % k == 0){
                count++;
            }
            }
        }

        return count;
        */

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int pre = 0;
        int count = 0;
        int rem = 0;

        for(int i=0; i<n; i++){
            pre += nums[i];
            rem = pre%k;

            //edge case
            if(rem < 0){
                rem = rem+k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);

        }

        return count;
    }
}