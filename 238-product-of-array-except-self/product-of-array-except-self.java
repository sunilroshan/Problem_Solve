class Solution {
    public int[] productExceptSelf(int[] nums) {



        // failing int the time complexity 
        
       /* int n = nums.length;
        int ans[] = new int[n];

      int i = 0;
      int j = 1;

      while(i < n || j < n ){
          
        int pro = 1;

          for(int k=j; k<n; k++){
            pro *= nums[k];
          }
          if(i != 0){
          for(int l=i-1; l>=0; l--){
            pro *= nums[l];
          }
          }

          ans[i] = pro;
          i++;
          j++;
      }
        return ans;

    }
}*/

int pre[] = new int[nums.length];

pre[0] = 1;

for(int i=1; i<nums.length; i++){

  pre[i] = nums[i-1] * pre[i-1]; 

}

int suff[] = new int[nums.length];

suff[nums.length-1] = 1;

for(int i=nums.length-2; i>=0; i--){

    suff[i] = nums[i+1] * suff[i+1];
}

int res[] = new int [nums.length];

for(int i=0; i<nums.length; i++){

    res[i] = pre[i]*suff[i];
}

return res;
}
}