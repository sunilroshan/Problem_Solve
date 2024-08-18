class Solution {
    public int subarraySum(int[] nums, int k) {

        /*int count = 0;

        for(int i=0; i<nums.length; i++){
                     int sum = 0;
            for(int j=i; j<nums.length; j++){
               

                    sum += nums[j];

             
                    if(sum == k){
                        count++;
                    }
                    
           
        }
        }

        return count;*/
        
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0,1);

        for(int i=0; i<n; i++){
            prefix += nums[i];

            if(map.containsKey(prefix-k)){
                count += map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        return count;
        
    }
}