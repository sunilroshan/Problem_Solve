class Solution {
    public int splitArray(int[] nums, int k) {

        int low = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            low = Math.max(low,nums[i]);

        }
        
        int high = 0;

        for(int i = 0; i < nums.length; i++){
            
            high += nums[i];
        }


    //     for(int i = low; i <= high; i++){

    //         int sp = solve(nums,i);

    //         if(sp == k){
    //             return i;
    //         }
    //     }

    //     return -1;
    // }

    while(low <= high){

        int mid = (high + low) / 2;

        int nostud = solve(nums,mid);

        if(nostud > k){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }

    }

        return low;
    }

    public static int solve(int arr[],int low){

        int sum = 0;
        int st = 1;

        for(int i = 0; i < arr.length; i++){

            if(sum + arr[i] > low){
                st++;
                sum = arr[i];
                
            }
            else{

                sum += arr[i];
            }

        }
        return st;        
    }

    
}