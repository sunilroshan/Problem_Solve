class Solution {
    public int countPairs(List<Integer> nums, int target) {

       int n = nums.size();
       int arr[] = new int[n];

       int j = 0;
       for(int i: nums){
        arr[j] = i;
        j++;
       }

       int k = 0;  //i
       int l = k+1;  //j

       int count = 0;

       while(k < n-1){
        

        int sum = arr[k] + arr[l];
        if(sum < target){
            count++;
        }
        l++;
        if(l == n){
            k++;
            l = k+1;
        }
       }

       return count;
        
    }
}