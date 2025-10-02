class Solution {
    public int findPairs(int[] nums, int k) {

        //unique pairs--- you can go with hashMap or hashSet

        //nums[i] - nums[j] = k -->formula

        //here we are checking nums[j] + k = nums[i] searching for nums[i]

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        int count = 0;

        for(int i : map.keySet()){

            if(k == 0){

                if(map.get(i) >= 2){
                    count++;
                }

            }
            else if(map.containsKey(i + k)){
                count++;
            }
        }
        
        return count;
    }
}