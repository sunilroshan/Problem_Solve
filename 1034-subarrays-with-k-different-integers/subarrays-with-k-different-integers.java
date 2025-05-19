class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        

        //it is brute approach
        
        // for(int i = 0; i < nums.length; i++){
        //     HashSet<Integer> st = new HashSet<>();

        //     for(int j = i; j < nums.length; j++){

        //         st.add(nums[j]);

        //         if(st.size() == k){
        //             ct++;
        //         }

        //     }
        // }

        // return ct;

        return func(nums,k) - func(nums,k - 1);
        

        
        
    }

    public static int func(int nums[],int k){

        int ct = 0;
        int l = 0;
        int r = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(r < nums.length){
            
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                int a  = map.get(nums[l]);
                a--;

                if(a == 0){
                    map.remove(nums[l]);
                }
                else{
                    map.put(nums[l],a);
                }
                l++;
            }



            if(map.size() <= k){
                ct += r - l + 1;
            }
            r++;

        }

        return ct;
    }
}