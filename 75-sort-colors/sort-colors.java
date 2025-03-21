class Solution {
    public void sortColors(int[] nums) {

        int z = 0;
        int o = 0;
        int t = 0;

        for(int i = 0 ; i < nums.length; i++){

            if(nums[i] == 0){
                z++;
            }
            else if(nums[i] == 1){
                o++;
            }
            else{
                t++;  
            }
        }

        int j = 0;

        while(j < nums.length){
            
            if(j < z){
                nums[j] = 0;               
            }
            else if(j < z + o){
                nums[j] = 1;
            }
            else{
                nums[j] = 2;
            }
            j++;
        }


      
    }
}